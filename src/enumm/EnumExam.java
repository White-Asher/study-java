package enumm;

public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        gender1 = "boy";
// 이처럼 gender1에 female, male을 넣고 싶은데 string인 boy도 입력 가능하다.. 이때 쓰는것이 enum
        Gender gender2;
        gender2 =  Gender.MALE;
        gender2 = Gender.FEMALE;
//      gender2 = "boy";


    }
    enum Gender{
        FEMALE, MALE;
    }
//    특정 값만 가져다가 쓰고싶다면 열거형(enum)을 사용하자
}
