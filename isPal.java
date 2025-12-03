public class isPal {


    static boolean isPalindrome(int x){
        int temp = x;
        int lastNum;
        int reverseNum = 0;
        while (temp != 0){
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp/=10;
        }
        return reverseNum == x;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(34543));
    }
}