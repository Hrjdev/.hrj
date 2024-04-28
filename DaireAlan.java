import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        int r,aci;
        double pi = 3.14,alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();
        System.out.print("Daire diliminin merkez açısını giriniz : ");
        aci = input.nextInt();
        alan = (pi * (r*r) * aci) / 360;
        System.out.println("Daire diliminin alanı : "+alan);
    }
}
