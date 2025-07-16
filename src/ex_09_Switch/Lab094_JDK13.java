package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int itemcode = 6;

        switch (itemcode) {
            case 1, 2, 5 -> {
                System.out.println("All of them are electronic gadgets");
                System.out.println("All of them are electronic gadgets");
                System.out.println("All of them are electronic gadgets");
            }
            case 4, 6, 7 -> {
                System.out.println("This is a mechanical gadget");
                System.out.println("This is a mechanical gadget");
                System.out.println("This is a mechanical gadget");
            }
            default -> System.out.println("None");

        }
    }
}
