package j_Stacktrace.a_getStackTrace;

import java.util.Arrays;

public class getStackTrace {
    static void main(String[] args) {
        try {
            int[] arr = new int[2];
            arr[5] = 10;
        } catch (Exception cause) {
            StackTraceElement[] elements = cause.getStackTrace();
            Arrays.stream(elements)
                    .forEach(element -> System.err.printf("%s:%d>> %s() \n",
                        element.getFileName(),
                        element.getLineNumber(),
                        element.getMethodName()
                        )
                    );
        }
    }
}
