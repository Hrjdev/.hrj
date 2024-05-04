import java.util.Scanner;

public class BolumOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        int sum = 0;
        int counter = 0;
        int ave;

        for (int i = 0 ; i<=n ; i++){
            if(i%3==0 && i%4==0){
                counter++;
                sum+=i;
            }else if(sum==0){
                counter=0;
            }
        }
        if(counter>0){
            ave = sum/counter;
            System.out.println("Ortalama : "+ave);
        }else System.out.println("Ortak bölünen sayı yok.");
    }
}
