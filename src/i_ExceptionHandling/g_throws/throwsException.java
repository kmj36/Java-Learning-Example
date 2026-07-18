package i_ExceptionHandling.g_throws;

import java.io.FileReader;
import java.io.IOException;

class CustomFile {
    static void readFile(String filename) throws IOException {
        try (FileReader file = new FileReader(filename)) {
            int data;
            while ( (data = file.read()) != -1 ) {
                System.out.print((char) data);
            }
        }
    }
}

public class throwsException {
    static void main(String[] args) {
        try {
            CustomFile.readFile("E:\\file.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
