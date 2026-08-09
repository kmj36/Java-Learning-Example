package p_JavaFilesandAPIs.b_FileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRead {
    static void main(String[] args) throws IOException {
        String FilePath = "src/p_JavaFilesandAPIs/temp.txt";
        Path p = Path.of(FilePath);

        // BufferedReader

        try(BufferedReader Br = new BufferedReader(new FileReader(FilePath))) {
            int data;

            System.out.println("[BufferedReader]");
            while((data = Br.read()) != -1) {
                System.out.printf("%c", data);
            }
            System.out.println();
        }

        System.out.println();

        // Files.readAllBytes(path)
        try {
            byte[] data = Files.readAllBytes(p);

            System.out.println("[Files.readAllBytes(path)]");
            System.out.println(new String(data, StandardCharsets.UTF_8));
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
