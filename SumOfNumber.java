
import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args){
        System.out.println("Calculate Two Numbers");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");

        int first = scanner.nextInt();

        System.out.println("Enter second number");

        int second = scanner.nextInt();

        int sum = first + second;

        System.out.println("Sum : " + sum);

        scanner.close();


    }
    
}
