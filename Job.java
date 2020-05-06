/*Author: Liana Bardallis
* Date: 6 May 2020
* Description: Job object for DisabledLifeSim game
*/

class Job{
  //values of Job
  private int speedToll, dextToll, spoonsToll, location;
  private String name;

  //constants for no job
  private static final String NO_JOB_NAME = "None";
  private static final int NO_JOB_SPEEDTOLL = 0;
  private static final int NO_JOB_DEXTTOLL = 0;
  private static final int NO_JOB_SPOONSTOLL = 0;
  private static final int NO_JOB_LOCATION = 0;

  //creates new disability with no mods TODO
  public Job(){
    speedToll = NO_JOB_SPEEDTOLL;
    dextToll = NO_JOB_DEXTTOLL;
    spoonsToll = NO_JOB_SPOONSTOLL;
    name = NO_JOB_NAME;
    location = NO_JOB_LOCATION;
  }
}
