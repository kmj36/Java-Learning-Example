package p_JavaFilesandAPIs.a_Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class nioPath {
    static void main(String[] args) throws IOException {
        Path thisPath = Path.of("src/p_JavaFilesandAPIs");
        Path tempTextPath = Path.of(thisPath + "/temp.txt");

        Path fileGet = Paths.get(tempTextPath.toUri());

        System.out.println(Files.readString(fileGet));
    }
}
