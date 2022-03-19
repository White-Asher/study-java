package chapter_7_Problem;

class B{
    void averageScore(double...i){
        double sum = 0;
        for(int j=0;j<i.length;j++){
            sum = sum + i[j];
        }
        System.out.println(sum/i.length);
    }
}

public class problem5 {
    public static void main(String[] args) {
        B b = new B();
        b.averageScore(1);
        b.averageScore(1,2);
        b.averageScore(1,2,3);
        b.averageScore(1,2,3,4);
    }

}
