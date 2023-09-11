import java.util.Scanner;

public class CalcReDo {
    public static void main(String[] args) {
        float a, b;
        String c;
        double d;
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULATOR");
        System.out.println("The available operations are:'+','-','*','/'.");

        System.out.println("Enter your first number:");
        a = sc.nextFloat();
        System.out.println("Enter your second number:");
        b = sc.nextFloat();
        System.out.println("Enter your operation");
        c = sc.next();

        switch(c){
            case "+":
                d = a + b;
                System.out.println("The result is" + d);
                break;
            case "-":
                d = a - b;
                System.out.println("The result is" + d);
                break;
            case "*":
                d = a * b;
                System.out.println("The result is" + d);
                break;
            case "/":
                d = a / b;
                System.out.println("The result is" + d);
                break;
            default:
                System.out.println("The input is invalid.");
        }
    }
}
