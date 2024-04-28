import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        double a,b,c,u,alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin kenar uzunluklarını sırasıyla giriniz : ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        u = (a+b+c) / 2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı : "+alan);
    }
}
