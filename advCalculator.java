import java.util.Scanner;

public class advCalculator {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam Sonucu : " + result);
        return a + b;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma Sonucu : " + result);
        return a - b;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpım Sonucu : " + result);
        return a * b;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci Sayı 0'dan farklı olmalıdır.");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm Sonucu : " + result);
        return a / b;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs Alma İşleminin Sonucu : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("İlk Sayının İkinci Sayıya Göre Mod Alma İşleminin Sonucu : " + result);
        return result;
    }

    static void calc(int a, int b) {
        int result = 2 * (a + b);
        System.out.println("İlk Kenarı " + a + " İkinci Kenarı " + b + " Olan Dikdörtgenin Çevresi : " + result);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n" + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n" + "6- Mod Alma\n" + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        while (true) {
            System.out.println(menu);

            System.out.print("Bir İşlem Seçiniz: ");
            select = scanner.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("İlk Sayıyı Giriniz: ");
            int a = scanner.nextInt();

            System.out.print("İkinci Sayıyı Giriniz: ");
            int b = scanner.nextInt();

            switch (select) {
                case 1: {
                    sum(a, b);
                    break;
                }
                case 2: {
                    minus(a, b);
                    break;
                }
                case 3: {
                    times(a, b);
                    break;
                }
                case 4: {
                    divided(a, b);
                    break;
                }
                case 5: {
                    power(a, b);
                    break;
                }
                case 6: {
                    mod(a, b);
                    break;
                }
                case 7: {
                    calc(a, b);
                    break;
                }
                default:
                    System.out.println("Geçersiz Bir İşlem Girdiniz.");
            }

        }
    }

}