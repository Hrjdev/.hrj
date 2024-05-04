import java.util.Scanner;
// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

public class KuvvetProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n = input.nextInt();
        System.out.print("4'ün kuvvetleri : ");
        for (int j = 1 ; j<=n ;j*=4){
            System.out.print(j+" ");
        }
        System.out.print("\n5'in kuvvetleri : ");
        for (int j = 1 ; j<=n ;j*=5){
            System.out.print(j+" ");
        }
    }
}
