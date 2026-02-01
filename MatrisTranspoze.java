public class MatrisTranspoze {
    public static void main(String[] args) {

        int[][] matris = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpoze = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }

        System.out.println("Orijinal Matris:");
        matrisYazdir(matris);

        System.out.println("\nTranspoze Matris:");
        matrisYazdir(transpoze);
    }

    public static void matrisYazdir(int[][] dizi) {
        for (int[] satir : dizi) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
    }
}