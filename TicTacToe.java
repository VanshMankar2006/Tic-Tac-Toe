package Projects;
import java.util.Scanner;
public class TicTacToe{
  // method to print TicTacToe board
    public static void printBoard(char[][] board){

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(" | "+board[i][j]);
            }
            System.out.println();
        }

    }
  // method to check game result
    public static boolean gameResult(char currPlayer,char[][] board){
        for (int i = 0; i < board.length; i++) {
            // checking for row
            if(board[i][0]==currPlayer && board[i][1]==currPlayer && board[i][2]==currPlayer){
                return true;
            }
            // checking for col
        }
        for (int i = 0; i < board.length; i++) {
            if(board[0][i]==currPlayer && board[1][i]==currPlayer && board[2][i]==currPlayer){
                return true;
            }       
        }
        // checking for diagonal
       return ((board[2][0]==currPlayer && board[1][1]==currPlayer && board[0][2]== currPlayer) ||
       (board[0][0]==currPlayer && board[1][1]==currPlayer && board[2][2]==currPlayer));

    }
   public static void main(String[] args) {
        // Board creation
        char[][] board = new char[3][3];
        Scanner sc = new Scanner(System.in);
        // initially all boards are empty
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = ' ';
            }
        }
        // which player will start first
        System.out.println("Enter who will start first : ");
        System.out.println("1. X \n2. O");
        int choice = sc.nextInt();
        char currPlayer = (choice==1)?'X':'O';
        boolean gameOver = false;

        while(!gameOver){ // while someone not win the game
            printBoard(board);
            System.out.println(currPlayer+" Player Enter your choice block\nFirst RowNo then ColmNo");
            // Block address
            int rowNo = sc.nextInt()-1;
            int colmNo = sc.nextInt()-1;

            if((rowNo >-1 && rowNo <3) && (colmNo >-1 && colmNo < 3) && board[rowNo][colmNo]==' '){
                board[rowNo][colmNo]=currPlayer;
                gameOver = gameResult(currPlayer,board);
                if(gameOver){ // we got winner
                    System.out.println("Congratulations ! Player "+currPlayer+" has won");
                } 
                else{
                    currPlayer = (currPlayer=='X')?'O':'X';
                }
            }else{
                System.out.println("Oops Invalid Entry,Try Again !");
            }

            System.out.println();

        }
        System.out.println("Have a Nice day to you");
 

    }
}