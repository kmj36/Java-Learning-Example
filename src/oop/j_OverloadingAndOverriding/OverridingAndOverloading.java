package oop.j_OverloadingAndOverriding;

import java.util.Arrays;

class Processor { // 오버로딩
    public void process(int i, int j) {
        System.out.printf("Processing two integers:%d, %d", i, j);
    }

    public void process(int[] ints) {
        System.out.println("Adding integer array:" + Arrays.toString(ints));
    }

    public void process(Object[] objs) {
        System.out.println("Adding integer array:" + Arrays.toString(objs));
    }
}

class MathProcessor extends Processor { // 오버라이딩
    @Override
    public void process(int i, int j) {
        System.out.println("Sum of integers is " + (i + j));
    }

    @Override
    public void process(int[] ints) {
        int sum = 0;
        for (int i : ints) sum += i;
        System.out.println("Sum of integer array elements is " + sum);
    }
}

public class OverridingAndOverloading {
    static void main() {
        Processor mp = new MathProcessor(); // 다형성
        mp.process(new int[]{1,2,3,4,5,6,7,8,9,10});
        mp.process(50,5);
    }
}