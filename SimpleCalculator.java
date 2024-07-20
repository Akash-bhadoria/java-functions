import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args){
        System.out.println("Simple Calculator");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number");
        double first = scanner.nextDouble();

        System.out.println("Enter Second Number");
        double second = scanner.nextDouble();

        System.out.println("Choose Operation ( + , - , * , / )");

        String operation = scanner.next();

        double result = 0;

        switch(operation){
            case "+":
                result = first + second;
                break;
            case "-":
                if(first < second){
                    System.out.println("First number is less than Second Operation not perfomed!");
                    System.exit(0); 
                }
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if(second != 0){
                        result = first / second;
                }else{
                    System.out.println("Error: Division by zero!");
                    System.exit(0); 
                }
                break;
            default:
                System.out.println("Invalid Operation");
                System.exit(0);                
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
    
}
