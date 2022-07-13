package customExceptionTest;

public class SignUp {
    public static void main(String[] args) throws AgeException {
        SignUpClass signUp = new SignUpClass();

        System.out.println("회원가입을 시작합니다~");

        signUp.setAge(-5);

    }
}

class SignUpClass {
    public void setAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException();
        }
    }
}

class AgeException extends Exception {
    AgeException() {}

    AgeException(String message) {
        super(message);
    }
}