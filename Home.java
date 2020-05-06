/*Author: Liana Bardallis
* Date: 6 May 2020
* Description: Home object for DisabledLifeSim game
*/

class Home{
  //values of home
  private int spoonsToll, tax, cost;
  private int[] location;
  private String name;

  //constants for no home
  private static final String NO_HOME_NAME = "None";
  private static final int NO_HOME_SPOONSTOLL = 0;
  private static final int NO_HOME_TAX = 0;
  private static final int NO_HOME_COST = 0;
  private static final int[] NO_HOME_LOCATION = new int[0,0];

  //creates new disability with no mods TODO
  public Home(){
    spoonsMod = NO_HOME_SPOONSTOLL;
    name = NO_HOME_NAME;
    tax = NO_HOME_TAX;
    cost = NO_HOME_COST;
    location = NO_HOME_LOCATION;
  }
}
