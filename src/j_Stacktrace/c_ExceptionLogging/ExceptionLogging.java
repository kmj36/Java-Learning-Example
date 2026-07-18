package j_Stacktrace.c_ExceptionLogging;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionLogging {
    static void main(String[] args) throws IOException {
        try {
            int[] arr = new int[]{1,2,3,4,5};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            File logDir = new File("log");
            if (!logDir.exists()) {
                logDir.mkdirs();
            }

            Handler handler = new FileHandler("log/OutFile.log", true);
            Logger logger = Logger.getLogger("j_Stacktrace.c_ExceptionLogging");
            logger.addHandler(handler);

            StackTraceElement[] elements = e.getStackTrace();
            Arrays.stream(elements).forEach(
                    element -> logger.log(
                            Level.WARNING,
                            () -> new MessageFormat("{0}:{1}>> {2}()\n")
                                    .format(new Object[]{
                                            element.getFileName(),
                                            element.getLineNumber(),
                                            element.getMethodName()
                                    })
                    )
            );
            handler.close();
        }
    }
}
