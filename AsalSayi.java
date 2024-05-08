public class AsalSayi {
    public static void main(String[] args) {
        boolean prime = true;
        for (int i = 2 ; i<=100 ;i++){
            for (int k = 2 ; k<=i/2 ; k++){
                if (i%k==0){
                    prime = false;
                    break;
                }else prime = true;
            }if (prime){
                System.out.print(i+" ");
            }
        }
    }
}

