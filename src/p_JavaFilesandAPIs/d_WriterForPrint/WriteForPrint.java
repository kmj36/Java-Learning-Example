package p_JavaFilesandAPIs.d_WriterForPrint;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteForPrint {
    static void main(String[] args) {

        // PrintWriter
        try (PrintStream ps = new PrintStream(new FileOutputStream("src/p_JavaFilesandAPIs/PrintStream.txt"))) {
            ps.println("- PrintStream -");
            ps.println("Hello, World!");
            ps.printf("숫자: %d, 실수: %.2f%n", (int) Math.pow(2.0, 8.0), Math.random());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Files.newBufferedWriter()
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("src/p_JavaFilesandAPIs/newBufferedWriter.txt"))) {
            bw.write(65);
            bw.write(65);
            bw.write(65);
            bw.newLine();

            bw.write(66);
            bw.write(66);
            bw.write(66);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
