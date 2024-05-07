import java.util.Scanner;

public class HarmonicSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();
        double result = 0;
        for (double i = 1 ; i <= n ; i++){
            result+= 1.0/i;
        }
        System.out.println("Girilen sayının harmonik seri değeri : "+result);
    }
}
