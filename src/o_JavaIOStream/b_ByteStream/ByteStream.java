package o_JavaIOStream.b_ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("photo.jpg");
             FileOutputStream out = new FileOutputStream("photo_copy.jpg")) {
            byte[] buffer = new byte[1024];
            int length;

            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }

            System.out.println("이미지 복사 완료!");
        }
    }
}
