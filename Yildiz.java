import java.util.Scanner;

public class Yildiz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        int n = input.nextInt();
        String chr = "*";
        for (int i = 1 ; i<=n ; i++){
            for (int k = 1 ; k <= n-i ; k++){
                System.out.print(" ");
            }
            for (int j =1 ; j<=(2*i-1) ; j++){
                System.out.print(chr);
            }
            System.out.println();
        }
        for (int l = 1 ; l<= n-1 ; l++){
            for (int c = 1 ; c<=l ;c++){
                System.out.print(" ");
            }
            for (int v = 2*(n-1)-1 ; v>=2*l-1 ;v--){
                System.out.print(chr);
            }
            System.out.println();
        }
    }
}
