package j_Stacktrace.e_logging;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class logging {
    static void main(String[] args) throws IOException {
        Handler handler = new FileHandler("log/OutFile.log", true);
        Logger logger = Logger.getLogger("j_Stacktrace.e_logging");
        logger.addHandler(handler);

        try {
            int[] arr = new int[10];
            System.out.print(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            StackTraceElement[] elements = e.getStackTrace();
            Arrays.stream(elements).forEach(element ->
                    logger.log(Level.WARNING,
                            () -> String.format("%s:%d>> %s()",
                                    element.getFileName(),
                                    element.getLineNumber(),
                                    element.getMethodName())
                            )
            );
        }
    }
}
