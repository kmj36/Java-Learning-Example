package o_JavaIOStream.e_BufferedStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreams {
    static void main(String[] args) throws IOException {
        String fileName = "input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
