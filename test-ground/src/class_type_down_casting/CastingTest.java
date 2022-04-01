package class_type_down_casting;

class Person{
    String name;
    public Person(String name){
        this.name = name;
    }
    void abc(){}
}
class Student extends Person {
    String grade;
    public Student(String name){
        super(name);
    }
    void bcd(){}
}
public class CastingTest {
    public static void main(String[] args) {
        Person person = new Student("testName"); // 업캐스팅

//        person.bcd();  ERROR!
        Student student = (Student) person; // 다운캐스팅

        student.name = "han";
        student.grade = "A";
        student.abc();
        student.bcd();
    }
}
