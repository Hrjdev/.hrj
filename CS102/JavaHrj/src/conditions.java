import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner nb = new Scanner(System.in);
        int newnb = nb.nextInt();
        int num = 26;
        if (newnb < num) {
            System.out.println("sayi" +num +"dan kücüktür");
        }
    }
}