package switchTest;

public class testClass {
    public static void main(String[] args) {
        int itemcode = 004;

        String val = switch (itemcode) {
            case 001 -> "It's a laptop!";
            case 002 -> "It's a desktop!";
            case 003,004 -> "It's a mobile phone!";
            default -> throw new IllegalStateException("Unexpected value: " + itemcode);
        };
        System.out.println(val);
    }
}
