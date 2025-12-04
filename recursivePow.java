import java.util.Scanner;

public class recursivePow {

    // Recursive (Özyinelemeli) Metot
    public static long usAl(int taban, int us) {
        // Temel Durum (Base Case): Üs 0 ise sonuç her zaman 1'dir.
        if (us == 0) {
            return 1;
        }
        // Recursive Adım: Taban * (Taban üzeri üs - 1)
        else {
            return taban * usAl(taban, us - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Recursive Üs Alma Programı ---");

        // Kullanıcıdan veri alma
        System.out.print("Taban değerini giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        // Negatif üs kontrolü (Bu basit örnek pozitif üsler içindir)
        if (us < 0) {
            System.out.println("Lütfen pozitif bir üs değeri giriniz.");
        } else {
            // Metodu çağırma ve sonucu yazdırma
            long sonuc = usAl(taban, us);
            System.out.println("Sonuç (" + taban + "^" + us + "): " + sonuc);
        }

        scanner.close();
    }
}