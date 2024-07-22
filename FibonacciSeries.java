import java.util.Scanner;

public class FibonacciSeries {
    static int n1, n2, n3;
    
    static void printFibonacciSeries(int count){
        if(count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacciSeries(count - 1);
        }
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonacci Series");

        System.out.println("Enter the number to start the series.");

        int  start_number = scanner.nextInt();

        System.out.println("Enter the count of number in series.");

        int  count = scanner.nextInt();

        scanner.close();

        n1 = start_number;
        n2 = start_number + 1;

        System.out.print(n1+" "+n2);
        printFibonacciSeries(count-1);




    }
    
}
