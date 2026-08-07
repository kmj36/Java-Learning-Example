package o_JavaIOStream.k_directoryTraversal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class directoryTraversal {
    static void main(String[] args) throws IOException {
        Path p = Path.of("src");;

        try(Stream<Path> lists = Files.list(p)) {
            lists.forEach(System.out::println);
        }

        try(Stream<Path> lists = Files.walk(p)) {
            lists.forEach(System.out::println);
        }
    }
}
