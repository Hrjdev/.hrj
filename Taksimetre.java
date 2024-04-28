import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int mesafe;
        double tutar;
        double kmTutar = 2.20;
        int kisaMesafeTutar = 20;
        int acilis = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi giriniz : ");
        mesafe = input.nextInt();
        tutar = (kmTutar * mesafe) + acilis;
        boolean kisaMi = tutar < kisaMesafeTutar;
        tutar = kisaMi ? kisaMesafeTutar : (kmTutar * mesafe) + acilis;
        System.out.println("Tutar : "+tutar);
    }
}
