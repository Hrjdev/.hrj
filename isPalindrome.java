import java.util.Scanner;

public class isPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir kelime girin : ");
        String word = sc.next();
        System.out.println(isPal(word));
    }
    public static boolean isPal(String x ){
        String temp = x;
        int i = 0;
        int j = x.length()-1;
        while (i<j){
            if (x.charAt(i) != x.charAt(j)){
                return false;
            }
            i++;
            j--;
        }return true;
    }
}
