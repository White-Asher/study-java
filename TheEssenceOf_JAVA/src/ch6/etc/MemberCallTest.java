package ch6.etc;

class MemberCallTest {
    int iv = 10; // 인스턴스 변수
    static int cv = 20; // 클래스 변수

    int iv2 = cv;
//    static int cv2 = iv; // 에러!. 클래스 변수는 인스턴스 변수를 사용할 수 없음.
    static int cv3 = cv; // 클래스 변수는 클래스 변수를 당연히 사용할 수 있다.

    // 만약 인스턴스 변수를 사용하고 싶다면 객체 생성하여 사용해야 한다.
    static int cv2 = new MemberCallTest().iv2;
    static int cv4 = MemberCallTest.cv;

    static void staticMethod1(){
        System.out.println(cv);
//        System.out.println(iv);  // 에러!. 클래스 메서드에서 인스턴스 변수 사용할 수 없음

        // 클래스 메서드에서 인스턴스 변수를 사용하려면 객체를 먼저 생성해야 함
        MemberCallTest c = new MemberCallTest();
        System.out.println(c.iv);
    }
    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2(){
        staticMethod1();
//        instanceMethod1();// 에러!. 클래스 메서드에서는 인스턴스 메서드를 호출 할 수 없음

        // 클래스 메서드에서 인스턴스 메서드를 사용하려면 객체 먼저 생성해야 함
        MemberCallTest c = new MemberCallTest();
        c.instanceMethod1();
    }

    void instanceMehtod2(){

        // 인스턴스 메서드에서는 인스턴스 메서드와 클래스메서드
        // 모두 객체(인스턴스) 생성없이 바로 호출 가능
        staticMethod1();
        instanceMethod1();
    }
}

