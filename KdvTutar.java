import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat;
        double kdvTutar;
        double kdvliFiyat;

        System.out.print("Fiyat bilgisini giriniz: ");
        fiyat = input.nextDouble();
        boolean durum1 = fiyat < 1000 && fiyat > 0;
        int kdvOran = durum1 ? 18 : 8;
        kdvTutar = fiyat * kdvOran / 100;
        kdvliFiyat = fiyat + kdvTutar;
        System.out.println("KDV'siz fiyat : "+fiyat+"\nKDV'li fiyat : "+kdvliFiyat+"\nKDV tutarı : "+kdvTutar);
    }
}
