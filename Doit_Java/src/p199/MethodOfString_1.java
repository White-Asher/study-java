package p199;

import java.util.Arrays;
public class MethodOfString_1 {
    public static void main(String[] args) {
        String str1 = "Hello java!";
        String str2 = "Hi there!";
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();

        System.out.println(str1.charAt(1));
        System.out.println(str2.charAt(1));
        System.out.println();

        System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str1.indexOf('a',8));
        System.out.println(str1.lastIndexOf('a',8));
        System.out.println(str1.indexOf("java"));
        System.out.println();

        String str3 = String.valueOf(2.3);
        String str4 = String.valueOf(false);
        System.out.println(str3);
        System.out.println(str4);

        String str5 = str3.concat(str4);

        System.out.println(str5);

        String str6 = "안녕" +3;
        String str7 = "안녕".concat(String.valueOf(3));

        String str8 = "Hello Java!";
        String str9 = "Hi there!";

        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        char[] array3 = str8.toCharArray();
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}
