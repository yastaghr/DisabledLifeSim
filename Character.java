/*Author: Liana Bardallis
* Date: 13 May 2020
* Description: Character object for DisabledLifeSim game
*/

class Character{
  private int money, age, gender, speed, dext, spoons, hunger, thirst;
  private Disability[] disabilities;
  private Job[] jobs;
  private Home house;

  //gender constants
  private static final int AGENDER = 0;
  private static final int FEMALE = 1;
  private static final int MALE = 2;
  private static final int NONBINARY = 3;
  private static final int GENDERFLUID = 4;

  //disability constants
  private static final int TOTAL_DISABILITIES = 5;

  //job constants
  private static final int TOTAL_JOBS = 5;

  //statistic constants
  private static final int MAX_DEXT = 20;
  private static final int MAX_SPEED = 20;
  private static final int MAX_SPOONS = 20;

  //creates new character
  public Character(){
    money = 0;
    age = 0;
    setupGender();
    setupDisabilities();
    setupJobs();
    house = new Home();
    speed = setupSpeedValue();
    dext = setupDextValue();
    spoons = setupSpoonsValue();
    hunger = 100;
    thirst = 100;
  }

  //initiator for gender
  private static void setupGender(){
    System.out.println("Do you want to pick a gender for your character? y/n");
    String wantsToPickGender = System.in();

    if (wantsToPickGender.equals("y")){
      gender = pickGender();
    } else {
      gender = randomGender();
    }
    return;
  }

  //walks user through picking gender for character
  private static int pickGender(){
    System.out.println("What gender do you want for your character? /n
    AGENDER / FEMALE / MALE / NONBINARY / GENDERFLUID");
    String pickedGender = System.in();

    if (pickedGender.equals("AGENDER")){
      return AGENDER;
    } else if (pickedGender.equals("FEMALE")){
      return FEMALE;
    } else if (pickedGender.equals("MALE")){
      return MALE;
    } else if (pickedGender.equals("NONBINARY")){
      return NONBINARY;
    } else if (pickedGender.equals("GENDERFLUID")){
        return GENDERFLUID;
    } else return 0;
  }

  //returns random int cooresponding to randomized gender
  private static int randomGender(){
    Random rand = new Random()
    return rand.nextInt(GENDERFLUID);
  }

  //initiator for disabilities
  private static void setupDisabilities(){
    //setup and fill array of disabilities
    disabilities = new Disability[TOTAL_DISABILITIES];
    for (int i = 0; i < TOTAL_DISABILITIES; i++){
      System.out.println("Add another disability? y/n");
      if (adding.equals("y")){ //wants to add disability

        System.out.println("Pick your disability: /n
        Autism / Wheelchair / Cerebral Palsy / Random / Custom ");
        String pickOfDisability = System.in();

        if (pickOfDisability.equals("Random")){
          disabilities[i] = new Disability();
        } else if (pickOfDisability.equals("Custom")){
          String handicap = "0";

          System.out.println("What is your speed handicap? /n
          1-10");
          handicap = System.in();
          int customSpeed = Integer.parseInt(handicap);

          System.out.println("What is your dext handicap? /n
          1-10");
          handicap = System.in();
          int customDext = Integer.parseInt(handicap);

          System.out.println("What is your spoons handicap? /n
          1-10");
          handicap = System.in();
          int customSpoons = Integer.parseInt(handicap);

          disabilities[i] = new Disability(customSpeed, customDext, customSpoons);
        } else{
          disabilities[i] = new Disability(pickOfDisability);
        }

      } else { //doesn't want to add disability
        disabilities[i] = new Disability("None");
      }
    }
    return;
  }

  //initiator for jobs
  private static void setupJobs(){
    jobs = new Job[TOTAL_JOBS];
    for (i = 0; i < jobs.length; i++){
      jobs[i] = new Job("None");
    }
    return;
  }

  //adds a new jobs
  public static void addJob(Job newJob){
    //search for empty space in array
    for (i = 0; i < jobs.length; i++){
      if (jobs[i].equals(new Job("None"))){
        jobs[i] = newJob;
        return;
      }
    }

    //no empty space found
    Job[] newJobsArray = new Job[jobs.length++];
    for (i = 0; i < jobs.length; i++){
      newJobsArray[i] = jobs[i];
    }
    newJobsArray[jobs.length++] = newJob;
    jobs = newJobsArray;
    return;
  }

  //removes a job
  public static void removeJob(Job deadJob){
    //search for job to be removed in array
    int copyIndex = 0;
    for (i = 0; i < jobs.length-1; i++){
      if (jobs[i].equals(deadJob)){
        copyIndex++;
      }
      jobs[i] = jobs[copyIndex];
    }
    jobs[jobs.length] = new Job("None");
    return;
  }

  /* figures out the value needed for speed by cycling through disabilities and
  *  adding up speed mods
  */
  private static void setSpeedValue(){
    int speedVal = MAX_SPEED;
    for (i = 0; i < disabilities.length; i++){
      speedVal += disabilities[i].getSpeedValue();
    }
    speed = speedVal;
    return;
  }

  /* figures out the value needed for spoons by cycling through disabilities and
  *  adding up spoons mods
  */
  private static void setSpoonsValue(){
    int spoonsVal = MAX_SPOONS;
    for (i = 0; i < disabilities.length; i++){
      spoonsVal += disabilities[i].getSpoonsValue();
    }
    spoons = spoonsVal;
    return;
  }

  /* figures out the value needed for dext by cycling through disabilities and
  *  adding up dext mods
  */
  private static void setDextValue(){
    int dextVal = MAX_DEXT;
    for (i = 0; i < disabilities.length; i++){
      dextVal += disabilities[i].getDextValue();
    }
    dext = dextVal;
    return;
  }
}
