import java.util.Scanner;
public class TicTacToe {

    String[][] playGround;
    int row, col;
    final int gRow = 3;
    final int gCol = 3;
    private String regex = "\\s{3}";

    public TicTacToe(){
    playGround = new String[gRow][gCol];
    this.startGame();
    }


    public void startGame(){

        for(row = 0; row < playGround.length;row++){
            for(col=0;col <playGround.length;col++){
                playGround[row][col] = "   ";
            }
        }
    }

    public void printBoard(){
        for(row=0;row < playGround.length; row++){
            for(col=0; col < playGround.length; col++){
                System.out.print(playGround[row][col]);
            }
            System.out.println();
        }
    }

    public void updateBoard(int rowIn, int colIn, String value){
        if(playGround[rowIn][colIn].matches(regex)) {
            playGround[rowIn][colIn] = " " + value + " ";
        }
    }

    public boolean isGameOver(){
        //Check Row
        for(row=0;row <playGround.length;row++){
            if(!playGround[row][0].matches(regex) && playGround[row][0].equals(playGround[row][1]) && playGround[row][1].equals(playGround[row][2])){
                return true;
            }
        }

        //Check Column
        for(col=0;col <playGround.length;col++){
            if(!playGround[row][0].matches(regex) && playGround[0][col].equals(playGround[1][col]) && playGround[1][col].equals(playGround[2][col])){
                return true;
            }
        }
        //Stuf
        //Check Diagonal

        for(row=0;row <playGround.length;row++){
            if(!playGround[row][0].matches(regex) && playGround[row][0].equals(playGround[row+1][1]) && playGround[row+1][1].equals(playGround[row+2][2])){
                return true;
            }
        }
        for(row=0;row<playGround.length;row++){
            if(!playGround[row][0].matches(regex) && playGround[row][2].equals(playGround[row+1][1]) && playGround[row+1][1].equals(playGround[row+2][0])){
                return true;
            }
        }
        //if no one wins
        return false;
    }
}
