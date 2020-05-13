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

  //constants for autism
  private static final String AUTISM_NAME = "Autism";
  private static final int AUTISM_SPEEDMOD = 0;
  private static final int AUTISM_DEXTMOD = 0;
  private static final int AUTISM_SPOONSMOD = -10;

  //constants for wheelchair
  private static final String WHEELCHAIR_NAME = "Wheelchair User";
  private static final int WHEELCHAIR_SPEEDMOD = -10;
  private static final int WHEELCHAIR_DEXTMOD = 0;
  private static final int WHEELCHAIR_SPOONSMOD = 0;

  //constants for cerebral palsy
  private static final String CP_NAME = "Cerebral Palsy";
  private static final int CP_SPEEDMOD = 0;
  private static final int CP_DEXTMOD = -10;
  private static final int CP_SPOONSMOD = 0;

  //creates new disability with random mods
  public Disability(){
    Random rand = new Random();
    speedMod = rand.nextInt(10)*-1;
    dextMod = rand.nextInt(10)*-1;
    spoonsMod = rand.nextInt(10)*-1;
    name = "Random";
  }

  //creates new custom disability with given mods
  public Disability(int speed, int dext, int spoons){
    speedMod = speed;
    dextMod = dext;
    spoonsMod = spoons;
    name = "Custom";
  }

  //creates disability from list of premades TODO
  public Disability(String disabilityName){
    if (disabilityName.equals(AUTISM_NAME)){
      speedMod = AUTISM_SPEEDMOD;
      dextMod = AUTISM_DEXTMOD;
      spoonsMod = AUTISM_SPOONSMOD;
      name = disabilityName;
    } else if (disabilityName.equals(WHEELCHAIR_NAME)) {
      speedMod = WHEELCHAIR_SPEEDMOD;
      dextMod = WHEELCHAIR_DEXTMOD;
      spoonsMod = WHEELCHAIR_SPOONSMOD;
      name = disabilityName;
    } else if (disabilityName.equals(CP_NAME)) {
      speedMod = CP_SPEEDMOD;
      dextMod = CP_DEXTMOD;
      spoonsMod = CP_SPOONSMOD;
      name = disabilityName;
    } else {
      speedMod = NO_DISABILITY_SPEEDMOD;
      dextMod = NO_DISABILITY_DEXTMOD;
      spoonsMod = NO_DISABILITY_SPOONSMOD;
      name = disabilityName;
    }
  }

  //getter for dextMod
  public static int getDextValue(){
    return dextMod;
  }

  //getter for speedMod
  public static int getSpeedValue(){
    return speedMod;
  }

  //getter for spoonsMod
  public static int getSpoonsValue(){
    return spoonsMod;
  }

  //getter for name of disability
  public static int getName(){
    return name;
  }
}
