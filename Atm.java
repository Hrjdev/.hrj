import java.util.Scanner;

public class Atm
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String kulAd, pas, newAd, newPas;
        int	right, islem, balance, depAmount, pullAmount;
        boolean check = true;

        balance = 1500;
        right = 3;
        kulAd = "hrj";
        pas = "hrj.dev";

        System.out.println("HrjBank'a Hoşgeldiniz.");
        System.out.println("Giriş yapmak için 3 hakkiniz var.");
        while (true)
        {
            if (right == 0)
            {
                System.out.println("Deneme hakkiniz sona erdi. Hak: " + right);
                System.out.println("Hesabiniz bloke olmuştur. Banka ile iletişime geçiniz.");
                System.exit(0);
            }
            System.out.print("Kullanici adiniz: ");
            newAd = input.nextLine();
            System.out.print("Parolaniz: ");
            newPas = input.nextLine();
            if (!newAd.equals(kulAd) || !newPas.equals(pas))
            {
                right--;
                System.out.println("Kullanici adi ya da parolaniz hatali !");
                System.out.println("Kalan deneme hakiniz: " + right);
            }
            if (newAd.equals(kulAd) && newPas.equals(pas))
            {
                System.out.println("Giriş başarili !");
                break;
            }
        }
        System.out.println("\n1-Para Yatirma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çikiş Yap");
        while (check)
        {
            System.out.print("Işlem seçiniz: ");
            islem = input.nextInt();
            switch (islem) {
                case 1:
                    System.out.print("Yatirmak istediğiniz miktari giriniz: ");
                    depAmount = input.nextInt();
                    if (depAmount>0){
                        balance += depAmount;
                        System.out.println("Para yatirma işleminiz başarili.");
                        System.out.println("Yeni bakiyeniz: " + balance + "TL");
                    }else System.out.println("Yanlış tuşlama yaptınız.");
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz miktari giriniz: ");
                    pullAmount = input.nextInt();
                    if (pullAmount>0){
                        if (pullAmount > balance)
                            System.out.println("Hesabinizda yeterli bakiye yok. Bakiyeniz: " + balance + "TL");
                        else
                        {
                            balance -= pullAmount;
                            System.out.println("Para çekme işleminiz başarili.");
                            System.out.println("Yeni bakiyeniz: " + balance + "TL");
                        }
                    }else System.out.println("Yanlış tuşlama yaptınız.");
                    break;
                case 3:
                    System.out.println("Bakiyeniz: " + balance + "TL");
                    break;
                case 4:
                    System.out.println("Çikiş yapildi !");
                    System.out.println("Tekrar görüşmek üzere...");
                    check = false;
                    break;
                default:
                    System.err.println("Yanliş bir tuşlama yaptiniz !");
                    break;
            }
        }
    }
}