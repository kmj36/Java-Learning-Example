package e_loop;

public class a_loop {
    public static void main() {
        int i;

        for(i = 0 ; i < 3 ; i++) {
            System.out.println(i);
        }

        System.out.println();

        i = 0;
        while(i < 4) {
            System.out.println(i);
            i++;
        }

        System.out.println();

        i = 100;
        do {
            System.out.println(i);
        } while (i < 1);

        System.out.println();

        int[] numbers = {1,2,3,4,5};
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println();

        for (i = 1; i <= 10; ++i) {
            if (i == 5) break;
            System.out.println(i);
        }

        System.out.println();

        first:
        for (i = 1; i < 5; i++) {
            for (int j = 1; j < 3; j++) {
                System.out.printf("%d %d\n", i, j);
                if (i == 2) break first;
            }
        }

        System.out.println();

        for (i = 1; i <= 10; ++i) {
            if (i > 4 && i < 9) continue;
            System.out.println(i);
        }
    }
}
