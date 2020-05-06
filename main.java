/* Author: Liana Bardallis
* Date: 6 MAY 2020
* Description: The main java file to run the Disabled Life Simulator game.
*/

public class DisabledLifeSim{
  // sets up the game to a general starting setup NOT WRITTEN
  private static Board setup(){
    return new Board;
  }

  //plays the playGame NOT WRITTEN
  private static void playGame(Board gameBoard){
    return;
  }

  //does the user want to continue?
  private static boolean wantsToPlayGame(){
    //asks if wants to continue
    System.out.println("Do you want to continue? yes or no /n");
    String choiceOfContinue = "no";

    //conditional for exit
    if (choiceOfContinue.equals("yes"){
      return true;
    } else {
      return false;
    }
  }

  // clears board status of game NOT WRITTEN
  private static void clearBoard(){
    return;
  }

  public static void main(String[] args){
    Board gameBoard = setup();

    boolean continue = true;
    while (continue){
      // plays the game, returns bool if player wants to play again.
      playGame(gameBoard);
      continue = wantsToPlayGame();
      clearBoard(gameBoard);
    }

    //end game
    System.out.println("Thank you for playing!");
    System.exit(1);
  }
}
