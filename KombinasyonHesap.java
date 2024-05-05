import java.util.Scanner;

public class KombinasyonHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısı girin : ");
        int n = input.nextInt();
        System.out.print("Oluşacak grup sayısı girin : ");
        int r = input.nextInt();
        int nF=1,rF=1,diffF=1;
        for(int j = 1 ; j<=n ; j++){
            nF*=j;
        }
        for(int k = 1 ; k<=r ; k++){
            rF*=k;
        }
        for(int m = 1 ; m<=(n-r) ; m++){
            diffF*=m;
        }
        int combination = nF / (rF * diffF);
        System.out.println("Kombinasyon : "+combination);
    }
}
