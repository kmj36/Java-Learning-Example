package oop.n_Interface.f_defaultMethod;

import java.io.File;
import java.nio.file.Path;

class Resource {
    private File resource;

    public File getResource() {
        return resource;
    }

    public void setResource(File resource) {
        this.resource = resource;
    }
}

interface ResourceLoader {
   // 추상 메서드: 반드시 구현해야 함
    Resource load(String resourcePath);

    // default 메서드: 구현체가 없어도 인터페이스가 기본 동작을 제공
    default Resource load(Path resourcePath) {
        Resource source = new Resource();
        File f = new File(resourcePath.toUri());

        source.setResource(f);
        return source;
    }
}

public class defaultMethod {
    static void main() {
        ResourceLoader r = new ResourceLoader() {
            @Override
            public Resource load(String resourcePath) {
                Resource source = new Resource();
                File f = new File(resourcePath); // String -> File 직접 생성
                source.setResource(f);
                return source;
            }
        };

        // 1) 추상 메서드 구현 사용
        Resource byString = r.load("data/sample.txt");
        System.out.println("String 경로로 로드: " + byString.getResource());

        // 2) 인터페이스가 제공하는 default 메서드 사용 (별도 구현 없이 바로 호출 가능)
        Resource byPath = r.load(Path.of("data/sample.txt"));
        System.out.println("Path 경로로 로드: " + byPath.getResource());
    }
}