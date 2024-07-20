import java.util.Scanner;

public class SortNumber {

    public static void main(String[] args){
        System.out.println("Number Sorting");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");

        int num = scanner.nextInt();

        int [] numbers = new int[num];

        System.out.println("Enter " + num + " number");

        for(int i = 0; i < num; i++){
            numbers[i] = scanner.nextInt();
        }

        bubbleSort(numbers);

        System.out.println("Sorted Number:");
        
        for (int number : numbers) {
            System.out.println(number);
            
        }

        scanner.close();
    }

    private static void bubbleSort(int[] array){

        int len = array.length;
        boolean swap;

        for(int i = 0; i < len - 1; i++){
            swap = false;
            for(int j = 0; j < len - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp; 
                    swap = true;
                }
            }
            if (!swap) {
                System.out.println("function break");
                break;
            };
        }
    }
    
}
