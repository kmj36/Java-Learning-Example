package j_Stacktrace.b_printStackTrace;

class printStackTrace {
    static void main(String[] args) {
        try {
            int[] a = new int[2];
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
