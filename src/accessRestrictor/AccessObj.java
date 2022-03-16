package accessRestrictor;

public class AccessObj {
//    모든 접근을 허용, 가장 넓은 의미
    public int p = 3;

//      같은 패키지인 경우 접근허용, 다른 패키지라도 상속을 받은 경우 접근 허용
    protected  int p2 = 4;

//    default접근 지정자를 가졌다(아무것도 적지않음). 자기 자신과 같은 패키지 내에서 접근 가능
    int k =7;

    //    자기 자신만 접근 가능
    private  int i =5;

}
