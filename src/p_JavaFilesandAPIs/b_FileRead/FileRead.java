package p_JavaFilesandAPIs.b_FileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FileRead {
    static void main(String[] args) throws IOException {
        String FilePath = "src/p_JavaFilesandAPIs/temp.txt";
        Path p = Path.of(FilePath);

        // BufferedReader
        try(BufferedReader Br = new BufferedReader(new FileReader(FilePath))) {
            String line;

            System.out.println("[BufferedReader.read()]");
            while((line = Br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
        }

        // Files.readAllBytes(path)
        try {
            byte[] data = Files.readAllBytes(p);

            System.out.println("[Files.readAllBytes(path)]");
            System.out.println(new String(data, StandardCharsets.UTF_8));
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Files.lines(path)
        try(Stream<String> lines = Files.lines(p)) {
            System.out.println("[Files.lines(path)]");
            lines.forEach((line) -> {
                System.out.println(line);
            });
            System.out.println();
        }

        // Files.readAllLines(path)
        try {
            System.out.println("[Files.readAllLines(path)]");
            List<String> list = Files.readAllLines(p);
            for(String line : list) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("[Files.readString(path)]");
            String fileText = Files.readString(p);
            System.out.print(fileText);
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}