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

  //creates new disability from premades
  public Job(String jobName){
    name = jobName;
    //switch for different premade jobs
    if (name.equals(NO_JOB_NAME)){
      speedToll = NO_JOB_SPEEDTOLL;
      dextToll = NO_JOB_DEXTTOLL;
      spoonsToll = NO_JOB_SPOONSTOLL;
      location = NO_JOB_LOCATION;
    }
  }

  //creates new disability at random
  public Job(){
    name = "Random";
    Random rand = new Random();
    speedToll = -1*rand.nextInt(10);
    dextToll = -1*rand.nextInt(10);
    spoonsToll = -1*rand.nextInt(10);
    location = rand.nextInt(10);
  }

  //creates custom job
  public Job(String jobName, int speed, int dext, int spoons, int location){
    name = jobName;
    speedToll = speed;
    dextToll = dext;
    spoonsToll = spoons;
    location = location;
  }

  //equality function for Job
  public static boolean equals(Job other){
    if (name.equals(other.name) && (speedToll == other.speedToll) &&
    (dextToll == other.speedToll) && (spoonsToll == other.spoonsToll)){
      return true;
    }
    return false;
  }

  //getter for name
  public static String getName(){
    return name;
  }

  //getter for speed toll
  public static String getSpeedToll(){
    return speedToll;
  }

  //getter for dext toll
  public static String getDextToll(){
    return dextToll;
  }

  //getter for spoons toll
  public static String getSpoonsToll(){
    return spoonsToll;
  }
}
