import java.util.Scanner;
// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
// ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

public class CiftSayiToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0;

        do {
            System.out.print("Sayi giriniz : ");
            n = input.nextInt();
            if(n%4==0){
                sum+=n;
            }
        }while (n % 2 == 0);
        System.out.println("Sayıların toplamı : "+sum);
    }
}
