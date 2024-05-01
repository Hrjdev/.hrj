import java.util.Scanner;

public class BiletHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = scanner.nextInt();
        scanner.close();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }
        double normalUcret = mesafe * 0.10;

        double indirimOrani = 0;
        if (yas < 12) {
            indirimOrani = 0.50;
        } else if (yas >= 12 && yas <= 24) {
            indirimOrani = 0.10;
        } else if (yas >= 65) {
            indirimOrani = 0.30;
        }

        double yasIndirimi = normalUcret * indirimOrani;

        double toplamTutar = normalUcret - yasIndirimi;
        if (yolculukTipi == 2) {
            double biletindirim = toplamTutar * 0.20;;
            toplamTutar -= biletindirim;
        }

        System.out.println("Toplam Tutar = " + toplamTutar + " TL");
    }
}