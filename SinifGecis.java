import java.util.Scanner;

public class SinifGecis {
    public static void main(String[] args) {
        int mat,fiz,kimya,turkce,muzik,lessons;
        lessons = 5;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        if(0 == mat || 100 == mat){
            mat = 0;
            lessons--;
        }
        if(0 == fiz || 100 == fiz){
            fiz = 0;
            lessons--;
        }
        if(0 == kimya || 100 == kimya){
            kimya = 0;
            lessons--;
        }
        if(0 == turkce || 100 == turkce){
            turkce = 0;
            lessons--;
        }
        if(0 == muzik || 100 == muzik){
            muzik = 0;
            lessons--;
        }
        double average = (mat+fiz+kimya+turkce+muzik)/lessons;
        if(average <= 55){
            System.out.println("Sınıfta Kaldınız.");
        }else System.out.println("Sınıfı Geçtiniz");
        System.out.println("Ortalamanız : "+average);
    }
}
