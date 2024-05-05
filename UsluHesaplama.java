import java.util.Scanner;

public class UsluHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Üssü alınacak sayı : ");
        a = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        b = input.nextInt();
        int start = 1;
        for (int i = 1 ; i<=b ; i++){
            start *= a;
        }
        System.out.println("Cevap : "+start);
    }
}

