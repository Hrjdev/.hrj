import java.util.Scanner;

public class recDesen {

    static void desenOlustur(int n){
        System.out.print(n + " ");
        if (n<0){return;}
        desenOlustur(n-5);
        System.out.print(n + " ");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("N sayısını girin: ");
        int num = sc.nextInt();
        System.out.println("Desen : ");
        desenOlustur(num);

    }
}
