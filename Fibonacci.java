import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz : ");
        int n = input.nextInt();
        //---------------------------------------------------------------------
        int ilkTerim = 0, ikinciTerim = 1;

        System.out.print(n+" Elemanlı Fibonacci serisi: ");
        System.out.print(ilkTerim+" "+ikinciTerim+" ");

        for (int i = 2 ; i<=n ;i++){
            int sonrakiTerim = ikinciTerim + ilkTerim;
            System.out.print(sonrakiTerim+" ");
            ilkTerim = ikinciTerim;
            ikinciTerim = sonrakiTerim;
        }
    }
}
