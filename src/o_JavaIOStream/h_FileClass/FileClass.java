package o_JavaIOStream.h_FileClass;

import java.io.File;

public class FileClass {
    static void main(String[] args) {
        File file = new File("photo_copy.jpg");

        if(!file.exists()) {
            System.out.printf("'%s' 파일이 없습니다.\n", file.getName());
            return;
        }

        System.out.println("절대 경로: " + file.getAbsolutePath());
        System.out.println("파일 크기(byte): " + file.length());
        System.out.println("읽기 가능: " + file.canRead());
        System.out.println("쓰기 가능: " + file.canWrite());
        System.out.println("디렉터리 여부: " + file.isDirectory());

        // 이름 변경
        File renamed = new File("test_renamed.txt");
        if (file.renameTo(renamed)) {
            System.out.println("이름 변경 완료: " + renamed.getName());
        }

        // 디렉터리 생성 및 목록 조회
        File dir = new File("myFolder");
        dir.mkdir();
        File[] contents = new File(".").listFiles();
        if (contents != null) {
            for (File f : contents) {
                System.out.println(" - " + f.getName());
            }
        }

        // 삭제
        renamed.delete();
        dir.delete();
    }
}
