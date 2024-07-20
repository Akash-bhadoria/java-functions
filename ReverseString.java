import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args){

        System.out.println("Reverse a string");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to reverse");

        String original = scanner.nextLine();

        String reversed = "";

        for(int i = original.length() - 1; i >= 0 ; i--){
            reversed += original.charAt(i);
        }

        System.out.println("Reversed String with normal loop : " + reversed);

        char[] charArray = original.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        
        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            left++;
            right--;
            
        }
        
        System.out.println("Reversed String with Swapping : " + new String(charArray));
        scanner.close();

    }
    
}
