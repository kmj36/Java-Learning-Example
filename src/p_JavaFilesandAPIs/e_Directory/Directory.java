package p_JavaFilesandAPIs.e_Directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

public class Directory {
    static void main(String[] args) throws IOException {

        Path path = Path.of("src/p_JavaFilesandAPIs/TestDirectory");

        // Files.exists(path) 파일/디렉터리 존재 확인.
        boolean isExist = Files.exists(path);

        if(isExist)
            System.out.print("TestDirectory 디렉터리.");
        else
            Files.createDirectories(path);

        // Files.createFile(), Files.createDirectories()
        Path helloWorld = Path.of(path + "/Codes/helloWorld");
        Path helloWorldFile = Path.of(helloWorld + "/helloWorld.java");

        Files.createDirectories(helloWorld);
        Files.createFile(helloWorldFile);
        Files.writeString(helloWorldFile, "static void main(String[] args) {\n" +
                "\tSystem.out.println(\"Hello, World!\");\n" +
                "}");

        // Files.delete()
        Path TargetFolder = Path.of(path + "/DeleteTarget");
        Files.createDirectory(TargetFolder);
        Files.delete(TargetFolder);

        // Files.move(src, dst);
        Path moveFolder = Path.of(path + "/MoveTest");
        Path sourceFolder = Files.createDirectories(Path.of(moveFolder +"/Programming"));

        Files.move(sourceFolder, Path.of(moveFolder +"/Develop"));

        // Files.list(dir), Files.walk(dir)
        try(Stream<Path> lists = Files.list(path)) {
            lists.forEach(System.out::println);
        }

        try(Stream<Path> lists = Files.walk(path)) {
            lists.forEach(System.out::println);
        }

        // Files.createTempFile(), Files.createTempDirectory()
        Files.createTempFile(path, "temp", ".txt");
        Files.createTempDirectory(path, "tempdir");

        // 정리
        try(Stream<Path> allPath = Files.walk(path)) {
            System.out.println("[디렉터리/파일 정리]");

            allPath.sorted(Comparator.reverseOrder()).forEach((deleteTarget) -> {
                System.out.println(deleteTarget);
                try {
                    Files.delete(deleteTarget);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
