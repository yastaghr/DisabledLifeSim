/*Author: Liana Bardallis
* Date: 6 May 2020
* Description: Character object for DisabledLifeSim game
*/

class Character{
  private int money, age, gender;
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
  }

  //initiator for gender TODO
  private static void setupGender(){
    gender = 0;
    return;
  }

  //initiator for disabilities TODO
  private static void setupDisabilities(){
    disabilities = new Disability[0];
    return;
  }

  //initiator for jobs TODO
  private static void setupJobs(){
    jobs = new Job[0];
    return;
  }

}
