/* Program: QoA
 * Author: Kenneth Chyzewski & Cameron Harvey
 * Date: 11/26/2014
 * Description: This is what is used to run the game: Quest of the Ages.
 */
import java.io.*;//This is req for command line input

public class QoA 
{
  public static void main(String[] args)
  {
    boolean flag = true; //Used to created a loop that is switched on and off by the flag's declaration
    String userinput = ""; //Used to get the user's input during checkpoints and the end game quit
    do 
    {
      QoAWarrior warrior = new QoAWarrior(); //Created a constructor called warrior
      QoATank tank = new QoATank(); //Created a constructor called tank
      QoAJester jester = new QoAJester(); //Created a constructor called jester
      warrior.intro(); //Displays the intro that is set within the class warrior and only warrior
      userinput = warrior.selectCharacter(); //Asks the user what character they'd like to play as, also set within the class warrior
      
      if (userinput.equalsIgnoreCase ("warrior")) //The storyline when the user types warrior
      { 
        while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
        {
          warrior.chapter1Intro(); //Calls the intro for the forest area
          warrior.choseforestPath(); //Calls the paths that the user may chose from
          flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
          while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
          {
            warrior.forestBoss(); //Calls the boss of the forest area
            flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
            
            while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
            {
              warrior.chapter2Intro(); //Calls the intro to the cave area
              flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
              
              while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
              {
                warrior.caveCenter(); //This calls the next part of the cave
                flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
                
                while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                {
                  warrior.villageIntro(); //Calls the intro to the village area
                  warrior.villageCenter(); 
                  flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
                  
                  while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                  {
                    warrior.villageCenter1(); //
                    flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
                    
                    while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                    {
                      warrior.villageHospital(); //Calls the intro to the hospital area
                      flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
                      
                      while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                      {
                        warrior.castleIntro(); //Calls the intro to the castle area
                        flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
                        
                        while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                        {
                          warrior.castleCenter(); //
                          flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
                          
                          while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                          {
                            warrior.castlePath(); //
                            flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
                            
                            while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                            {
                              warrior.castleShop(); //Calls the shop within the castle
                              flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
                              
                              while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                              {
                                warrior.castleBoss(); //Calls the boss in the castle
                                flag = warrior.sideQuit(); //Once you exit from the class you want to ask about playing again
                                
                                while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                                {
                                  warrior.end(); //Called to ask if the user would like to play again or not
                                  flag = warrior.mainQuit(); //Once you exit from the class you want to ask about playing again
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      else if (userinput.equalsIgnoreCase ("tank")) //The storyline when the user types tank
      {
        while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
        {
          tank.chapter1Intro(); //Calls the intro for the forest area
          tank.choseforestPath(); //Calls the paths that the user may chose from
          flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
          while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
          {
            tank.forestBoss(); //Calls the boss of the forest area
            flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
            
            while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
            {
              tank.chapter2Intro(); //Calls the intro to the cave area
              flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
              
              while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
              {
                warrior.caveCenter(); //This calls the next part of the cave
                flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
                
                while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                {
                  tank.villageIntro(); //Calls the intro to the village area
                  tank.villageCenter(); //
                  flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
                  
                  while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                  {
                    tank.villageCenter1(); //
                    flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
                    
                    while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                    {
                      tank.villageHospital(); //Calls the intro to the hospital area
                      flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
                      
                      while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                      {
                        tank.castleIntro(); //Calls the intro to the castle area
                        flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
                        
                        while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                        {
                          tank.castleCenter(); //
                          flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
                          
                          while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                          {
                            tank.castlePath(); //
                            flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
                            
                            while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                            {
                              tank.castleShop(); //Calls the shop in the castle
                              flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
                              
                              while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                              {
                                tank.castleBoss(); //Calls the boss in the castle
                                flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
                                
                                while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                                {
                                  tank.end(); //Called to ask if the user would like to play again or not
                                  flag = tank.mainQuit(); //Once you exit from the class you want to ask about playing again
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      
      else if(userinput.equalsIgnoreCase ("jester")) //The storyline when the user types jester
      {
        while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
        {
          jester.chapter1Intro(); //Calls the intro for the forest area
          jester.choseforestPath(); //Calls the paths that the user may chose from
          flag = jester.sideQuit(); //Once you exit from the class you want to ask about playing again
          while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
          {
            jester.forestBoss(); //Calls the boss of the forest area
            flag = jester.sideQuit(); //Once you exit from the class you want to ask about playing again
            
            while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
            {
              jester.chapter2Intro(); //Calls the intro to the cave area
              flag = jester.sideQuit(); //Once you exit from the class you want to ask about playing again
              
              while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
              {
                warrior.caveCenter(); //This calls the next part of the cave
                flag = tank.sideQuit(); //Once you exit from the class you want to ask about playing again
                
                while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                {
                  jester.villageIntro(); //Calls the intro to the village area
                  jester.villageCenter(); //
                  flag = jester.sideQuit(); //Once you exit from the class you want to ask about playing again
                  
                  while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                  {
                    jester.villageCenter1(); //
                    flag = jester.sideQuit(); //Once you exit from the class you want to ask about playing again
                    
                    while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                    {
                      jester.villageHospital(); //Calls the intro to the hospital area
                      flag = jester.sideQuit(); //Once you exit from the class you want to ask about playing again
                      
                      while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                      {
                        jester.castleIntro(); //Calls the intro to the castle area
                        flag = jester.sideQuit(); //Once you exit from the class you want to ask about playing again
                        
                        while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                        {
                          jester.castleCenter(); //
                          flag = jester.sideQuit(); //Once you exit from the class you want to ask about playing again
                          
                          while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                          {
                            jester.castlePath(); //
                            flag = jester.sideQuit(); //Once you exit from the class you want to ask about playing again
                            
                            while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                            {
                              jester.castleShop(); //Calls the shop in the castle
                              flag = jester.sideQuit(); //Once you exit from the class you want to ask about playing again
                              
                              while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                              {
                                jester.castleBoss(); //Calls the boss in the castle
                                flag = jester.sideQuit(); //Once you exit from the class you want to ask about playing again
                                
                                while(flag == true) //Continues to the next event in the storyline if the user wants to continue and hasn't died
                                {
                                  jester.end(); //Called to ask if the user would like to play again or not
                                  flag = jester.mainQuit(); //Once you exit from the class you want to ask about playing again
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      
      else //If the user types none of the valid options
      {
        System.out.println("MMMHHHHHHMMMMMHMHMHMMHMH I SAID CHOOSE YOUR CLASS: 'WARRIOR' , 'TANK' or 'JESTER'");
        System.out.println("WE WILL TRY THIS AGAIN UNTIL YOU GET THIS RIGHT.");
      }
    }while(flag == true); //Game will keep looping until either the user dies or quits playing when asked
  }
}     
