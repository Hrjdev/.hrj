import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int number1,number2;
        String operator;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        number1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        number2 = input.nextInt();
        System.out.print("Yapmak İstediğiniz İşlemi Giriniz (+,-,*,/) : ");
        operator = input.next();
        input.close();
        switch (operator){
            case "+":
                System.out.println("Sonuç : "+ (number1+number2));
                break;
            case "-":
                System.out.print("Sonuç : "+ (number1-number2));
                break;
            case "*":
                System.out.print("Sonuç : "+(number1*number2));
                break;
            case "/":
                switch (number2){
                    case 0:
                        System.out.println("Bir Sayı Sıfıra Bölünemez.");
                        break;
                    default:
                        System.out.println("Sonuç : "+(number1/number2));
                        break;
            }
            default:
                System.out.print("Geçersiz İşlem Yaptınız.");
                break;
        }
    }
}
