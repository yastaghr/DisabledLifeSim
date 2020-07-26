/*
* Author: Liana Bardallis
* Date: 6 May 2020
* Description: Home object for DisabledLifeSim game
*/

public class Home{
  //values of home
  private int spoonsToll, tax, cost, label;
  private int[] location;
  private String name;

  //constants for no home
  private static final int NO_HOME_LABEL = 0;
  private static final String NO_HOME_NAME = "None";
  private static final int NO_HOME_SPOONSTOLL = 0;
  private static final int NO_HOME_TAX = 0;
  private static final int NO_HOME_COST = 0;

  //constants for Apartment
  private static final int APARTMENT_LABEL = 1;
  private static final String APARTMENT_NAME = "Apartment";
  private static final int APARTMENT_SPOONSTOLL = 4;
  private static final int APARTMENT_TAX = 40;
  private static final int APARTMENT_COST = 4000;

  //constants for CONDO
  private static final int CONDO_LABEL = 2;
  private static final String CONDO_NAME = "Condo";
  private static final int CONDO_SPOONSTOLL = 4;
  private static final int CONDO_TAX = 60;
  private static final int CONDO_COST = 6000;

  //constants for house
  private static final int HOUSE_LABEL = 3;
  private static final String HOUSE_NAME = "House";
  private static final int HOUSE_SPOONSTOLL = 4;
  private static final int HOUSE_TAX = 60;
  private static final int HOUSE_COST = 6000;

  //creates new home given string with Choice/randomize order
  public Home(String choice){
    //if no choice then randomize home data
    if (choice.equals("None")){
      initHome(NO_HOME_LABEL);
    } else if (choice.equals("Apartment")){
      initHome(APARTMENT_LABEL);
    } else if (choice.equals("Condo")){
      initHome(CONDO_LABEL);
    } else if (choice.equals("House")){
      initHome(HOUSE_LABEL);
    } else {
      initializeRandomHome();
    }

    //randomize home position on board after everything else initializes
    randomizeHomePosition();
  }

  //creates new home given identifier label of home TODO
  private static void initHome(int identifier){
    if (identifier == NO_HOME_LABEL){
      initHomeless();
    } else if (identifier == APARTMENT_LABEL){
      initApartment();
    } else if (identifier == CONDO_LABEL){
      initCondo();
    } else if (identifier == HOUSE_LABEL){
      initHouse();
    } else initializeRandomHome();
    return;
  }

  //initializes random home TODO
  private static void initializeRandomHome(){
    return;
  }

  //initializes random location TODO
  private static void randomizeHomePosition(){
    return;
  }

  //initializes homelessness TODO
  private static void initHomeless(){
    return;
  }

  //initializes Apartment TODO
  private static void initApartment(){
    return;
  }

  //initializes condo TODO
  private static void initCondo(){
    return;
  }

  //initializes house TODO
  private static void initHouse(){
    return;
  }
}
