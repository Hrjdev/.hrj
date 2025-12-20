import java.util.Scanner;
import java.util.Arrays;
public class SortEnteredIntegers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many integers : ");
        int quantity = sc.nextInt();
        int[] arr = new int[quantity];
        for (int i = 0 ; i < quantity ; i++){
            System.out.print((i+1)+". number : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Order : ");
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
