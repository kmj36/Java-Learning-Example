package o_JavaIOStream.i_nioFileRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class JavaNIO {
    static void main(String[] args) throws IOException {
        Path path = Path.of("input.txt");

        String content = Files.readString(path);
        List<String> lines = Files.readAllLines(path);

        System.out.println(content);
        System.out.println(lines);

        try (Stream<String> streamLines = Files.lines(path)) {
            streamLines.forEach(System.out::println);
        }
    }
}
