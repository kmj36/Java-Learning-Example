package o_JavaIOStream.f_DataInputStreams;

import java.io.*;

public class DataInputStreams {
    static void main(String[] args) throws IOException {
        // 쓰기
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream("data.bin"))) {
            out.writeInt(25);
            out.writeDouble(178.5);
            out.writeBoolean(false);
            out.writeUTF("테스트");
        }

        // 읽기
        try(DataInputStream in = new DataInputStream(new FileInputStream("data.bin"))) {
            int age = in.readInt();
            double height = in.readDouble();
            boolean isStudent = in.readBoolean();
            String name = in.readUTF();

            System.out.println("이름: " + name);
            System.out.println("나이: " + age);
            System.out.println("키: " + height);
            System.out.println("학생 여부: " + isStudent);
        }
    }
}
