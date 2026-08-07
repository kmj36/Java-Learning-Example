package o_JavaIOStream.c_CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("input.txt");
             FileWriter writer = new FileWriter("output.txt")) {

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

            System.out.println("텍스트 복사 완료!");
        }
    }
}
