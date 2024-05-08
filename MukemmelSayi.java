import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        String list = "";
        int sum =0;
        for (int i = 1 ; i<n ; i++){
            if (n%i==0){
                list+=i+" ";
                sum+=i;
            }
        }
        System.out.println(n+" Sayısının kendisi hariç pozitif bölenleri : "+list);
        if (sum==n){
            System.out.println(n+" Mükemmel bir sayıdır.");
        }else System.out.println(n+" Mükemmel bir sayı değildir.");
    }
}
