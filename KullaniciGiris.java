import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        username = input.next();
        System.out.print("Şifrenizi Giriniz : ");
        password = input.next();

        if(username.equals("HrjDev") && password.equals("java123")){
            System.out.println("Başarıyla Giriş Yaptınız.");
        }else if(username.equals("HrjDev") && "java123" != password.intern()){
            System.out.println("Şifrenizi Yanlış Girdiniz.");
            System.out.print("Şifrenizi Yenilemek İster Misiniz? (Y/N):");
            String cond = input.next();
            if(cond.equals("Y")){
                System.out.print("Yeni Şifrenizi Giriniz : ");
                password = input.next();
                if(password.equals("java123")){
                    System.out.println("Yeni Şifreniz Eskisi İle Aynı Olamaz.");
                    System.out.print("lütfen Başka Şifre Giriniz : ");
                    password = input.next();
                    System.out.println("Yeni Şifre Başarıyla Oluşturuldu.");
                }
            }
        }else System.out.println("Yanlış Kullanıcı Adı Veya Şifre Girdiniz.");
    }
}
