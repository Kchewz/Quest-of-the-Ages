/* Program: QoAWarrior
 * Author: Kenneth Chyzewski & Cameron Harvey
 * Description: This code runs the game if the user wants to be a warrior.
 */

import java.io.*;//This is required for command line input

//Public methods
public class QoAJester 
{
  //Private data
  //All variable are kept at the top for neatness
  private InputStreamReader isr = new InputStreamReader(System.in);
  private BufferedReader br = new BufferedReader(isr);
  private String quit = ""; //Create a string to support what the user inputs when quitting
  private String userinput = ""; //Create a string to support what the user inputs
  private boolean flag = true; //This variable holds the loop as true or false (repeat or end
  private boolean flag1 = true; //This variable holds the loop as true or false (repeat or end)
  private boolean flag2 = true; //This variable holds the loop as true or false (repeat or end)
  private boolean flag3 = true; //This variable holds the loop as true or false (repeat or end)
  private boolean flag4 = true; //This variable holds the loop as true or false (repeat or end)
  private boolean flag5 = true; //This variable holds the loop as true or false (repeat or end)
  private boolean flag6 = true; //This variable holds the loop as true or false (repeat or end)
  private boolean flag7 = true; //This variable holds the loop as true or false (repeat or end)
  private boolean flag8 = true; //This variable holds the loop as true or false (repeat or end)
  private boolean flag9 = true; //This variable holds the loop as true or false (repeat or end)
  private boolean flag10 = true; //This variable holds the loop as true or false (repeat or end)
  private boolean flag11 = true; //This variable holds the loop as true or false (repeat or end)
  private int jesterh = 40; //This variable holds the warrior's health
  private int jestera = 30; //This variable holds the warrior's attack
  private int level = 0; //This variable holds the users level
  private int randomnum1 = 0; //This variable holds the random generated number used for avoiding and fighting
  private int gold = 0; //This variable holds the users gold earned from battles
  private int treeh = 60; //This variable holds the tree's health
  private int treea = 10; //This variable holds the tree's attack
  private int hashiramah = 150; //This variable holds the hashirama's health
  private int hashiramaa = 20; //This variable holds the hashirama's attack
  private int gollurkh = 130; //This variable holds the gollurk's health
  private int gollurka = 30; //This variable holds the gollurk's attack
  private int booh = 100; //This variable holds the boo's health
  private int booa = 40; //This variable holds the boo's attack
  private int vampirebath = 10; //This variable holds the vampirebat's health
  private int vampirebata = 40; //This variable holds the vampirebat's attack
  private int draculah = 100; //This variable holds the dracula's health
  private int draculaa = 60; //This variable holds the dracula's attack
  private int redeadh = 120; //This variable holds the redead's health
  private int redeada = 50; //This variable holds the redead's attack
  private int kingbooh = 750; //This variable holds the kingboo's health
  private int kingbooa = 10; //This variable holds the kingboo's attack
  private int celljrh = 150; //This variable holds the cell's health
  private int celljra = 50; //This variable holds the cell's attack
  private int ridleyh = 750; //This variable holds the ridley's health
  private int ridleya = 80; //This variable holds the ridley's attack
  private int quickclaw = 1; //This variable holds the amount of the item remains in the shop
  private int assaultvest = 1; //This variable holds the amount of the item remains in the shop
  private int[] Inv = new int[4]; //This variable holds the inventory
  private int[] Stats = {jesterh, jestera, gold, level}; //This variable shows whats stored within the array
  private String[] Patty = new String[5]; //This variable hold the toppings
  private String[] Toppings = {"", "", "", "", ""}; //This varriable stores the toppings the user input on their patty
  
  public void getInput() //Built and called for whenever the user is making a decision
  { 
    try
    {
      userinput = br.readLine();
    } 
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
  }
  
  public void generator() //Used to generate the number used in the avoiding and fighting methods. Also the chance of a critical hit as well as the hidden gambling bar 
  {
    randomnum1 = (int)(Math.random() * 10) + 1; //Generates a random number between 1 and 10
  }
  
  public void chapter1Intro() //Displays the opening of the first chapter
  { 
    System.out.println("Really, you woke up as a Court Jester... WHY?!");
    System.out.println("");
    System.out.println("You wake up as a jester. You see outside your window that the kingdom is under attack!!!!");
    System.out.println("In the spur of the moment, you run out of your house and run straight to The Forest of Trees.");
    System.out.println("At the beginning of the forest you come across two different paths branching off. Which path do you chose? Left or right?");
    System.out.println("Type 'left' or 'right'.");
  }
  
  public void choseforestPath() //This method allows the user which path they want to chose
  { 
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase("Left")) //If they chose left then this if statement will call forestLeft
    { 
      forestLeft(); //Called if the user chooses to take the left path 
    }
    else if (userinput.equalsIgnoreCase("Right")) //If they chose right then this if statement will call forestRight
    { 
      forestRight(); //Called if the user chooses to take the right path
    }
    else //If the user types niether right or left, user is forced to go on the left path
    {
      System.out.println("You had a epileptic moment and screamed " + userinput + ". So you decided to take the left path.");
      forestLeft();
    }
  }
  
  public void forestLeft() //Following events occur when the user takes the left path
  {
    System.out.println("You head down the left path of the forest, where you peak through the bushes and see a tree ent in your path.");
    System.out.println("'Should I take my chances to avoid it or just end its life'.");
    System.out.println("Type 'fight' or 'avoid'.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase ("fight")) //If the user types fight, the fighting method is called and starts the fighting sequence
    {
      fighting1(); //Called if the user chooses to fight the enemy
    } 
    else if (userinput.equalsIgnoreCase ("avoid")) //If the user types avoid, the avoiding method is called and the user takes chance if they can sneak past the enemy
    {
      avoiding1(); //Called if the user chooses to avoid the enemy
    }
    else //If the user does not type either, the user alerts the enemy and a battle commences
    {
      System.out.println("You had another epileptic moment and screamed " + userinput + " at the top of your lungs and alerted the tree end. 'Man I gotta stop and think once in a while'.");
      fighting1(); //Called if the user types an invalid statement and fights the enemy
    }
  }
  
  public void forestRight() //Following events occur when the user takes the right path
  {
    System.out.println("You walk down the right path and you find absolutely nothing. 'I knew I should've have taken the left path'.");
  }
  
  public void avoiding1() //A random number is generated and is checked to see if the user can escape or not
  {
    if(randomnum1 >= 2) //Checks the random number to see if it belongs in this if statement
    {
      System.out.println("You managed to avoid the creature and moved on.");
    } 
    else //Checks the random number to see if it belongs in this else statement
    {
      System.out.println("You have been spotted!");
      fighting1(); //The number is greater than 5, therefore being spotted and the battle begins
    }
  }
  
  public void avoiding3() //A random number is generated and is checked to see if the user can escape or not
  {
    if(randomnum1 >= 2) //Checks the random number to see if it belongs in this if statement
    { 
      System.out.println("You managed to avoid the creature and moved on.");
    } 
    else //Checks the random number to see if it belongs in this else statement
    {
      System.out.println("You have been spotted!");
      fighting3(); //The number is greater than 5, therefore being spotted and the battle begins
    }
  }
  
  public void avoiding4() //A random number is generated and is checked to see if the user can escape or not
  {
    if(randomnum1 >= 2) //Checks the random number to see if it belongs in this if statement
    { 
      System.out.println("You managed to avoid the creature and moved on.");
    } 
    else //Checks the random number to see if it belongs in this else statement
    {
      System.out.println("You have been spotted!");
      fighting5(); //The number is greater than 5, therefore being spotted and the battle begins
    }
  }
  
  public void avoiding5() //A random number is generated and is checked to see if the user can escape or not
  {
    if(randomnum1 >= 2) //Checks the random number to see if it belongs in this if statement
    { 
      System.out.println("You managed to avoid the creature and moved on.");
    } 
    else //Checks the random number to see if it belongs in this else statement
    {
      System.out.println("You have been spotted!");
      fighting5(); //The number is greater than 5, therefore being spotted and the battle begins
    }
  }
  
  public void avoiding6() //A random number is generated and is checked to see if the user can escape or not
  {
    if(randomnum1 >= 2) //Checks the random number to see if it belongs in this if statement
    { 
      System.out.println("You managed to avoid the creature and moved on.");
    } 
    else //Checks the random number to see if it belongs in this else statement
    {
      System.out.println("You have been spotted!");
      fighting6(); //The number is greater than 5, therefore being spotted and the battle begins
    }
  }
  
  public void avoiding7() //A random number is generated and is checked to see if the user can escape or not
  {
    if(randomnum1 >= 2) //Checks the random number to see if it belongs in this if statement
    { 
      System.out.println("You managed to avoid the creature and moved on.");
    } 
    else //Checks the random number to see if it belongs in this else statement
    {
      System.out.println("You have been spotted!");
      fighting7(); //The number is greater than 5, therefore being spotted and the battle begins
    }
  }
  
  public void fighting1() //A random number is generated and that number is checked to see what event will occur
  {
    do
    {
      if(randomnum1 >= 9) //Checks the random number to see if it belongs in this if statement
      { 
        System.out.println("You hit with a flurry of attacks!");
        inflictDamage1(); //Based from the random number, the user unleashes a flurry of attacks on the enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      } 
      else if(randomnum1 <= 4) //Checks the random number to see if it belongs in this else if statement
      {
        System.out.println("You missed and took damage!");
        loseHealth1(); //Based from the random number, the enemy attacks the user and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
      else //Checks the random number to see if it belongs in this else statement
      {
        System.out.println("You hit it, and inflicted damage on it!");
        inflictDamage1(); //Based from the random number, the user attacks an enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
    }while(flag1 == true); //Fighting1's loop will never end until either the user's or the enemy's health is 0 or below 0
  }
  
  public void fighting2()
  {
    do
    {
      if(randomnum1 >= 9) //Checks the random number to see if it belongs in this if statement
      { 
        System.out.println("You hit with a flurry of attacks!");
        inflictDamage2(); //Based from the random number, the user unleashes a flurry of attacks on the enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      } 
      else if(randomnum1 <= 4) //Checks the random number to see if it belongs in this else if statement
      {
        System.out.println("You missed and took damage!");
        loseHealth2(); //Based from the random number, the enemy attacks the user and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
      else //Checks the random number to see if it belongs in this else statement
      {
        System.out.println("You hit it, and inflicted damage on it!");
        inflictDamage2(); //Based from the random number, the user attacks an enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
    }while(flag2); //Fighting2's loop will never end until either the user's or the enemy's health is 0 or below 0
  }
  
  public void fighting3() 
  {
    do
    {
      if(randomnum1 >= 9) //Checks the random number to see if it belongs in this if statement
      { 
        System.out.println("You hit with a flurry of attacks!");
        inflictDamage3(); //Based from the random number, the user unleashes a flurry of attacks on the enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      } 
      else if(randomnum1 <= 4) //Checks the random number to see if it belongs in this else if statement
      {
        System.out.println("You missed and took damage!");
        loseHealth3(); //Based from the random number, the enemy attacks the user and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
      else //Checks the random number to see if it belongs in this else statement
      {
        System.out.println("You hit it, and inflicted damage on it!");
        inflictDamage3(); //Based from the random number, the user attacks an enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
    } while(flag3); //Fighting3's loop will never end until either the user's or the enemy's health is 0 or below 0
  }
  
  public void fighting4()
  {
    do
    {
      if(randomnum1 >= 9) //Checks the random number to see if it belongs in this if statement
      { 
        System.out.println("You hit with a flurry of attacks!");
        inflictDamage4(); //Based from the random number, the user unleashes a flurry of attacks on the enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      } 
      else if(randomnum1 <= 4) //Checks the random number to see if it belongs in this else if statement
      {
        System.out.println("You missed and took damage!");
        loseHealth4(); //Based from the random number, the enemy attacks the user and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
      else //Checks the random number to see if it belongs in this else statement
      {
        System.out.println("You hit it, and inflicted damage on it!");
        inflictDamage4(); //Based from the random number, the user attacks an enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
    }while(flag4); //Fighting4's loop will never end until either the user's or the enemy's health is 0 or below 0
  } 
  
  public void fighting5() 
  {
    do
    {
      if(randomnum1 >= 9) //Checks the random number to see if it belongs in this if statement
      { 
        System.out.println("You hit with a flurry of attacks!");
        inflictDamage5(); //Based from the random number, the user unleashes a flurry of attacks on the enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      } 
      else if(randomnum1 <= 4) //Checks the random number to see if it belongs in this else if statement
      {
        System.out.println("You missed and took damage!");
        loseHealth5(); //Based from the random number, the enemy attacks the user and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
      else //Checks the random number to see if it belongs in this else statement
      {
        System.out.println("You hit it, and inflicted damage on it!");
        inflictDamage5(); //Based from the random number, the user attacks an enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
    }while(flag5); //Fighting5's loop will never end until either the user's or the enemy's health is 0 or below 0
  } 
  
  public void fighting6()
  {
    do
    {
      if(randomnum1 >= 9) //Checks the random number to see if it belongs in this if statement
      { 
        System.out.println("You hit with a flurry of attacks!");
        inflictDamage6(); //Based from the random number, the user unleashes a flurry of attacks on the enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      } 
      else if(randomnum1 <= 4) //Checks the random number to see if it belongs in this else if statement
      {
        System.out.println("You missed and took damage!");
        loseHealth6(); //Based from the random number, the enemy attacks the user and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
      else //Checks the random number to see if it belongs in this else statement
      {
        System.out.println("You hit it, and inflicted damage on it!");
        inflictDamage6(); //Based from the random number, the user attacks an enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
    } while(flag6); //Fighting6's loop will never end until either the user's or the enemy's health is 0 or below 0
  } 
  
  public void fighting7()
  {
    do
    {
      if(randomnum1 >= 9) //Checks the random number to see if it belongs in this if statement
      { 
        System.out.println("You hit with a flurry of attacks!");
        inflictDamage7(); //Based from the random number, the user unleashes a flurry of attacks on the enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      } 
      else if(randomnum1 <= 4) //Checks the random number to see if it belongs in this else if statement
      {
        System.out.println("You missed and took damage!");
        loseHealth7(); //Based from the random number, the enemy attacks the user and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
      else //Checks the random number to see if it belongs in this else statement
      {
        System.out.println("You hit it, and inflicted damage on it!");
        inflictDamage7(); //Based from the random number, the user attacks an enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
    } while(flag7); //Fighting7's loop will never end until either the user's or the enemy's health is 0 or below 0
  } 
  
  public void fighting8()
  {
    do
    {
      if(randomnum1 >= 9) //Checks the random number to see if it belongs in this if statement
      { 
        System.out.println("You hit with a flurry of attacks!");
        inflictDamage8(); //Based from the random number, the user unleashes a flurry of attacks on the enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      } 
      else if(randomnum1 <= 4) //Checks the random number to see if it belongs in this else if statement
      {
        System.out.println("You missed and took damage!");
        loseHealth8(); //Based from the random number, the enemy attacks the user and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
      else //Checks the random number to see if it belongs in this else statement
      {
        System.out.println("You hit it, and inflicted damage on it!");
        inflictDamage8(); //Based from the random number, the user attacks an enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
    } while(flag8 == true); //Fighting8's loop will never end until either the user's or the enemy's health is 0 or below 0
  }
  
  public void fighting9()
  {
    do
    {
      if(randomnum1 >= 9) //Checks the random number to see if it belongs in this if statement
      { 
        System.out.println("You hit with a flurry of attacks!");
        inflictDamage9(); //Based from the random number, the user unleashes a flurry of attacks on the enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      } 
      else if(randomnum1 <= 4) //Checks the random number to see if it belongs in this else if statement
      {
        System.out.println("You missed and took damage!");
        loseHealth9(); //Based from the random number, the enemy attacks the user and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
      else //Checks the random number to see if it belongs in this else statement
      {
        System.out.println("You hit it, and inflicted damage on it!");
        inflictDamage9(); //Based from the random number, the user attacks an enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
    } while(flag9 == true); //Fighting9's loop will never end until either the user's or the enemy's health is 0 or below 0
  }
  
  public void fighting10()
  {
    do
    {
      if(randomnum1 >= 9) //Checks the random number to see if it belongs in this if statement
      { 
        System.out.println("You hit a with a flurry of attacks!");
        inflictDamage10(); //Based from the random number, the user unleashes a flurry of attacks on the enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      } 
      else if(randomnum1 <= 4) //Checks the random number to see if it belongs in this else if statement
      {
        System.out.println("You missed and took damage!");
        loseHealth10(); //Based from the random number, the enemy attacks the user and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
      else //Checks the random number to see if it belongs in this else statement
      {
        System.out.println("You hit it, and inflicted damage on it!");
        inflictDamage10(); //Based from the random number, the user attacks an enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
    } while(flag10 == true); //Fighting10's loop will never end until either the user's or the enemy's health is 0 or below 0
  }
  
  public void fighting11()
  {
    do
    {
      if(randomnum1 >= 9) //Checks the random number to see if it belongs in this if statement
      { 
        System.out.println("You hit a with a flurry of attacks!");
        inflictDamage11(); //Based from the random number, the user unleashes a flurry of attacks on the enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      } 
      else if(randomnum1 <= 4) //Checks the random number to see if it belongs in this else if statement
      {
        System.out.println("You missed and took damage!");
        loseHealth11(); //Based from the random number, the enemy attacks the user and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
      else //Checks the random number to see if it belongs in this else statement
      {
        System.out.println("You hit it, and inflicted damage on it!");
        inflictDamage11(); //Based from the random number, the user attacks an enemy and the health calculations begin
        generator(); //Generates a random number for the following turn
      }
    } while(flag11 == true); //Fighting11's loop will never end until either the user's or the enemy's health is 0 or below 0
  }
  
  public void loseHealth1() //Luck is not on the user's side and they take damage
  {
    jesterh = jesterh - treea; //The user's health is subtracted by the enemy's attack variable
    System.out.println("Your health: " + jesterh); //Displays your current health at the end of that turn
    
    if(jesterh <= 0) //The if occurs when the user's health variable is 0 or below 0
    {
      System.out.println("You died a horrible death.");
      System.out.println("GAME OVER");
      flag1 = false; //The program realizes the user's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  
  public void loseHealth2() //Luck is not on the user's side and they take damage
  {
    jesterh = jesterh - hashiramaa; //The user's health is subtracted by the enemy's attack variable
    System.out.println("Your health: " + jesterh); //Displays your current health at the end of that turn
    
    if(jesterh <= 0) //The if occurs when the user's health variable is 0 or below 0
    {
      System.out.println("You died a horrible death");
      System.out.println("GAME OVER");
      flag2 = false; //The program realizes the user's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  
  public void loseHealth3() //Luck is not on the user's side and they take damage
  {
    jesterh = jesterh - gollurka; //The user's health is subtracted by the enemy's attack variable
    System.out.println("Your health: " + jesterh); //Displays your current health at the end of that turn
    
    if(jesterh <= 0) //The if occurs when the user's health variable is 0 or below 0
    {
      System.out.println("You died a horrible death.");
      System.out.println("GAME OVER");
      flag3 = false; //The program realizes the user's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  
  public void loseHealth4() //Luck is not on the user's side and they take damage
  {
    jesterh = jesterh - booa; //The user's health is subtracted by the enemy's attack variable
    System.out.println("Your health: " + jesterh); //Displays your current health at the end of that turn
    
    if(jesterh <= 0) //The if occurs when the user's health variable is 0 or below 0
    {
      System.out.println("You died a horrible death");
      System.out.println("GAME OVER");
      flag4 = false; //The program realizes the user's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  
  public void loseHealth5() //Luck is not on the user's side and they take damage
  {
    jesterh = jesterh - vampirebata; //The user's health is subtracted by the enemy's attack variable
    if(jesterh != jesterh) //Only occurs if the user chose to take the horse and both take damage
    { 
      System.out.println("You guys got hit by surprised by the bat, and both took damage. The horse was killed. :(");
    }    
    System.out.println("Your health: " + jesterh); //Displays your current health at the end of that turn
    
    if(jesterh <= 0) //The if occurs when the user's health variable is 0 or below 0
    {
      System.out.println("You died a horrible death");
      System.out.println("GAME OVER");
      flag5 = false; //The program realizes the user's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  
  public void loseHealth6() //Luck is not on the user's side and they take damage
  { 
    jesterh = jesterh - vampirebata; //The user's health is subtracted by the enemy's attack variable
    System.out.println("Your health: " + jesterh); //Displays your current health at the end of that turn
    
    if(jesterh <= 0) //The if occurs when the user's health variable is 0 or below 0
    {
      System.out.println("You died a horrible death.");
      System.out.println("GAME OVER");
      flag6 = false; //The program realizes the user's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  
  public void loseHealth7() //Luck is not on the user's side and they take damage
  { 
    jesterh = jesterh - draculaa; //The user's health is subtracted by the enemy's attack variable
    System.out.println("Your health: " + jesterh); //Displays your current health at the end of that turn
    
    if(jesterh <= 0) //The if occurs when the user's health variable is 0 or below 0
    {
      System.out.println("You died a horrible death.");
      System.out.println("GAME OVER");
      flag7 = false; //The program realizes the user's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  
  public void loseHealth8() //Luck is not on the user's side and they take damage
  { 
    jesterh = jesterh - redeada; //The user's health is subtracted by the enemy's attack variable
    System.out.println("Your health: " + jesterh); //Displays your current health at the end of that turn
    
    if(jesterh <= 0) //The if occurs when the user's health variable is 0 or below 0
    {
      System.out.println("You died a horrible death.");
      System.out.println("GAME OVER");
      flag8 = false; //The program realizes the user's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  public void loseHealth9() //Luck is not on the user's side and they take damage
  { 
    jesterh = jesterh - kingbooa; //The user's health is subtracted by the enemy's attack variable
    System.out.println("Your health: " + jesterh); //Displays your current health at the end of that turn
    
    if(jesterh <= 0) //The if occurs when the user's health variable is 0 or below 0
    {
      System.out.println("You died a horrible death.");
      System.out.println("GAME OVER");
      flag9 = false; //The program realizes the user's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  
  public void loseHealth10() //Luck is not on the user's side and they take damage
  { 
    jesterh = jesterh - celljra; //The user's health is subtracted by the enemy's attack variable
    System.out.println("Your health: " + jesterh); //Displays your current health at the end of that turn
    
    if(jesterh <= 0) //The if occurs when the user's health variable is 0 or below 0
    {
      System.out.println("You died a horrible death.");
      System.out.println("GAME OVER");
      flag10 = false; //The program realizes the user's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  
  public void loseHealth11() //Luck is not on the user's side and they take damage
  { 
    jesterh = jesterh - ridleya; //The user's health is subtracted by the enemy's attack variable
    System.out.println("Your health: " + jesterh); //Displays your current health at the end of that turn
    
    if(jesterh <= 0) //The if occurs when the user's health variable is 0 or below 0
    {
      System.out.println("You died a horrible death.");
      System.out.println("GAME OVER");
      flag11 = false; //The program realizes the user's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  
  public void inflictDamage1() //Luck is on the user's side and they deal damage
  {
    if(randomnum1 >= 9) //If the random number is or greater than 9, the user performs a normal attack 3 times
    { 
      for(int counter1 = 0; counter1 < 3; counter1++) //The loop is used to make the user deal 3 times the damage to the enemy
      {
        treeh = treeh - jestera; //The enemy's health is subtracted by the user's attack variable 3 times
        System.out.println("Tree's health: " + treeh); //Displays the enemy's current health at the end of that turn
      }
    } 
    else //Performs a normal single attack
    {
      treeh = treeh - jestera; //The enemy's health is subtracted by the user's attack variable 
      System.out.println("Tree's health: " + treeh); //Displays the enemy's current health at the end of that turn
    }
    
    if(treeh <= 0) //When the enemys health is 0 or below 0, this if statement occurs and ends the battle
    {
      System.out.println("You have slit the tree ents roots open and it fell to the ground.");
      gold = gold + 5; //Adds your earned gold to your total gold
      System.out.println("You have earned: " + gold + " gold"); //Notifies the user what's their total amount of gold
      flag1 = false; //The program realizes the enemy's health is 0 or below 0, therefore the flag is set to false and the battle ends
    }
  }
  
  public void inflictDamage2() //Luck is on the user's side and they deal damage
  {
    if(randomnum1 >= 9) //If the random number is or greater than 9, the user performs a normal attack 3 times
    { 
      for(int counter2 = 0; counter2 < 3; counter2++) //The loop is used to make the user deal 3 times the damage to the enemy
      {
        hashiramah = hashiramah - jestera; //The enemy's health is subtracted by the user's attack variable 3 times
        System.out.println("Hashirama's health: " + hashiramah); //Displays the enemy's current health at the end of that turn
      }
    } 
    else //Performs a normal single attack
    {
      hashiramah = hashiramah - jestera; //The enemy's health is subtracted by the user's attack variable
      System.out.println("Hashirama's health: " + hashiramah); //Displays the enemy's current health at the end of that turn
    }
    
    if(hashiramah <= 0) //When the enemys health is 0 or below 0, this if statement occurs and ends the battle
    {
      System.out.println("You have cut him upon into lumber.");
      flag2 = false; //The program realizes the enemy's health is 0 or below 0, therefore the flag is set to false and the battle ends
      level++; //Adds 1 to the level when defeating the boss to gain a increase in health and attack
      System.out.println("You have successfully defeated Hashirama. YOU HAVE LEVELED UP!!!!!!!");
      hashiramah = 150; //Resets the enemy's health at the end of the battle therefore it can be re-used again
      gold = gold + 10; //Adds your earned gold to your total gold
      System.out.println("You have earned: " + gold + " gold"); //Notifies the user what's their total amount of gold
      forestShop(); //Once the path is cleared the next event occurs: the kecleon shop
    }
  }
  
  public void inflictDamage3() //Luck is on the user's side and they deal damage
  {
    if(randomnum1 >= 9) //If the random number is or greater than 9, the user performs a normal attack 3 times
    { 
      for(int counter3 = 0; counter3 < 3; counter3++) //The loop is used to make the user deal 3 times the damage to the enemy
      {
        gollurkh = gollurkh - jestera; //The enemy's health is subtracted by the user's attack variable 3 times
        System.out.println("Gollurk's health: " + gollurkh); //Displays the enemy's current health at the end of that turn
      }
    } 
    else //Performs a normal single attack
    {
      gollurkh = gollurkh - jestera; //The enemy's health is subtracted by the user's attack variable
      System.out.println("Gollurk's health: " + gollurkh); //Displays the enemy's current health at the end of that turn
    }
    
    if(gollurkh <= 0) //When the enemys health is 0 or below 0, this if statement occurs and ends the battle
    {
      System.out.println("Its super effective.");
      System.out.println("The wild Gollurk has fainted.");
      flag3 = false; //The program realizes the enemy's health is 0 or below 0, therefore the flag is set to false and the battle ends
      gold = gold + 5; //Adds your earned gold to your total gold
      gollurkh = 130; //Resets the enemy's health at the end of the battle therefore it can be re-used again
      System.out.println("You have earned: " + gold + " gold"); //Notifies the user what's their total amount of gold
    }
  }
  
  public void inflictDamage4() //Luck is on the user's side and they deal damage
  {
    if(randomnum1 >= 9) //If the random number is or greater than 9, the user performs a normal attack 3 times
    { 
      for(int counter4 = 0; counter4 < 3; counter4++) //The loop is used to make the user deal 3 times the damage to the enemy
      {
        booh = booh - jestera; //The enemy's health is subtracted by the user's attack variable 3 times
        System.out.println("Boo's health: " + booh); //Displays the enemy's current health at the end of that turn
      }
    } 
    else //Performs a normal single attack
    {
      booh = booh - jestera; //The enemy's health is subtracted by the user's attack variable
      System.out.println("Boo's health: " + booh); //Displays the enemy's current health at the end of that turn
    }
    
    if(booh <= 0) //When the enemys health is 0 or below 0, this if statement occurs and ends the battle
    {
      System.out.println("Boo was stunned, so you whipped out a jar and caught him then put it on a random shelf.");
      flag4 = false; //The program realizes the enemy's health is 0 or below 0, therefore the flag is set to false and the battle ends
      gold = gold + 5; //Adds your earned gold to your total gold
      booh = 100; //Resets the enemy's health at the end of the battle therefore it can be re-used again
      System.out.println("You have earned: " + gold + " gold"); //Notifies the user what's their total amount of gold
    }
  }
  
  public void inflictDamage5() //Luck is on the user's side and they deal damage
  { 
    if(randomnum1 >= 9) //If the random number is or greater than 9, the user performs a normal attack 3 times
    { 
      for(int counter5 = 0; counter5 < 3; counter5++) //The loop is used to make the user deal 3 times the damage to the enemy
      {
        vampirebath = vampirebath - jestera; //The enemy's health is subtracted by the user's attack variable 3 times
        System.out.println("Vampire's health: " + vampirebath); //Displays the enemy's current health at the end of that turn
      }
    } 
    else //Performs a normal single attack
    {
      vampirebath = vampirebath - jestera; //The enemy's health is subtracted by the user's attack variable
      System.out.println("Vampire's health: " + vampirebath); //Displays the enemy's current health at the end of that turn
    }
    
    if(vampirebath <= 0) //When the enemys health is 0 or below 0, this if statement occurs and ends the battle
    {
      System.out.println("You flashed him and he turned to ash, by your uglyness.");
      flag5 = false; //The program realizes the enemy's health is 0 or below 0, therefore the flag is set to false and the battle ends
      gold = gold + 5; //Adds your earned gold to your total gold
      System.out.println("You have earned: " + gold + " gold"); //Notifies the user what's their total amount of gold
    }
  }
  
  public void inflictDamage6() //Luck is on the user's side and they deal damage
  {  
    if(randomnum1 >= 9) //If the random number is or greater than 9, the user performs a normal attack 3 times
    { 
      for(int counter6 = 0; counter6 < 3; counter6++) //The loop is used to make the user deal 3 times the damage to the enemy
      {
        vampirebath = vampirebath - jestera; //The enemy's health is subtracted by the user's attack variable 3 times
        System.out.println("Vampire's health: " + vampirebath); //Displays the enemy's current health at the end of that turn
      }
    } 
    else //Performs a normal single attack
    {
      vampirebath = vampirebath - jestera; //The enemy's health is subtracted by the user's attack variable
      System.out.println("Vampire's health: " + vampirebath); //Displays the enemy's current health at the end of that turn
    }
    
    if(vampirebath <= 0) //When the enemys health is 0 or below 0, this if statement occurs and ends the battle
    {
      System.out.println("You flashed him and he turned to ash, by your uglyiness.");
      flag6 = false; //The program realizes the enemy's health is 0 or below 0, therefore the flag is set to false and the battle ends
      gold = gold + 5; //Adds your earned gold to your total gold
      System.out.println("You have earned: " + gold + " gold"); //Notifies the user what's their total amount of gold
    }
  }
  
  public void inflictDamage7() //Luck is on the user's side and they deal damage
  { 
    if(randomnum1 >= 9) //If the random number is or greater than 9, the user performs a normal attack 3 times
    { 
      for(int counter7 = 0; counter7 < 3; counter7++) //The loop is used to make the user deal 3 times the damage to the enemy
      {
        draculah = draculah - jestera; //The enemy's health is subtracted by the user's attack variable 3 times
        System.out.println("Dracula's health: " + draculah); //Displays the enemy's current health at the end of that turn
      }
    } 
    else //Performs a normal single attack
    {
      draculah = draculah - jestera; //The enemy's health is subtracted by the user's attack variable
      System.out.println("Dracula's health: " + draculah); //Displays the enemy's current health at the end of that turn
    }
    
    if(draculah <= 0) //When the enemys health is 0 or below 0, this if statement occurs and ends the battle
    {
      System.out.println("You had a cross chain and threw it at him, and the POWER OF CHRIST COMPELLED HIM.");
      flag7 = false; //The program realizes the enemy's health is 0 or below 0, therefore the flag is set to false and the battle ends
      level++; //Adds 1 to the level when defeating the boss to gain a increase in health and attack
      draculah = 100; //Resets the enemy's health at the end of the battle therefore it can be re-used again
      gold = gold + 10; //Adds your earned gold to your total gold
      System.out.println("You have earned: " + gold + " gold"); //Notifies the user what's their total amount of gold
    }
  }
  
  public void inflictDamage8() //Luck is on the user's side and they deal damage
  {  
    if(randomnum1 >= 9) //If the random number is or greater than 9, the user performs a normal attack 3 times
    { 
      for(int counter8 = 0; counter8 < 3; counter8++) //The loop is used to make the user deal 3 times the damage to the enemy
      {
        redeadh = redeadh - jestera; //The enemy's health is subtracted by the user's attack variable 3 times
        System.out.println("Redead's health: " + redeadh); //Displays the enemy's current health at the end of that turn
      }
    } 
    else //Performs a normal single attack
    {
      redeadh = redeadh - jestera; //The enemy's health is subtracted by the user's attack variable
      System.out.println("Redead's health: " + redeadh); //Displays the enemy's current health at the end of that turn
    }
    
    if(redeadh <= 0) //When the enemys health is 0 or below 0, this if statement occurs and ends the battle
    {
      System.out.println("You pulled out the master sword and cut him in half.");
      flag8 = false; //The program realizes the enemy's health is 0 or below 0, therefore the flag is set to false and the battle ends
      gold = gold + 5; //Adds your earned gold to your total gold
      redeadh = 120; //Resets the enemy's health at the end of the battle therefore it can be re-used again
      System.out.println("You have earned: " + gold + " gold"); //Notifies the user what's their total amount of gold
    }
  }
  
  public void inflictDamage9() //Luck is on the user's side and they deal damage
  { 
    if(randomnum1 >= 9) //If the random number is or greater than 9, the user performs a normal attack 3 times
    { 
      for(int counter9 = 0; counter9 < 3; counter9++) //The loop is used to make the user deal 3 times the damage to the enemy
      {
        kingbooh = kingbooh - jestera; //The enemy's health is subtracted by the user's attack variable 3 times
        System.out.println("King Boo's health: " + kingbooh); //Displays the enemy's current health at the end of that turn
      }
    } 
    else //Performs a normal single attack
    {
      kingbooh = kingbooh - jestera; //The enemy's health is subtracted by the user's attack variable
      System.out.println("King Boo's health: " + kingbooh); //Displays the enemy's current health at the end of that turn
    }
    
    if(kingbooh <= 0) //When the enemys health is 0 or below 0, this if statement occurs and ends the battle
    {
      System.out.println("You poured the IV on him, and then smashed his face in with the pole.");
      flag9 = false; //The program realizes the enemy's health is 0 or below 0, therefore the flag is set to false and the battle ends
      gold = gold + 10; //Adds your earned gold to your total gold
      level++; //Adds 1 to the level when defeating the boss to gain a increase in health and attack
      System.out.println("You have earned: " + gold + " gold"); //Notifies the user what's their total amount of gold
    }
  }
  
  public void inflictDamage10() //Luck is on the user's side and they deal damage
  {   
    if(randomnum1 >= 9) //If the random number is or greater than 9, the user performs a normal attack 3 times
    { 
      for(int counter10 = 0; counter10 < 3; counter10++) //The loop is used to make the user deal 3 times the damage to the enemy
      {
        celljrh = celljrh - jestera; //The enemy's health is subtracted by the user's attack variable 3 times
        System.out.println("Cell Jr's health: " + celljrh); //Displays the enemy's current health at the end of that turn
      }
    } 
    else //Performs a normal single attack
    {
      celljrh = celljrh - jestera; //The enemy's health is subtracted by the user's attack variable
      System.out.println("Cell Jr's health: " + celljrh); //Displays the enemy's current health at the end of that turn
    }
    
    if(celljrh <= 0) //When the enemys health is 0 or below 0, this if statement occurs and ends the battle
    {
      System.out.println("You kamehameha-ed it and it burnt to a crisp.");
      flag10 = false; //The program realizes the enemy's health is 0 or below 0, therefore the flag is set to false and the battle ends
      gold = gold + 5; //Adds your earned gold to your total gold
      celljrh = 150; //Resets the enemy's health at the end of the battle therefore it can be re-used again
      System.out.println("You have earned: " + gold + " gold"); //Notifies the user what's their total amount of gold
    }
  }
  
  public void inflictDamage11() //Luck is on the user's side and they deal damage
  { 
    if(randomnum1 >= 9) //If the random number is or greater than 9, the user performs a normal attack 3 times
    { 
      for(int counter11 = 0; counter11 < 3; counter11++) //The loop is used to make the user deal 3 times the damage to the enemy
      {
        ridleyh = ridleyh - jestera; //The enemy's health is subtracted by the user's attack variable 3 times
        System.out.println("Ridley's health: " + ridleyh); //Displays the enemy's current health at the end of that turn
      }
    } 
    else //Performs a normal single attack
    {
      ridleyh = ridleyh - jestera; //The enemy's health is subtracted by the user's attack variable
      System.out.println("Ridley's health: " + ridleyh); //Displays the enemy's current health at the end of that turn
    }
    
    if(ridleyh <= 0) //When the enemys health is 0 or below 0, this if statement occurs and ends the battle
    {
      System.out.println("You charged up and fired the Zero Lazer at Ridely, and it disintegrated it.");
      flag11 = false; //The program realizes the enemy's health is 0 or below 0, therefore the flag is set to false and the battle ends
      gold = gold + 10; //Adds your earned gold to your total gold
      System.out.println("You have earned: " + gold + " gold"); //Notifies the user what's their total amount of gold
    }
  }
  
  public void forestBoss() 
  {
    System.out.println("You come across Hashirama the wood style user from the Hidden Leaf Village, well according to his name tag. 'I think this is the boss of the area'");
    fighting2(); //Calls the fighting sequence for the first boss: Hashirama
  }
  
  public void forestShop()
  {
    System.out.println("You continue on and find the kecleon shop.");
    System.out.println("Kecleon saw you were injured and used a full restore on you.");
    jestera = 80; //Sets the user's new attack after leveling up from the boss
    jesterh = 50; //Sets the user's new health after leveling up from the boss
    System.out.println("Your attack is " + jestera + ". Your health is " + jesterh); //Displays the users current attack and health
    System.out.println("He offers an assault vest that increases your health by 10 and a quick claw that increase your attack by 10. Both cost a total of 10 gold.");
    System.out.println("Which would you like to buy?");
    System.out.println("Type 'assault vest' or 'quick claw' or hit enter if you feel like saving up for some Capri Sun later on.");     
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase("Assault vest")) //User will type assault vest if they wish to upgrade their health
    {
      if(gold >= 10) //If the user wants to make a purchase and they have enough gold
      {
        gold = gold - 10; //User makes the purchase and the user's gold is subtracted by the cost of the item
        jesterh = jesterh + 10; //Adds the assault vest's health stat to the user overall health stat
        System.out.println("Your health is now: " + jesterh); //Displays the user's new health stat
      } 
      else //If the user has insufficient gold to make the purchase
      {
        System.out.println("That's 10 gold silly. You only have: " + gold + " gold."); //Displays how much gold the user currently has
      }
    } 
    else if(userinput.equalsIgnoreCase("Quick claw")) //User will type quick claw if they wish to upgrade their attack
    {
      if(gold >= 10) //If the user wants to make a purchase and they have enough gold
      {
        gold = gold - 10; //User makes the purchase and the user's gold is subtracted by the cost of the item
        jestera = jestera + 10; //Adds the quick claw's attack stat to the user overall attack stat
        System.out.println("Your attack is now: " + jestera);//Displays the user's new attack stat
      } 
      else //If the user has insufficient gold to make the purchase
      {
        System.out.println("That's 10 gold silly. You only have: " + gold + " gold."); //Displays how much gold the user currently has
      }
    }
    else //User will type nothing if they wish to keep their gold for a later purchase
    {
      System.out.println("Ummm? K? Don't buy anything, I see how it is.."); 
    }
  }
  
  public void chapter2Intro() //Dialogue begins and the user enters the second chapter
  {
    System.out.println("You make your way pass the shop and you continue on the path.");
    System.out.println("As your walking along you come across an entrance to a cave, you enter the Cave of Stalagmites.");
    System.out.println("You come across a fork in the tunnel with three different paths. 'Hmm what to choose?'");
    System.out.println("Type 'left' or 'middle' or 'right'.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase ("left")) //This will call the method cave left to go through the left side
    {
      caveLeft(); //Method cave left
    } 
    else if(userinput.equalsIgnoreCase ("right")) //This will call the method cave right to go through the right side
    {
      caveRight(); //This calls the method cave right
    } 
    else if(userinput.equalsIgnoreCase ("middle")) //Method cave right
    {
      caveMiddle(); //This calls the method cave middle
    } 
    else //If the user types an invalid anwser
    {
      System.out.println("You had yet another epileptic moment and screamed " + userinput + ". So you decided to take the right path.");
      caveRight(); //This calls the method cave right
    }
  }
  
  public void caveLeft() //This is another cave left the user can go through
  {
    System.out.println("You start walking down the left path. As you are walking you step on a pressure plate and activate a arrow trap.");
    generator(); //Called to have a random number generated
    
    if(randomnum1 <= 5) //Checks if the random number fits here and the user avoids the trap
    { 
      System.out.println("You dodged the trap. Luck is on your side :D");
    } 
    else if(randomnum1 >= 6) //Checks if the random number fits here and the user takes damage
    {
      System.out.println("You got hit by a rain of arrows and took 10 damage.");
      jesterh = jesterh - 10; //User's health is subtracted by a small amount from the trap
    } 
  }
  
  public void caveLeft1() //This is the first cave left the user can go through
  {
    System.out.println("You start walking down the left path and you get surprised slapped by a vampirebat.");
    fighting5(); //
    if(assaultvest == 0) //If the user bought the assault vest
    {
      jesterh = 90; //Declares the user's new health stat
    }
    else if(quickclaw == 0) //If the user bought the quick claw
    {
      jesterh = 80; //Declares the user's new health stat
    }
    caveBoss2(); //This calls the method cave boss 2
  }
  
  public void caveLeft2() //This method goes through the second left side of the cave
  {
    System.out.println("You start walking down the left path and you get surprised slapped by a vampirebat.");
    fighting6(); //
    if(assaultvest == 0) //If the user bought the assault vest
    {
      jesterh = 90; //Declares the user's new health stat
    }
    else if(quickclaw == 0) //If the user did buy the quick claw
    {
      jesterh = 80; //Declares the user's new health stat
    }
    caveBoss1(); //This calls the method cave boss 1
  }
  
  public void caveMiddle() //This is of the user types middle they will go through these options
  {
    System.out.println("You decided to walk down the center path and as you walk you see a hollow figure jump at you.");
    System.out.println("A wild gollurk has appeared.");
    System.out.println("Type 'fight' or 'avoid'.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase ("fight"))//If the user types fight, the fighting method is called and starts the fighting sequence
    {
      fighting3(); //This will call the method fighting 3
    } 
    else if(userinput.equalsIgnoreCase ("avoid")) //If the user types avoid it will excute this code
    {
      avoiding3(); //If the uyser typrs avoid it will attempt to avoid
    }
    else //If the user doesn't type the a valid input
    {
      System.out.println("You had.. Another epileptic moment and screamed " + userinput + " at the top of your lungs and alerted the gollurk. 'What am I doing?'.");
      fighting3(); //Called if the user types an invalid statement and fights the enemy
    }
  }
  
  public void caveRight() //If the user chooses to take the right path
  {
    System.out.println("You start walking down the right path and as you are walking you get ambushed by a boo.");
    System.out.println("Type 'fight' or 'avoid'.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase ("fight")) //If the user types fight, the fighting method is called and starts the fighting sequence
    {
      fighting4(); //Calls the fighting method to fight boo
    }
    else if(userinput.equalsIgnoreCase ("avoid")) //If the user types avoid, the avoiding method is called and the user takes a chance if they'll avoid
    {
      avoiding4(); //Calls the avoiding method to avoid boo
    }
    else //If the user types neither fight or avoid the user is forced to fight
    {
      System.out.println("You keep having these epileptic moments and screamed " + userinput + " at the top of your lungs and alerted boo. 'Why do I keep doing this!?'.");
      fighting4(); //Called if the user types an invalid statement and fights the enemy
    }
  }
  
  public void caveRight1() // The method calls the first fork in the cave
  {
    System.out.println("You walk down the right path and you see a man standing behind a table, he asks you if you want to play a game?");
    System.out.println("Type yes or no");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase ("yes")) //If the user types yes this will occur
    {
      System.out.println("Okay that'll be 5 gold. Now, lets roll my magical 10 sided die.");
      if(gold < 5) //If the user has insufficient gold to make the purchase
      {
        System.out.println("You dont have enough money to play. Get outta here bum.");
        caveBoss2(); //
      } 
      else if(gold >= 5) //If the user wants to make a bet and they have enough gold
      {
        gold = gold - 5; //User makes the purchase and the user's gold is subtracted by the cost of the bet
        System.out.println("Thanks for paying. Now, lets roll the die!");
        generator(); //Generates a random number to see if the user will win or not
        if(randomnum1 >= 2) //Checks the random number to see if the user won the gamble 
        {
          System.out.println("Looks like luck is on your side!");
          gold = gold + 10; //User got lucky and earned double the money back
          System.out.println("You have earned 10 gold, your total gold is " + gold); //Displays to the user their total amount of gold
          if(assaultvest == 0) //If the user did buy the assault vest
          {
            jesterh = 90; //Declares the user's new health stat
          }
          else //This occurs if the user didn't buy the assault vest
          {
            jesterh = 80; //Declares the user's new health stat
          }
          caveBoss2(); //This calls the method cave boss 2
        }
        else 
        {
          System.out.println("Nice luck bro thanks for the guap, get out!");
          if(assaultvest == 0) //If the user did buy the asssault vest
          {
            jesterh = 90; //Declares the user's new health stat
          }
          else //This occurs if the user doesn't have didn't buy the assault vest
          {
            jesterh = 80; //Declares the user's new health stat
          }
          caveBoss2(); //This calls the method cave boss 2
        }
      }
    }
  }
  
  public void caveRight2() //If the user chooses to take the right path
  {
    System.out.println("You walk down the right path and you see a man standing behind a table, he asks you if you want to play a game?");
    System.out.println("Type yes or no");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase ("yes")) //If the user types yes this will occur
    {
      System.out.println("Okay you need to pay 5 gold, now to win you need to roll my magical 10 sided die.");
      if(gold < 5) //If the user has insufficient gold to make the purchase
      {
        System.out.println("You cheap bum. Go get some gold.");
        caveBoss1(); //
      }
      else if(gold >= 5) //If the user wants to make a purchase and they have enough gold
      {
        gold = gold - 5; //User makes the purchase and the user's gold is subtracted by the cost of the bet
        System.out.println("Thanks for paying now lets roll the die.");
        generator(); //Generates a random number to see if the user will win or not
        if(randomnum1 >= 2) //Checks the random number to see if the user won the gamble
        {
          System.out.println("Looks like luck is on your side!");
          gold = gold + 10; //User has gained more gold and is added to their total
          System.out.println("You have earned 10 gold, your total gold is " + gold); //Displays their new total gold amount
          if(assaultvest == 0) //If the user bought the assault vest
          {
            jesterh = 90; //Declares the user's new health stat
          }
          else //This occurs if they didn't buy the assault vest
          {
            jesterh = 80; //Declares the user's new health stat
          }
          caveBoss1(); //This calls the method cave boss 1
        } 
        else //If the user bets and loses
        {
          System.out.println("Nice luck bro thanks for the guap, get out!");
          if(assaultvest == 0) //If the user bought the assault vesy
          {
            jesterh = 90; //Declares the user's new health stat
          }
          else //This occurs if the user loses
          {
            jesterh = 80; //Declares the user's new health stat
          }
          caveBoss1(); //This calls the method to cave boss 1
        }
      }
    } 
    else if(userinput.equalsIgnoreCase ("no")) //If the user doesn't want to bet
    {
      System.out.println("You decide to not play and walk out.");
      if(assaultvest == 0) //If the user bought the assault vesy
      {
        jesterh = 90; //Declares the user's new health stat
      }
      else //This occurs if the user loses
      {
        jesterh = 80; //Declares the user's new health stat
      }
      caveBoss1(); //This calls the method to cave boss 1
    }
  }
  
  public void caveCenter() //Event occurs where the user comes across a little side quest: a stray horse
  {
    System.out.println("You made your way through the path, and were walking down a dark hallway.");
    System.out.println("As your walking you bump into a horse with a note on it. The note reads.");
    System.out.println("In case I lose my horse please guide her out of the cave, if she lives you will be rewarded handsomly");
    System.out.println("Do you take the horse?");
    System.out.println("Type 'yes' or 'no'.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase ("yes")) //If the user does want to take the horse 
    {
      System.out.println("You take the horse along with you and continue down the pathway.");
      caveCenter2(); //The user takes the horse and continues down the path
    } 
    else if(userinput.equalsIgnoreCase ("no")) //If the user does not want to take the horse
    {
      System.out.println("You left the horse behind and continued down the pathway.");
      caveCenter3(); //The user denies the horse and continues down the path
    } 
    else //If the user does not type yes or no
    {
      System.out.println("You started screaming, " + userinput + " and scared the horse so it ran away. You are a genius.");
      caveCenter3(); //Forces the user to lose the horse
    }
  }
  
  public void caveCenter2() // his is a method where the user has to avoid a trap but with the horse here
  {
    System.out.println("As you are walking you step on a trap, and it opens up a hole full of spikes.");
    generator(); //Generates a random number to be used for the chance of avoiding the trap
    
    if(randomnum1 <= 5) //Checks if the user avoided the trap
    { 
      System.out.println("You and the horse both some how avoided this trap and continue on through the cave");
      caveFork1(); //This method calls cave fork 1
    } 
    else 
    {
      System.out.println("You and the horse both couldn't avoid the trap so you sacrificed the horse to save yourself.");
      caveFork2(); //This method calls cave fork 2
    }
  }
  
  public void caveCenter3() //This is a method where the user gets to try and avoid a trap
  {
    System.out.println("As you are walking you step on a trap, and it opens up a hole full of spikes.");
    generator(); //This generates a random number
    
    if(randomnum1 <= 5) //Checks if the user did not manage to avoid the trap
    { 
      System.out.println("You some how avoided this trap and continue on through the cave");
      caveFork2(); //This calls method cave fork 2
    } 
    else 
    { 
      System.out.println("You couldn't avoid the trap so you fell into the giant spikes and died horribly.");
      jesterh = 0; //The characters health gets set and 0 and you are dead
      System.out.println("GAME OVER");
      flag = false; //Sets flag to false therefore ending the program
    }
  }
  
  
  public void caveFork1() //There is a fork and the user must choose their path 
  {
    System.out.println("You avoided the trap and kept walking, as you walking you see two paths, and a goblin.");
    System.out.println("The goblin tells you. 'On the left path there is a secret pub, while on the right there are scary nasty creatures.'");
    System.out.println("Do you chose the left path or the right path?");
    System.out.println("Type 'left' or 'right'.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase ("left")) //If the user types left this will occur
    {
      caveLeft2(); //This calls method cave left 2
    } 
    else if(userinput.equalsIgnoreCase ("right")) //If the user types right this will occur
    {
      caveRight2(); //This calls method cave right 2
    }
    else //If the user doesn't type one of the correct options
    {
      System.out.println("You had ANOTHER epileptic moment and screamed " + userinput + ". So you decided to take the right path.");
      caveRight2(); //This calls method cave right 2
    }
  }
  
  public void caveFork2() //This method calls a fork in the cave where the user has to chose a path
  {
    System.out.println("You avoided the trap and kept walking, as you walking you see two paths, and a goblin.");
    System.out.println("The goblin tells you. 'On the left path there is a secret pub, while on the right there are scary nasty creatures.'");
    System.out.println("Do you chose the left path or the right path?");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase ("left")) //If the user types left this will occur
    {
      caveLeft1(); //This calls method cave left 1
    } 
    else if(userinput.equalsIgnoreCase ("right")) //If the user types right this will occur
    {
      caveRight1(); //This calls method cave right 1
    }
    else //If the user doesn't type on of the correct options
    {
      System.out.println("You had ANOTHER epileptic moment and screamed " + userinput + ". So you decided to take the right path.");
      caveRight1(); //This calls the method cave right 1 
    }
  }
  
  public void caveBoss1() //This is one of two methods for the cave boss
  {
    System.out.println("As you travel through the cave you see a light, and you assume its the way out.");
    System.out.println("Suddenly someone stops you and says hey that's my horse.");
    System.out.println("Thank you so much for saving her, here is your reward.'He handed over armour, and a sword.'");
    jesterh = jesterh + 100; //User is rewarded with a health boost
    if(quickclaw == 0) //If the user bought the quick claw
    {
      jestera = 80; //Declares the user's new attack stat
    }
    else if(quickclaw == 1) //If the user didn't buy the quick claw
    {
      jestera = 70; //Declares the user's new attack stat
    } 
    System.out.println("Your health is now " + jesterh + " Your attack is now " + jestera);
    System.out.println("You're walking to the exit and you get ambushed by a group of enemies.");
    flag4 = true; //Resets flag4 to true therefore the battle will not end the second it begins
    fighting4(); //Calls the fighting method for gollurk
    flag3 = true; //Resets flag3 to true therefore the battle will not end the second it begins
    fighting3(); //Calls the fighting method for boo
    fighting7(); //Calls the fighting method for dracula
  }
  
  public void caveBoss2() //This is one of two methods for the cave boss 
  {
    System.out.println("As you travel through the cave you see a light, and you assume its the way out.");
    System.out.println("Your health is now " + jesterh + " Your attack is now " + jestera);
    System.out.println("You're walking to the exit and you get ambushed by a group of enemies.");
    flag4 = true; //Resets flag4 to true therefore the battle will not end the second it begins
    fighting4(); //Calls the fighting method for gollurk
    flag3 = true; //Resets flag3 to true therefore the battle will not end the second it begins
    fighting3(); //Calls the fighting method for boo
    fighting7(); //Calls the fighting method for dracula
  }
  
  public void villageIntro() //The user enters the third and second last chapter
  {
    if(level == 2) //This will happen once the boss is killed
    {
      if(assaultvest == 0) //If the user bought the assault vest
      {
        jesterh = 140; //Declares the user's new health stat
      }
      else if(assaultvest == 1) //If the user didn't buy the assault vest
      {
        jesterh = 130; //Declares the user's new health stat
      }
      
      if(quickclaw == 0) //If the user bought the quick claw
      {
        jestera = 90; //Declares the user's new attack stat
      }
      else if(quickclaw == 1) //If the user didn't buy the quick claw
      {
        jestera = 80; //Declares the user's new attack stat
      }
    }
    System.out.println("You have been replenshied by the Gods.");
    System.out.println("Your health is now " + jesterh + ". Your attack is now " + jestera + "."); //Displays the user's updated health and attack stats
    System.out.println("You exit the cave, and start travling down the path again.");
    System.out.println("You reach the village entrance. You entered the Village of Houses.");  
  }
  
  
  
  public void villageCenter() //This is the first encounter you get in the village
  {
    System.out.println("As your walking through the village you see a person.");
    System.out.println("You run up to the person, and look at it you realize its not human.");
    System.out.println("Then the redead jumps at you. Fists flying.");
    fighting8(); //Calls the fighting method for a redead
  }
  
  public void villageCenter1() //This is a continuation through the village
  {
    System.out.println("As your walking down the village streets you see another horse with a note.");
    System.out.println("You get up to the horse and see that the note say 'Please guide my horse to saftey.' Do you wish to take the horse?");
    System.out.println("Type yes or no.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    if(userinput.equalsIgnoreCase("yes")) //If the user types yes then this will code will exacute
    {
      System.out.println("'Are you stupid i don't think you want to be doing this crap again.' The horse gets angery with you for refusing to help it and kicks you right in the jaw and you pass out.");
    }
    else if(userinput.equalsIgnoreCase("no")) //If the user types no then this will code will exacute
    {
      System.out.println("'Good decision.' The horse gets pissed you don't help it and its kicks you right in the nipple and you pass out.");
    }
    else //Incase the user doesn't type the write answer
    {
      System.out.println("'Why did i think " + userinput + " was a option?'.");
    }
  }
  
  public void villageHospital() //This method is the hospital where you fight the boss
  {
    System.out.println("You wake up in the hospital and look out the window, and realize your adventure wasn't just a dream.");
    System.out.println("You get up and race outside of your hospital room to get back to saving the kingdom.");
    System.out.println("As you roam aimlessly through the hospital floors, you feel a presence watching you and get scared.");
    System.out.println("You realized while trying to find the exit you wasted about 25 minutes. 'Damn why is the hospital so confusing, wait a better question is how did i get here?'");
    System.out.println("'King boojumps up behind you and says' 'I brought you here silly ;)'");
    System.out.println("Out of straight homophobia you attack him.");
    fighting9(); //Calls the fighting method of king boo
  }
  
  
  public void castleIntro() //The user enter the fourth and final chapter
  {
    if(level == 3) //Once you kill the boss you level up, and your health and attack stats will change
    {
      if(assaultvest == 0) //If the user bought the assault vest this will happen
      {
        jesterh = 240; //Declares the user's new health stat
      }
      else if(assaultvest == 1) //If the user didn't buy the assault vest this will happen
      {
        jesterh = 230; //Declares the user's new health stat
      }
      
      if(quickclaw == 0) //If the user bought the quick claw this will happen
      {
        jestera = 130; //Declares the user's new attack stat
      }
      else if(quickclaw == 1) //If the user didn't buy the quick claw this will happen
      {
        jestera = 120; //Declares the user's new attack stat
      }
    }
    System.out.println("Your health is " + jesterh + " Your attack is " + jestera); //Displays the user's current stats
    System.out.println("Well thank Moses I got rid of him. As you exit the hospital you see the castle up ahead.");
    System.out.println("You run as fast as you can to try and get there to save it 'To bad you run slow.'");
    System.out.println("Finally you make it to the castle entrance, and as you run in you get attacked by a cell Jr. Guarding the entrance.");
    fighting10(); //Calls the fighting method for cell jr
  }
  
  public void castleCenter() //Fourth and final chapter begins and the user enters
  {
    System.out.println("You entered the Kingdom of Dressrosa.");
    System.out.println("You see a donkey  out of your hatred for the horses you decide to get revenge,");
    System.out.println("You slap the donkey for being an ass, and he got dazed.");
    System.out.println("FINISH HIM!!!!!");
    System.out.println("You uppercut the donkey and its head rolled off.");
    System.out.println("A cell Jr. Walks and and says damn son it was my job to kill that ass.");
    flag10 = true; //Resets flag10 for when fighting10 is called, the battle does not end the second the battle begins
    fighting10(); //Calls the fighting method for cell jr
  }
  
  public void castlePath() //Following the previous batte the user continues through the kingdom
  {
    System.out.println("You hear the dragon's roar coming from the floor above.");
    System.out.println("As your climbing up the steps you see two different doors to travel through.");
    System.out.println("On the left door you see a hidden leaf village's symbol. 'I assume Hashirama is in here.'");
    System.out.println("On the right door you see a fang. 'I assume Dracula is in here.'");
    System.out.println("Which door should I take.'Left or right.'");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    if(userinput.equalsIgnoreCase("left")) //If the user types left this will happen
    {
      System.out.println("You walk into the left door.");
      castleLeft(); //This calls method castle left
    }
    else if(userinput.equalsIgnoreCase("right")) // If the user types right it will do this code
    {
      System.out.println("You walk into the right door.");
      castleRight(); //It calls the method castle right
    }
    else //This will happen if the user doesn't type the right option
    {
      System.out.println("You really need to get these epileptic moments checked out. Yet you screamed " + userinput + ". So you decided to take the left door.");
      castleLeft(); //This calls the method castle left
    }
  }
  
  public void castleLeft() //If the user wants to take the left path
  {
    System.out.println("As the door slowely opens you see dracula zombified. It still has the marks from our battle. 'WHAT I SWEAR I ALREADY KILLED THIS FOOL.'");
    flag7 = true; //Resets flag7 therefore the battle will not end the second it begins
    fighting7(); //Calls the fighting method for Dracula because it is being reused
    if(level == 4) //This will go up if you defeat the next boss
    {
      if(assaultvest == 0) //If the user bought the assault vest this will happen
      {
        jesterh = 290; //Declares the user's new health stat
      }
      else if(assaultvest == 1) //If the user didn't buy the assault vest
      {
        jesterh = 280; //Declares the user's new health stat
      }
      
      if(quickclaw == 0) //If the user bought the quick claw
      {
        jestera = 160; //Declares the user's new attack stat
      }
      else if(quickclaw == 1) //If the user didn't buy the quick claw
      {
        jestera = 150; //Declares the user's new attack stat
      }
    }
  }
  
  public void castleRight() //If the user wants to take the right path
  {
    System.out.println("As the door slowely opens you see hashirama zombified. It still has the marks from our battle. 'WHAT I SWEAR I ALREADY KILLED THIS FOOL.'");
    flag2 = true; //Resets flag2 therefore the battle will not end the second it begins
    fighting2(); //Calls the fighting method for Hashirama because it is being reused
    if(level == 4) //This will go up if you defeat the next boss
    {
      if(assaultvest == 0) //If the user bought the assault vest this will happen
      {
        jesterh = 280; //Declares the user's new health stat
      }
      else if(assaultvest == 1) //If the user didn't buy the assault vest
      {
        jesterh = 270; //Declares the user's new health stat
      }
      
      if(quickclaw == 0) //If the user bought the quick claw
      {
        jestera = 150; //Declares the user's new attack stat
      }
      else if(quickclaw == 1) //If the user didn't buy the quick claw
      {
        jestera = 140; //Declares the user's new attack stat
      }
    }
  }
  
  public void castleShop() //A shop where the user is fully restored the final boss and is allowed to use their gold to upgrade their stats
  {
    System.out.println("You continue on and find the Hasty Market.");
    System.out.println("You saw a man behind the table with a name tag Hapreet Bhangu.");
    System.out.println("Your attack is " + jestera + ". Your health is " + jesterh); //Displays what is your current attack and health stat before entering the shop
    System.out.println("He offer a patty with toppings of your choice that increases your health by 30 and a swiss army knife that increase your attack by 20. Both cost a total of 40 gold.");
    System.out.println("Which would you like to buy?");
    System.out.println("Type 'patty' or 'knife' or hit enter if you feel like saving up for some new Huggies diapers.");     
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    
    if(userinput.equalsIgnoreCase("patty")) //User will type patty if they wish to upgrade their health
    {
      if(gold >= 40) //If the user wants to make a purchase and they have enough gold
      {
        gold = gold - 40; //User makes the purchase and the user's gold is subtracted by the cost of the item
        toppings(); //Lets the user decide their toppings on their patty
        showToppings(); //Displays the toppings the user typed
        jesterh = jesterh + 30; //Adds the patty's health stat to the user overall health stat
        System.out.println("Your health is now: " + jesterh); //Displays the user's new health stat
      } 
      else //If the user has insufficient gold to make the purchase
      {
        System.out.println("That's 40 gold silly. You only have: " + gold + " gold.");
      }
    } 
    else if(userinput.equalsIgnoreCase("knife")) //User will type knife if they wish to upgrade their atack
    {
      if(gold >= 40) //If the user wants to make a purchase and they have enough gold
      {
        gold = gold - 40; //User makes the purchase and the user's gold is subtracted by the cost of the item
        jestera = jestera + 20; //Adds the knife's attack stat to the user overall attack stat
        System.out.println("Your attack is now: " + jestera); //Displays the user's new attack stat
      } 
      else //If the user has insufficient gold to make the purchase
      {
        System.out.println("That's 40 gold silly. You only have: " + gold + " gold.");
      }
    }
    else //If the user types nothing and wants to save up gold
    {
      System.out.println("You asked for " + userinput + ". Hapreet slowly hid behind the counter.");
    }
  }
  
  
  public void castleBoss() //Little dialogue entrance before the big final battle against Ridley
  {
    System.out.println("You climb the ladder and enter the roof top of the castle.");
    System.out.println("Up there you see ridely sleeping inside his flaming nest.");
    System.out.println("You realize this is the final battle. 'I have been training for this day I got this, I am the best around, nothings going to bring me down.'");
    System.out.println("Your really crappy singing woke Ridely and he let out a powerful roar 'I may have just pooped my self, well i guess i have to fight him now, but fist i should change.'");
    System.out.println("........................................");
    System.out.println("'Alright i am ready lets go.'");
    fighting11(); //Calls the fighting method to begin fighting Ridley
  }
  
  public void end() //Displays the final cutscene in the story once the dragon is defeated
  {
    System.out.println("'WOW I can't believe i just did that, and this all started with a dream to think me a hero. Well my mom will love this story.'");
    System.out.println("'But I think my dad will think my imagination is too wild and think everything is a big fat lie. Well its time to prove him wrong :D.'");
    System.out.println("The hero walks towards the end of the roof and sees the king tied up there, so he goes over to him and frees him.");
    System.out.println("'Took you long enough i was sitting here for like a good 40 minutes.'");
    System.out.println("'Well since you want to be ungrateful i will just leave. Just remember to put my name in the paper and stuff'");
    System.out.println("Walks away slowly, and watches the castle blow up in the distance behind him.");
    System.out.println("As he walks outside of the castle he sees his house right next door to it, and goes home.");
    System.out.println("'I am so stupid I took the long way to get to the castle but hey I still got there :D.'");
    System.out.println("'Awe why does my face hurt, man this pain sucks.");
    System.out.println("AND THEN I WOKE UP");
    showStats(); //Shows their total progression in the game
  }
  
  public void toppings() //Gets the user's toppings they'd like on their patty
  {
    System.out.println("What is the first topping you want on your patty.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    Toppings[0] = userinput; //Declares the topping with the users input
    System.out.println("What is the second topping you want on your patty.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    Toppings[1] = userinput; //Declares the topping with the users input
    System.out.println("What is the third topping you want on your patty.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    Toppings[2] = userinput; //Declares the topping with the users inputt
    System.out.println("What is the fourth topping you want on your patty.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    Toppings[3] = userinput; //Declares the topping with the users input
    System.out.println("What is the fifth topping you want on your patty.");
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch
    Toppings[4] = userinput; //Declares the topping with the users input
  }
  
  public void showStats() //Shows how much the user has accomplished from the beginning to the end of the adventure
  {
    Stats[0] = jesterh; //Sets the warrior's health variable into the array
    Stats[1] = jestera; //Sets the warrior's attack variable into the array
    Stats[2] = gold; //Sets the player's earned gold into the array
    Stats[3] = level; //Sets the player's level into the array
    System.out.println("Your final health: " + Stats[0]); //Displays the user's health at the end of the game
    System.out.println("Your final attack: " + Stats[1]); //Displays the user's attack at the end of the game
    System.out.println("Your remaining gold: " + Stats[2]); //Displays the user's gold at the end of the game
    System.out.println("Your final level : " + Stats[3]); //Displays the user's level at the end of the game
  }
  
  public void showToppings() //Shows all the user's desired toppings on their patty
  {
    System.out.println("You have great taste my friend. I hope you enjoy your " + Toppings[0] + " - " + Toppings[1] + " - " + Toppings[2] + " - " + Toppings[3] + " - " + Toppings[4] + " Patty!");
  }
  
  public boolean sideQuit() //THIS IS TO COVER UP OUR DESIGN ERROR. When the user dies, this 'checkpoint' checks flag between each chapter to see if the user can continue  
  {
    System.out.println("You have reached a checkpoint.");
    System.out.println("Would you like to contine on your adventure of awesomeness?"); //Asks the user if they would like to use the program again from the start
    System.out.println("Please type 'yes' or 'no'"); //The users input will now enter the if statement
    getInput(); //Calls the following method because its more efficient than typing try, readLine and catch
    quit = userinput; //Declares quit as to what the user types
    
    if (quit.equalsIgnoreCase ("no")) //If the user types no, therefore the flag's declaration changes
    { 
      flag = false; //This turns the flag variable to false and stops the loop
    } 
    else if (quit.equalsIgnoreCase ("yes")) //If the user types yes, therefore the flag's declaration remains unchanged
    { 
      if(jesterh <= 0) //However, if the user has died but tries to continue playing, the program will know the user is dead
      {
        System.out.println("Think I'm dumb?! I know you died and you can't continue when you're dead silly.");
        flag = false; //This turns the flag variable to false and stops the loop
      }
      else
      {
        flag = true; //The character remains alive therefore can continue on the adventure
      }
    } 
    else //If the user types a invalid answer, therefore the flag's declaration changes
    { 
      System.out.println("The character you typed is invalid");
    }
    return flag; //Returns flag to decide in main whether to continue the program or not
  }
  
  public boolean mainQuit()//This quit is called at the end of the game when the user has succesfully defeated the final boss
  {
    
    System.out.println("Would you like play again?"); //Asks the user if they would like to use the program again from the start
    System.out.println("Please type 'yes' or 'no'"); //The users input will now enter the if statement
    getInput(); //Calls the following method because its more efficent than typing try, readLine and catch //Calls the following method because its more efficient than typing try, readLine and catch
    quit = userinput; //Declares quit as to what the user types
    
    if (quit.equalsIgnoreCase ("no")) //If the user types no, therefore the flag's declaration changes
    { 
      flag = false; //This turns the flag variable to false and stops the loop 
    } 
    else if (quit.equalsIgnoreCase ("yes")) //If the user types yes, therefore the flag's declaration remains unchanged
    { 
      flag = true; //This keeps the flag variable true and repeats the loop from the beginning
    } 
    else //If the user types a invalid answer, therefore the flag's declaration changes
    { 
      System.out.println("The character you typed is invalid");
      flag = false; //This turns the flag variable to false and stops the loop
    }
    return flag; //Returns flag to decide in main whether to continue the program or not 
  }
}
