package classtest;
import java.util.Random;
import java.util.Scanner;
public class ClassTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String USER = "Aarambha";
        String PASS = "12345!";
        System.out.print("Enter username: ");
        String username = scan.nextLine();
        System.out.print("Enter password: ");
        String password = scan.nextLine();
        if (username.equals(USER) && password.equals(PASS)) {
            System.out.println("Welcome");
            System.out.println("What task do u want me to do?");
            System.out.println("1.Calculator");
            System.out.println("2.Guessing Game");
            int tool = scan.nextInt();
            switch (tool) {
                case 1:
                    System.out.println("Calculator");
                    System.out.print("Enter Operation (+,-,*,/): ");
                    String operation = scan.next();
                    System.out.print("First Number: ");
                    double firstno = scan.nextDouble();
                    System.out.print("Second Number: ");
                    double secondno = scan.nextDouble();
                    double num1, num2;
                    double great = Math.max(firstno, secondno);
                    if (great == firstno) {
                        num1 = firstno;
                        num2 = secondno;
                    } else if (great == secondno) {
                        num2 = firstno;
                        num1 = secondno;
                    } else {
                        num1 = firstno;
                        num2 = secondno;
                    }
                    switch (operation) {
                        case "+":
                            System.out.println("The sum is: " + (firstno + secondno));
                            break;
                        case "-":
                            System.out.println("The difference is: " + (num1 - num2));
                            break;
                        case "*":
                            System.out.println("The result is: " + (num1 * num2));
                            break;
                        case "/":
                            System.out.println("The division is: " + (num1 / num2));
                            break;

                        default:
                            System.out.println("Operation Invalid");
                    }
                    break;

                case 2:
                    Random random = new Random();
                    int targetNumber = random.nextInt(10);
                    System.out.println("You chose guessing game!");
                    System.out.println("Enter your guess 1-9:");
                    int guess = scan.nextInt();
                    if (guess == targetNumber) {
                        System.out.println("Correct");
                        break;
                    } else {
                        System.out.println("Wrong");
                        System.out.println("Better luck Next Time");
                    }
                    break;

            }}
        else{
            System.out.println("Invalid Login");


        }
    }

} 