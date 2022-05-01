package Lambda;

public class CompareExam {
    public static void exec(Compare compare){
        int k = 10;
        int m = 20;
        int value = compare.com(k, m);
        System.out.println(value);
    }
    public static void main(String[] args) {
        exec((v1, v2) -> {
            return v1 - v2;
        });
    }
}
