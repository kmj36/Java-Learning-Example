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
        Boolean isExist = Files.exists(path);

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


    }
}
