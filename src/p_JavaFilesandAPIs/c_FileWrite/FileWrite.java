package p_JavaFilesandAPIs.c_FileWrite;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class FileWrite {
    static void main(String[] args) throws IOException {

        // Files.writeString(path, "")
        try {
            String FilePath = "src/p_JavaFilesandAPIs/write.txt";
            Path path = Path.of(FilePath);
            Files.writeString(path, "테스트 내용");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Files.write(path, byteArray)
        try {
            String sourcePath = "src/p_JavaFilesandAPIs/photo.jpg";
            Path srcPath = Path.of(sourcePath);

            byte[] imageByteStream = Files.readAllBytes(srcPath);

            String destinationPath = "src/p_JavaFilesandAPIs/photo_copy.jpg";
            Path dstPath = Path.of(destinationPath);

            Files.write(dstPath, imageByteStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Files.write(path, listOfLines)
        try {
            List<String> loremList = List.of("Lorem", "ipsum", "dolor", "sit", "amet");

            String filePath = "src/p_JavaFilesandAPIs/lorem_ipsum.txt";
            Path path = Path.of(filePath);

            Files.write(path, loremList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
