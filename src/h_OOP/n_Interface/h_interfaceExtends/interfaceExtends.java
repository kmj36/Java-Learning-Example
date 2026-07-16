package h_OOP.n_Interface.h_interfaceExtends;

interface HasColor {
    String getColor();
    void setColor(String color);
}

interface Box extends HasColor {
    int getHeight();
    int getWidth();

    void setHeight(int height);
    void setWidth(int width);
}

public class interfaceExtends {
    static void main() {
        Box b = new Box() {
            private int height = 0;
            private int width = 0;
            private String color = "";

            @Override
            public int getHeight() {
                return height;
            }

            @Override
            public int getWidth() {
                return width;
            }

            @Override
            public void setHeight(int height) {
                this.height = height;
            }

            @Override
            public void setWidth(int width) {
                this.width = width;
            }

            @Override
            public String getColor() {
                return color;
            }

            @Override
            public void setColor(String color) {
                this.color = color;
            }
        };

        b.setHeight(500);
        b.setWidth(400);
        b.setColor("red");

        System.out.printf("height: %d, width: %d, color: %s", b.getHeight(), b.getWidth(), b.getColor());
    }
}
