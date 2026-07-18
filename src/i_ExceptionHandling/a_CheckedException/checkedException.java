package i_ExceptionHandling.a_CheckedException;

import java.io.File;
import java.io.FileReader;

public class checkedException {
    static void main(String[] args) {
        File file = new File("E://file.txt");
        //FileReader fr = new FileReader(file); // 컴파일 에러 발생. 처리되지 않은 예외: java.io.FileNotFoundException
    }
}
