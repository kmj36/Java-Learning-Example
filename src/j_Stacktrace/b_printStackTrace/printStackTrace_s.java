package j_Stacktrace.b_printStackTrace;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class printStackTrace_s {
    static void main(String[] args) throws IOException {
        try {
            int[] a = new int[2];
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            File f = new File("./exception.log");
            if(!f.exists())
                f.createNewFile();
            FileOutputStream fos = new FileOutputStream("./exception.log");
            PrintStream ps = new PrintStream(fos);
            e.printStackTrace(ps);
        }
    }
}
