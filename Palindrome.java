import java.util.Scanner;

public class Palindrome {

    static String original, reverse = "";
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Check Palindrome");

        System.out.print("Enter the String/Number : ");

        original = scanner.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i-- ){
            reverse = reverse + original.charAt(i);
        }

        scanner.close();

        if(original.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");

        }

    }
    
}
