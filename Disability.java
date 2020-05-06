/*Author: Liana Bardallis
* Date: 6 May 2020
* Description: Disability object for DisabledLifeSim game
*/

class Disability{
  //values of disability
  private int speedMod, dextMod, spoonsMod;
  private String name;

  //constants for no disability
  private static final String NO_DISABILITY_NAME = "None";
  private static final int NO_DISABILITY_SPEEDMOD = 0;
  private static final int NO_DISABILITY_DEXTMOD = 0;
  private static final int NO_DISABILITY_SPOONSMOD = 0;

  //creates new disability with no mods TODO
  public Disability(){
    speedMod = NO_DISABILITY_SPEEDMOD;
    dextMod = NO_DISABILITY_DEXTMOD;
    spoonsMod = NO_DISABILITY_SPOONSMOD;
    name = NO_DISABILITY_NAME;
  }
}
