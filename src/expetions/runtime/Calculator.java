package expetions.runtime;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        try {
            System.out.println("line 4" + 1/0);
        }catch (ArithmeticException e){
            System.out.println("line 4 error");
            e.printStackTrace();
        }
        System.out.println("line 5");
        System.out.println("line 6");
        System.out.println("line 7");

    }
}
