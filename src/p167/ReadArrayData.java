package p167;
import java.util.Arrays;
public class ReadArrayData {
    public static void main(String[] args) {
        int[] array = new int[] {3,4,5,6,7};
        System.out.println(array.length);
        System.out.println(array[0] + " ");
        System.out.println(array[1] + " ");
        System.out.println(array[2] + " ");
        System.out.println(array[3] + " ");
        System.out.println(array[4] + " ");
        System.out.println();

        for(int i = 0;i<array.length;i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();

        for(int k: array){
            System.out.println(k + " ");
        }
        System.out.println();

        System.out.println(array);

    }
}
