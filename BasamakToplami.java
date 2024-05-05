import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        input.close();
        int tempNumber = number;
        int basamakSayisi = 0;
        int result = 0;
        int sonsayi = 0;

        while (tempNumber / 10 != 0){
            sonsayi = tempNumber % 10;
            result+=sonsayi;
            tempNumber /= 10;
            basamakSayisi++;
        }
        if (tempNumber / 10 == 0){
            result+=tempNumber;
            basamakSayisi++;
        }
        System.out.println("Girilen sayının basamak toplamı : "+result+" Basamak Sayısı : "+basamakSayisi);
    }
}
