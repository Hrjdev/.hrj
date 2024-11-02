import java.util.Scanner;

public class TicTacToe {

    private enum Board { X, O, EMPTY }
    private Board[][] board;
    private boolean playerTurnX;
    // Constructor to create empty board , and decides starter player if user picks "O" than first "O" starts.
    public TicTacToe() {
        board = new Board[3][3]; // To create 3x3 board
        playerTurnX = true;
        for (int i = 0; i < 3; i++) { // To make sure at the beginning the board is empty
            for (int j = 0; j < 3; j++) {
                board[i][j] = Board.EMPTY;
            }
        }
    }

    private void displayBoard() { // To draw a game board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == Board.X) {
                    System.out.print(" X ");
                } else if (board[i][j] == Board.O) {
                    System.out.print(" O ");
                } else {
                    System.out.print("   ");
                }

                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
    }

    private boolean moveMaker(int row, int col) { // If move is empty, returns true and makes move. If move is not empty returns false
        if (board[row][col] == Board.EMPTY) {
            board[row][col] = playerTurnX ? Board.X : Board.O;
            return true;
        }
        return false;
    }

    private boolean checkWinner() { // To check all winning situations
        Board currentPlayer = playerTurnX ? Board.X : Board.O;

        for (int i = 0; i < 3; i++) { // To check row winning situations
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) { // To check column winning situations
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true; // To check left to right cross
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true; // To check right to left cross
        }
        return false;
    }

    private boolean isDraw() {  // If there is no empty part in the board returns true, if at least one empty place returns false and game continues
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == Board.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public void gamePlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who want's to start first? (X or O) : ");

        while (true){
            String starterPlayer = scanner.next();
            if (starterPlayer.equals("o") || starterPlayer.equals("O")){
                System.out.println("Player O starts first. ");
                playerTurnX = !playerTurnX;
                break;
            } else if (starterPlayer.equals("x") || starterPlayer.equals("X")) {
                System.out.println("Player X starts first. ");
                break;
            } else {
                System.out.println("Invalid player, enter a valid player (X or O) : ");
                continue;
            }
        }

        while (true) {
            displayBoard();

            System.out.println("Player" + (playerTurnX ? " X " : " O ") + "enter your row move (0 to 2): ");
            int row = scanner.nextInt();
            System.out.println("Player" + (playerTurnX ? " X " : " O ") + "enter your column move (0 to 2): ");
            int col = scanner.nextInt();
            if (row < 0 || row > 2 || col < 0 || col > 2 || !moveMaker(row, col)) {
                System.out.println("Invalid move or move is taken, enter new move: ");
                continue;
            }
            if (checkWinner()) {
                displayBoard();
                System.out.println("Player" + (playerTurnX ? " X " : " O ") + " is the winner.");
                break;
            }
            if (isDraw()) {
                displayBoard();
                System.out.println("Draw!");
                break;
            }
            playerTurnX = !playerTurnX; // To switch to the other player
        }
        scanner.close();
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.gamePlay();
    }
}
