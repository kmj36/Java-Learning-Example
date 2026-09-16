package r_collections.d_Map.j_properties;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class properties {
    static void main(String[] args) {
        Properties props = new Properties();

        props.setProperty("host", "127.0.0.1");
        props.setProperty("port", "5432");
        props.setProperty("name", "project2");

        // 파일로 저장
        //Path file = Path.of("app.properties");
        //try (OutputStream out = Files.newOutputStream(file)) {
        //    props.store(out, "DB Config");
        //} catch (IOException e) {
        //    throw new RuntimeException(e);
        //}

        // 파일로 읽기
        /*try(InputStream in = Files.newInputStream(Path.of("app.properties"))) {
            props.load(in);
            System.out.println("불러온 설정 : " + props);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println(props);
    }
}
