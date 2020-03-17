/* Author: Liana Bardallis
* Date: 17 Mar, 2020
* Description: The main java file to run the Disabled Life Simulator game.
*/

public class DisabledLifeSim{
  private static void setup(){ // sets up the game to a general starting setup NOT WRITTEN
    return;
  }
  
  private static boolean playGame(){
    System.out.println("Do you want to continue? yes or no /n"); //asks if wants to continue
    String choiceOfContinue = "no"; //get yes/no answer to continue question NOT WRITTEN
    
    //conditional for exit
    if (choiceOfContinue.equals("yes"){ 
      return true;
    } else {
      return false;
    }
  }
  
  private static void clearBoard(){ // clears board status of game NOT WRITTEN
    return;
  }

  public static void main(String[] args){
    setup(); // sets up the game to a general starting setup
    
    boolean continue = true;
    while (continue){
      continue = playGame(); // plays the game, returns an int if player wants to play again. 
      clearBoard(); // clears board status of game
    }
    System.out.println("Thank you for playing!"); //prints game over message
  }
}
