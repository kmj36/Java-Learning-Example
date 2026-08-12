package p_JavaFilesandAPIs.f_zipAndInmemoryFileSystem;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class zipAndInMemoryFileSystem {
    static void main(String[] args) {
        try (FileSystem fs = FileSystems.newFileSystem(Path.of("src/p_JavaFilesandAPIs/f_zipAndInmemoryFileSystem/Temp.zip"))) {
            System.out.print(Files.readString(fs.getPath("/A/A.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
