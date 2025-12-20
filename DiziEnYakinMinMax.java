import java.util.Arrays;
import java.util.Scanner;

public class DiziEnYakinMinMax {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int sayi = scanner.nextInt();

        Arrays.sort(dizi);

        int kucukYakin = 0;
        int buyukYakin = 0;

        for (int i : dizi) {
            if (i < sayi) {
                kucukYakin = i;
            }
            if (i > sayi) {
                buyukYakin = i;
                break;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(dizi));
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucukYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyukYakin);
    }
}