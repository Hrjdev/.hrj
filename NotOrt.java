import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        int mat,fiz,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz : ");
        fiz = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuzu Giriniz : ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        int toplam = mat+fiz+kimya+turkce+tarih+muzik;
        double sonuc = toplam / 6.0;
        System.out.println("Not Ortalamanız : "+sonuc);

        int gecerNot = 60;
        boolean kosul = sonuc >= gecerNot;
        String durum = kosul ? "Sınıfı Gecti" : "Sınıfta Kaldi";
        System.out.println(durum);
    }
}
