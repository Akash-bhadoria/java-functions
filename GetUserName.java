import java.util.Scanner;

public class GetUserName {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String username = scanner.nextLine();
        System.out.println("Name is : " + username);

        scanner.close();

    }
    
}
