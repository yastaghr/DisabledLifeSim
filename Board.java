/* Author: Liana Bardallis
* Date: 6 May 2020
* Description: the board object for the DisabledLifeSim game
*/
public class Board{
  //variables for board setup
  private Character chara;
  private int year;
  private Country country;
  private int[] size;

  //constants for board setup
  private static final int STARTING_YEAR = 2000;
  private static final int BASE_SIZE = 60

  //basic board initiator
  public Board(){
    chara = new Character();
    year = STARTING_YEAR;
    country = new Country();
    size = new int[BASE_SIZE, BASE_SIZE];
  }

  //updates the year +1
  public static void yearIncrease(){
    year++;
    return;
  }

  //immigrates to new country
  public static void immigrate(Country newCountry){
    country = newCountry;
    return;
  }
}
