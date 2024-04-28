import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut = 2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0,tutar;
        int armutkg,elmakg,domateskg,muzkg,patlicankg;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armutkg = input.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        elmakg = input.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        domateskg = input.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        muzkg = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicankg = input.nextInt();
        tutar = armut*armutkg + elma*elmakg + domates*domateskg + muz*muzkg + patlican*patlicankg;
        System.out.println("Toplam Tutar : "+tutar);
    }
}
