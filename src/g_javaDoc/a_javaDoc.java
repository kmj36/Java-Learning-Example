/*
package javaDoc;

public class a_javaDoc {

    */
/**
     * Prints an integer and then terminate the line.  This method behaves as
     * though it invokes <code>{@link #print(int)}</code> and then
     * <code>{@link #println()}</code>.
     *
     * @param x  The <code>int</code> to be printed.
     *//*

    public void println(int x) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }

    */
/**
     * Prints a String and then terminate the line. This method behaves as
     * though it invokes <code>{@link #print(String)}</code> and then
     * <code>{@link #println()}</code>.
     *
     * @param x  The <code>String</code> to be printed. If <code>x</code> is
     *           <code>null</code>, then the string <code>"null"</code> is printed.
     *//*

    public void println(String x) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }

    */
/**
     * Prints a boolean value and then terminate the line. This method behaves
     * as though it invokes <code>{@link #print(boolean)}</code> and then
     * <code>{@link #println()}</code>.
     *
     * @param x  The <code>boolean</code> to be printed.
     *//*

    public void println(boolean x) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }

    */
/**
     * Adds two integers together and returns the result.
     *
     * @param a  the first <code>int</code> to add.
     * @param b  the second <code>int</code> to add.
     * @return   the sum of <code>a</code> and <code>b</code>.
     * @throws ArithmeticException if the result overflows an <code>int</code>.
     * @see #println(int)
     * @since 1.0
     *//*

    public int add(int a, int b) {
        return Math.addExact(a, b);
    }

}*/
