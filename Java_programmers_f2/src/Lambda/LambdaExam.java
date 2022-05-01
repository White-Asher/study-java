package Lambda;

public class LambdaExam {
    public static void main(String[] args) {

        // 메소드만 전달할 수 있다면, 좀더 편리하게 프로그래밍할 수 있을텐데,
        // 자바는 메소드만 전달할 수 있는 방법은 없었기 때문에
        // 매번 객체를 생성해서 매개변수로 전달해야 했다.
        // 이런 부분을 해결한 것이 람다표현식이다.

        //객체 생성하여 메소드 호출
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10;i++){
                    System.out.println("hello");
                }
            }
        }).start();

        //람다식 사용용
       new Thread(()->{
            for(int i =0; i<10; i++){
                System.out.println("hello");
            }
        }).start();
    }
}
