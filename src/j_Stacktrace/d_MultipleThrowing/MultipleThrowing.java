package j_Stacktrace.d_MultipleThrowing;

import java.util.Arrays;

public class MultipleThrowing {
    static void throwingFromFinally() {
        RuntimeException original = null;
        try {
            throw new RuntimeException("Exception from try");
        } catch (RuntimeException e) {
            original = e;
            throw e;
        } finally {
            RuntimeException fromFinally = new RuntimeException("Exception from finally");
            if (original != null) {
                fromFinally.addSuppressed(original);
            }
            throw fromFinally;
        }
    }

    static void main(String[] args) {
        try {
            throwingFromFinally();
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e);
            System.out.println("Root exception: " + e.getCause());
            System.out.println("Suppressed exceptions: " + Arrays.toString(e.getSuppressed()));
        }
    }
}
