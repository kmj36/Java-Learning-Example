package o_JavaIOStream.j_nioFileWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileWriter {
    static void main(String[] args) throws IOException {
        Path path1 = Path.of("output1.txt");
        Path path2 = Path.of("output2.txt");

        // 1. 문자열 전체를 한 번에 쓰기
        String content = "안녕하세요.\n자바 NIO 예제입니다.";
        Files.writeString(path1, content);

        // 2. 줄 단위 리스트를 쓰기
        List<String> listOfLines = List.of(
                "첫 번째 줄",
                "두 번째 줄",
                "세 번째 줄"
        );
        Files.write(path2, listOfLines);

        System.out.println("쓰기 완료!");
    }
}
