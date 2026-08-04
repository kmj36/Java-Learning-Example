package j_Stacktrace.b_printStackTrace;

import java.io.PrintWriter;
import java.io.StringWriter;

class printStackTrace_w {
    static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.print(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);

            e.printStackTrace(pw);
            String traceAsString = sw.toString();

            System.out.print("trace: " + traceAsString);
        }
    }
}
