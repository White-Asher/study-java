package class_type_up_casting;
class Person{
    String name;
    public Person(String name) {
        this.name = name;
    }
}
class Student extends Person{
    String age;
    public Student(String name) {
        super(name);
    }
}
public class CastingTest {
    public static void main(String[] args) {
        // student 참조변수를 이용하면 age, name에 접근 가능하다.
        Student student = new Student("재윤재윤");
        // person 참조변수를 이용하면 Student 객체의 멤버 중에서 Person 클래스의 멤버에만 접근이 가능하다.
        Person person = student; // "업 캐스팅"
//        Person person = new Person("test");
        person.name = "JYJY";
        System.out.println(person.name);
//        person.age = "26"; // 컴파일 오류 ~!
    }
}