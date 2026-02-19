import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class MineClass {
    private int rowN;
    private int colN;
    private String[][] minedDeck;
    private String[][] playerDeck;
    Scanner sc = new Scanner(System.in);

    public MineClass(int rowN,int colN){
        this.rowN = rowN;
        this.colN = colN;
    }
    private void makeDecks(){
        for (int i = 0 ; i<rowN ; i++){
            for (int j = 0 ; j<colN ; j++){
                playerDeck[i][j] = "-";
            }
        }
        for (int i = 0 ; i<rowN ; i++){
            for (int j = 0 ; j<colN ; j++){
                minedDeck[i][j] = "-";
            }
        }

    }
    private void printDeck(String[][] deck){
        for (int i = 0 ; i<rowN ; i++){
            for (int j = 0 ; j<colN ; j++){
                System.out.print(deck[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
    private void plantMines(){
        Random random = new Random();
        int printedMine = 0;
        int totalCell = rowN*colN;
        int numberofMine = (totalCell) / 4;
        while (printedMine < numberofMine){
            int randIndex = random.nextInt(totalCell);
            int r = randIndex / rowN;
            int c = randIndex % colN;
            if (!Objects.equals(minedDeck[r][c], "*")){
                minedDeck[r][c] = "*";
                printedMine++;
            }
        }
    }
    private int countNearMines(int row,int col){
        int count = 0;
        for (int i = -1 ; i <= 1 ; i++){
            for (int j = -1 ; j <= 1 ;j++){
                int nearRow = row + i;
                int nearCol = col + j;
                if (nearRow >= 0 && nearRow < rowN && nearCol >= 0 && nearCol < colN){
                    if (minedDeck[nearRow][nearCol].equals("*")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    private boolean isDone(){
        int kapaliBloklar = 0;
        for (int i = 0 ; i < rowN ; i++){
            for (int j = 0 ; j < colN ; j++){
                if (Objects.equals(playerDeck[i][j], "-")){
                    kapaliBloklar++;
                }
            }
        }
        return (kapaliBloklar == ((rowN*colN)/4));
    }

    public void run(){
        playerDeck = new String[rowN][colN];
        minedDeck = new String[rowN][colN];
        makeDecks();
        plantMines();
        printDeck(minedDeck);
        boolean isContinue = true;
        while (isContinue){
            printDeck(playerDeck);
            if (isDone()){
                System.out.println("Tebrikler! Kazandınız.");
                for (int i = 0 ; i < rowN ; i++){
                    for (int j = 0 ; j < colN ; j++){
                        if (Objects.equals(playerDeck[i][j], "-")){
                            playerDeck[i][j] = "*";
                        }
                    }
                }
                printDeck(playerDeck);
                break;
            }
            System.out.print("Satır giriniz : ");
            int enteredRow = sc.nextInt();
            System.out.print("Sütun giriniz : ");
            int enteredCol = sc.nextInt();
            if (enteredRow < 0 || enteredRow >= rowN || enteredCol < 0 || enteredCol >= colN){
                System.out.println("Hatalı girdi! Tekrar Deneyin.");
                continue;
            }
            if (!Objects.equals(playerDeck[enteredRow][enteredCol], "-")){
                System.out.println("Daha önceden seçilmiş! Tekrar Deneyin.");
                continue;
            }
            if (Objects.equals(minedDeck[enteredRow][enteredCol], "*")){
                System.out.println("Mayına bastın. Oyunu Kaybettin!");
                isContinue = false;
            }
            String minecount = String.valueOf(countNearMines(enteredRow,enteredCol));
            playerDeck[enteredRow][enteredCol] = minecount;
        }

    }
}
