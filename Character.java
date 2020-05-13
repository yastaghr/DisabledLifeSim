/*Author: Liana Bardallis
* Date: 13 May 2020
* Description: Character object for DisabledLifeSim game
*/

class Character{
  private int money, age, gender, speed, dext, spoons, hunger, thirst;
  private Disability[] disabilities;
  private Job[] jobs;
  private Home house;

  private static final int AGENDER = 0;
  private static final int FEMALE = 1;
  private static final int MALE = 2;
  private static final int NONBINARY = 3;
  private static final int GENDERFLUID = 4;

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
    AGENDER/FEMALE/MALE/NONBINARY/GENDERFLUID");
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

  //returns random int cooresponding to randomized gender TODO
  private static int randomGender(){
    return 0;
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
