import java.util.Scanner;

public class isAsal {

    static boolean isA(int a,int b){
        if (a<2){return false;}
        if (b*b > a){return true;}
        if (a % b == 0){return false;}
        return isA(a,b+1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayıyı gir : ");
        int num = sc.nextInt();
        String result = (isA(num,2)) ? "Sayı Asal." : "Asal Değil.";
        System.out.println("Girmiş olduğun "+result);
    }
}
