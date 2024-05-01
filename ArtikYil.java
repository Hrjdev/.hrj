import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        yil = input.nextInt();

        boolean artikMi = (yil % 4 == 0 && yil % 100 != 0) || (yil % 100 == 0 && yil % 400 == 0);
        String sonuc = artikMi ? yil+" bir artık yıldır.": yil+" bir artık yıl değildir";
        System.out.println(sonuc);
    }
}
