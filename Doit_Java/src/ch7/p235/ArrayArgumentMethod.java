package ch7.p235;
import java.util.*;
import java.lang.*;
public class ArrayArgumentMethod {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3};
        System.out.println((a).getClass());
        printArray(a);
        System.out.println((Arrays.toString(a)).getClass());

    }
    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }
}
