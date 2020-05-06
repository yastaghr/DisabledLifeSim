/* Author: Liana Bardallis
* Date: 6 May 2020
* Description: the board object for the DisabledLifeSim game
*/
class Board{
  //variables for board setup
  private Character chara;
  private int year;
  private Country country;

  //constants for board setup
  private static final int STARTING_YEAR = 2000;

  //basic board initiator
  public Board(){
    chara = new Character();
    year = STARTING_YEAR;
    country = new Country();
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
