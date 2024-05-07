import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Girilecek Sayı adeti : ");
        int adet = input.nextInt();
        int girdi;

        System.out.print("1. Sayıyı giriniz : ");
        int sayi = input.nextInt();
        int min = sayi;
        int max = sayi;

        for (int i = 2 ; i<=adet ; i++){
            System.out.print(i+". Sayıyı giriniz : ");
            girdi = input.nextInt();

            if (girdi>max){
                max = girdi;
            }
            if (girdi<min){
                min = girdi;
            }
        }
        System.out.println("En büyük sayı: "+max+"\nEn küçük sayı: "+min);
    }
}
