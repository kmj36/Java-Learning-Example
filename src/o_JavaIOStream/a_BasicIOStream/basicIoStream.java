package o_JavaIOStream.a_BasicIOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class basicIoStream {
    static void main(String[] args) throws IOException {
        InputStream in = System.in;

        try (OutputStream out = new FileOutputStream("output.txt")) {
            System.out.println("텍스트 입력 후 Ctrl+D 로 종료.");

            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }

            System.out.println("저장 완료.");
        }
    }
}
