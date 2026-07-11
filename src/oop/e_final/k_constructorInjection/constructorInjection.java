package oop.e_final.k_constructorInjection;

class Config {
    // 상수: static + final, 대문자+언더스코어 네이밍
    public static final int MAX_RETRY = 3;

    // 불변에 가까운 필드: private + final, 생성자에서만 할당
    private final String appName;

    public Config(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return appName;
    }
}


public class constructorInjection {
    static void main() {
        Config c = new Config("constructorInjection.java");
        System.out.print(c.getAppName());
    }
}
