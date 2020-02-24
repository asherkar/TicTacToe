import java.util.Scanner;

public class MyClass {


    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.startGame();
//        game.printBoard();
        Scanner inputVal = new Scanner(System.in);
        String player = "X";
        do {
            game.printBoard();
            System.out.println("Enter row number");
            int rowIn = inputVal.nextInt();
            if(rowIn == -1){
                break;
            }
            System.out.println("You entered " + rowIn);
            System.out.println("Enter col number");
            int colIn = inputVal.nextInt();
            if(colIn == -1){
                break;
            }
            System.out.println("You entered " + colIn);
//            System.out.println("Enter X or O");
//            String move = inputVal.nextLine();
            game.updateBoard(rowIn,colIn,player);
            if(game.isGameOver()){
                System.out.println("GameOver!");
                break;
            }
            if(player.equals("X")) {
                player = "O";
            }
            else {
                player = "X";
            }

        }while (true);

    }
}
/**
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        String player = "X";

        do {
            System.out.println(game.printBoard());
            System.out.println("enter row for " + player + " or -1 to exit: ");
            int row = input.nextInt();
            if(row == -1)
                break;
            System.out.println("enter column for " + player + ": ");
            int column = input.nextInt();
            game.setPlay(row,  column, player);
            if(game.isGameOver()) {
                System.out.println(game.printBoard() + "\n" + player +" wins!");
                break;
            }
            if(player == "X") {
                player = "O";
            }
            else {
                player = "X";
            }
        }while(true);
        System.out.println("Goodbye!..");

    }

}**/
