import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        int n1 = input.nextInt();
        String liste = "";
        System.out.print("2. Sayıyı giriniz: ");
        int n2 = input.nextInt();
        int min = n1;
        if (n2<n1){
            min=n2;
        }
        int ebob = 1;
        int start = 1;
        while(start <= min){
            if (n1%start==0 && n2%start==0){
                ebob = start;
            }
            start++;
        }
        System.out.println("Ebob: "+ebob);
        System.out.println("Ekok: "+(n1*n2/ebob));

    }
}
