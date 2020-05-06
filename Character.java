/*Author: Liana Bardallis
* Date: 6 May 2020
* Description: Character object for DisabledLifeSim game
*/

class Character{
  private int money, age, gender, speed, dext, spoons, hunger, thirst;
  private Disability[] disabilities;
  private Job[] jobs;
  private Home house;

  //creates new character
  public Character(){
    money = 0;
    age = 0;
    setupGender();
    setupDisabilities();
    setupJobs();
    house = new Home();
    speed = getSpeedValue();
    dext = getDextValue();
    spoons = getSpoonsValue();
    hunger = 100;
    thirst = 100;
  }

  //initiator for gender TODO
  private static void setupGender(){
    gender = 0;
    return;
  }

  //initiator for disabilities TODO
  private static void setupDisabilities(){
    disabilities = new Disability[1];
    disabilities[0] = new Disability();
    return;
  }

  //initiator for jobs TODO
  private static void setupJobs(){
    jobs = new Job[1];
    jobs[0] = new Job();
    return;
  }

  //figures out the value needed for speed TODO
  private static int getSpeedValue(){
    return 0;
  }

  //figures out the value needed for dext TODO
  private static int getDextValue(){
    return 0;
  }

  //figures out the value needed for spoons TODO
  private static int getSpoonsValue(){
    return 0;
  }
}
