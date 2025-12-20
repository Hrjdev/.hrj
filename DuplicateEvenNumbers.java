public class DuplicateEvenNumbers {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9, 10, 20, 20};

        System.out.println("Tekrar eden çift sayılar: ");

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                for (int j = i + 1; j < dizi.length; j++) {
                    if (dizi[i] == dizi[j]) {
                        System.out.println(dizi[i]);
                        break;
                    }
                }
            }
        }
    }
}