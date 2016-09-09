import java.util.Scanner;
import java.util.InputMismatchException;

public class backup{

   public static void main(String[] args) {
         
        // coefficients + variables + names
        
      double playerR = 7;
      double playerHP = 7;
      double resourceUsage = 0;
      double questionNumber;
      String playerResource;
      String playerWeapon;
        
      double coefficientDamage = 1;
      double coefficientHealth = 1;
      double resourceCounter ;
      double resourceReq;
        
      resourceUsage = 2*coefficientDamage;
      resourceCounter = (coefficientDamage * resourceUsage);
        
        //name
        
      System.out.println("Introduction");
      System.out.println("\"Sometimes it's the smallest decisions that can change your life forever.\"");
      pressEnterToContinue();
      System.out.println("For best experience, please expand your console.");
      pressEnterToContinue();
      Scanner input = new Scanner(System.in);
      String playerName = input.nextLine();
      System.out.println("Welcome Stranger, Please Enter Your Name");
      playerName = input.nextLine();
      System.out.print(playerName+"? That's an interesting name!");
        
        //age  
        
      System.out.println("How old are you, "+playerName+"?");
      String age = input.nextLine();
      int playerAge = Integer.parseInt(age);
      if (playerAge > 30) {
         System.out.println ("You've got some experiences! You gain intelligence bonus!");
      }
      else{
         System.out.println ("You are young and vital! You gain health bonus!");     
      }
               
       //class      
      String pClass;       
      System.out.println("Which class do you want to play? \n 1. Mage \n 2. Warrior");
      int playerClass = input.nextInt();
      while (playerClass != 1 && playerClass != 2) 
      {
         System.out.println("Choose properly");
         playerClass = input.nextInt();
      }
            
      if (playerClass == 1) {
         pClass = String.valueOf(playerClass);
         pClass = "Mage"; }
      else {
         pClass = String.valueOf(playerClass);
         pClass = "Warrior"; }
      System.out.println(pClass + " you choose!!!");
        
        //stats
        
      System.out.println("Hello " + pClass);
      if (pClass == "Mage") {
         playerResource = "mana";
         playerWeapon = "staff"; }
      else {
         playerResource = "energy";
         playerWeapon = "sword"; }
      if (playerAge >30) {
         playerR +=3; }
      else {
         playerHP +=3; }
      System.out.println("You start with " + playerR + " " + playerResource + " and " + playerHP +" health!");
        
        //level 1
        
      System.out.println("Act 1");
      pressEnterToContinue();
        
      System.out.println("You wake up in the middle of the forrest. You look around you. You see small campfire and abandoned backpack.\nYour friend, who was supposed to hold the watch is nowhere to be seen. You are starting to be worried.\nThis forrest is occupied by goblins. Still, you decide not to panic and wait for him.");
      System.out.println("Suddenly, you hear strange noise and screeches from the forrest. Could it be...?");  
              
      System.out.println("What you want to do? \n 1. Seek cover and wait in the bushes. \n 2. Just wait, you feel safe anyway.  \n 3. Run for your life!!!");
              
      questionNumber = input.nextInt();
          
      while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
         System.out.println("Please choose properly!");
         questionNumber = input.nextInt();}          
                      
                  
      if (questionNumber == 1) {
      
         System.out.println("You are nicely covered in the nearby bush, holding your old " + playerWeapon + " firmly in your hand ready to attack at any moment.");
         pressEnterToContinue();
         System.out.println("Two goblins run out of the forest. They are searching around your campsite. This would be a great moment to strike!");
                
         resourceUsage = 2*coefficientDamage;
         resourceCounter= (coefficientDamage * resourceUsage);
         System.out.println("What you want to do? \n 1. Attack!! - " + resourceCounter + " " + playerResource + " \n 2. Stay hidden longer and watch them. \n 3. Run to the forrest!");
         questionNumber = input.nextInt();
         while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
            System.out.println("Please choose properly!");
            questionNumber = input.nextInt();}
         while (playerR<2 && questionNumber == 1) {
            System.out.println("You can't do that, you are too weak");
            questionNumber = input.nextInt();
            if (questionNumber != 1){
               break;  }}                                
         while (playerR<2 && questionNumber == 2) {
            System.out.println("You can't do that, you are too weak");
            questionNumber = input.nextInt();
            if (questionNumber != 2){
               break;  }}
      
         if (questionNumber == 1) {
            playerR -= resourceCounter;
            System.out.println("You have got " + playerR + " " + playerResource + " left.");
            if (playerClass == 2){
               System.out.println("You run quickly out of the bush and cut the throat of first goblin. Blood sprayed your armor and the other goblin is trying to hit you. \nLuckily, you manage to dodge his attach and pierce his thin leather armor with your sword. Two goblins are laying under dead on the ground. However, it is not safe to stay here any longer, you decide to go into the forest.");}
            else {
               System.out.println("You whisper some magical words and cast big ball of fire. Goblins didn't even have time to turn around. They lay scorched on the ground.\nHowever, it is not safe to stay here any longer, you decide to go into the forest.");}
         }
         else if (questionNumber == 2) {
            playerR -= resourceCounter*coefficientDamage;
            System.out.println("You have got " + playerR + " " + playerResource + " left.");
            playerHP -= 1;
            System.out.println("You have got " + playerHP + " health points left.");
            System.out.println("You are watching them and trying to be really quiet. However, goblins smell you and one of them shoots you in the left leg! You attack them and they are lying on the ground dead.");} 
         if (playerHP <= 0) {
            System.out.println("You died!!!");
            deathPic ();
            System.exit(0);}
         else if (questionNumber == 3) {
            System.out.println("You decide to try to safely run to the forrest. You are lucky, goblins did not hear you running.");
            pressEnterToContinue();
         }
      }
                                  
      else if (questionNumber == 2) {
         playerHP -= 3/coefficientHealth;
         System.out.println("You have got " + playerHP + " health points left.");
         System.out.println("You are sitting and listening to the sounds of forrest. The next sound you hear is whistling of arrow. \nYou feel horrible pain in your shoulder! Goblins arrow hits you hardly! What a shitty idea to stay!!"); 
         if (playerHP <= 0) {
            System.out.println("You died!!!");
            deathPic ();
            System.exit(0);}
         System.out.println("You pick up your " + playerWeapon + " and run into the forrest. You are lucky, goblins lost your track.");}
      else if (questionNumber == 3) {
         resourceUsage = 1*coefficientDamage;
         resourceCounter = (coefficientDamage * resourceUsage);
         System.out.println("You are scared! You are running into the forrest.");
         System.out.println("Unfortunately, you are too noisy! One goblin managed to get in your way!"); 
         System.out.println("What do you do? \n 1. Attack!! -" + resourceCounter + " " + playerResource + " \n 2. Try to run once again.");
         questionNumber = input.nextInt();
         while (questionNumber != 1 && questionNumber != 2 ){
            System.out.println("Please choose properly!");
            questionNumber = input.nextInt();}
         while (playerR<1 && questionNumber == 1) {
            System.out.println("You can't do that, you are too weak");
            questionNumber = input.nextInt();
            if (questionNumber != 1){
               break;  }}
         if (questionNumber == 1) {
            playerR -= resourceCounter;
            System.out.println("You have got " + playerR + " " + playerResource + " left.");
            if (playerClass == 2){
               System.out.println("You run quickly towards him and cut his throat. He couldn't even react. Blood sprayed your armor and the other goblins did not hear the sounds of a fight. \n However, it is not safe to stay here any longer, you decide to go into the forest.");}
            else {
               System.out.println("You whisper some magical words and cast big ball of fire. Goblin didn't even have time to turn around. He lays scorched on the ground. However, it is not safe to stay here any longer, you decide to go into the forest.");}
         }
         else if (questionNumber == 2) {
                        
            System.out.println("You quickly change your direction. Goblin looks confused, but stil manages to throw his knife in your way. You now have an ugly wound on your shoulder. But at least you escaped them!"); 
            playerHP -=1;
            System.out.println("You have got " + playerHP + " HP left.");
            if (playerHP <= 0) {
               System.out.println("You died!!!");
               System.exit(0);
               deathPic ();    }                      
         }
      }
                
                
        // shrine
        
      pressEnterToContinue();
      System.out.println("You are walking through the forest, now much more carefuly. You are thinking about what just happened and about your friend. \n You saw something that looks like building. You decide you are going closer.");
      System.out.println("When you aproach, you see a small shrine. You see something written above the entrance.");
      System.out.println("You recognize this writing. It's a magical language.");
      if (playerClass == 1) {
         System.out.println("You are mage so you should be able to read it. However, this writing is used only by black mages. You can read only few words.\n\"Power........enemies.......drink......darkness awaits.\"");
      }
      else {
         System.out.println("You are not mage, but you were templar for two years. You can tell this writing is used only by black mages. You can read only few words\n\"Power........enemies.......drink......darkness awaits.\"");   
      }
        
      System.out.println("What do you want to do?\n 1. Explore   -1 "+ playerResource + "\n 2. Leave");    
      questionNumber = input.nextInt(); 
      while (questionNumber != 1 && questionNumber != 2){
         System.out.println("Please choose properly!");
         questionNumber = input.nextInt();}
   
      if (questionNumber == 1) {
         System.out.println("You head to the door. You are trying to get in, but it's locked.");
         if (playerClass == 1) {
            playerR -= 1;
            System.out.println("Luckily enough, you know one spell to open every locked door! -1 mana");
            System.out.println("You have got " + playerR + " " + playerResource + " left.");
         }
         else {
            playerR -= 1;
            System.out.println("You are, however, quite strong, so you decide to break the door! -1 energy");
            System.out.println("You have got " + playerR + " " + playerResource + " left.");   
         }
             
         pressEnterToContinue();
         System.out.println("The shrine is dark, but you can still see just enough. Small pillars are barely holding the rooftop of the shrine.\nIn the middle of the room, there is a golden statue of some to you unknown goddess.\nDried blood on her head is hardly visible in the dark, but with the help of moonshine coming through damage roof, you can see it. ");
         System.out.println("Small flask with green liquid lies under the statue. You feel strange urge to drink it!");
         System.out.println("What do you want to do?\n 1. Drink\n 2. Leave the shrine");
         questionNumber = input.nextInt();
         while (questionNumber != 1 && questionNumber != 2 ){
            System.out.println("Please choose properly!");
            questionNumber = input.nextInt();} 
         if (questionNumber == 1) {
            System.out.println("\"You must be stupid!\", you say to yourself. You take a long sip from the bottle. You pass out. What were you expecting?");
            pressEnterToContinue();
            System.out.println("You wake up. You can tell you were not out for long, liquid is still dripping from dropped flask.");
            if (playerClass == 1) {
               coefficientDamage *= 0.75;
               playerR *= 1.25;
               System.out.println("Suddenly, you feel somehow... stronger... wiser... (mana consumption decreased by 25%)");
               System.out.println("You have got " + playerR + " " + playerResource + " and " + playerHP + " HP left."); }
            else {
               coefficientHealth *= 1.25;
               playerHP *= 1.25;
               System.out.println("Suddenly, you feel somehow... healthier... more vital... (health and health regen increased by 25%)");
               System.out.println("You have got " + playerR + " " + playerResource + " and " + playerHP + " HP left."); }
                        
            System.out.println("You left the shrine. You are trying to get out of the forest. On your way back, you see something really strange.");
                        
         }
         else if (questionNumber == 2) {
            System.out.println("You decided to leave the suspicios shrine. You are trying to get out of the forest. On your way back, you see something really strange.");} 
      
      } 
      else if (questionNumber == 2) {
         System.out.println("You decided to leave the suspicios shrine alone. You are trying to get out of the forest. On your way back, you see something really strange.");
      }
   
     
     
     // note
      pressEnterToContinue();
      System.out.println("Act 2");
      System.out.println("\"Zugzwang- the only reasonable move is not to move.\"");
      pressEnterToContinue();
     
      System.out.println("Till now, you were only learning to play. Simple decisions, simple outcome. From now on, you will know a fraction of impact of your decisions.");
      System.out.println("Let's see how will you handle them, " + playerName + ".");
      pressEnterToContinue();
     
      System.out.println("The strange note is hanging from a half-broken branch of a pine. It's covered in blood. You carefuly open it.");
      System.out.println("The bloody letters say: Your friend. Was crying. Scared of walls.");
      pressEnterToContinue();
      System.out.println("How will you decide?\n 1. Try to rescue him. (You will venture deeper into the forrest, towards huge danger)\n 2. Try to get help at home. (You will get on a road leading home.)");
     
      questionNumber = input.nextInt();
      while (questionNumber != 1 && questionNumber != 2 ){
         System.out.println("Please choose properly!");
         questionNumber = input.nextInt();} 
      if (questionNumber == 1) {
         System.out.println("You decide to rescue him! The only walls in this forrest should be in half-destroyed castle. You know a way there...");
         System.out.println("You can't get thoughts about the danger your friend must be in out of your head. It's already dark, hard to see in the forest.");
         System.out.println("What do you want to do?\n 1. Build a fire and rest (Dangerous, but you will be rested)\n 2. Proceed (You should get to the castlefaster, but you will be tired)");
         questionNumber = input.nextInt(); 
         while (questionNumber != 1 && questionNumber != 2 ){
            System.out.println("Please choose properly!");
            questionNumber = input.nextInt();}
         if (questionNumber == 1) {
            playerHP += 4*coefficientHealth;
            playerR += 4/coefficientDamage;
            System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
            System.out.println("You build a small campfire and lay on the ground.");
            System.out.println("You can't sleep very well, but you are rested at least. You let the fire burn and proceed.");   }
         else if (questionNumber == 2) {
            playerHP -= 2/coefficientHealth;
            playerR -= 2*coefficientDamage;
            System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
            System.out.println("You decide to go further, you are scared and don't want to stay here any longer.\nIt's very dark, but the forrest is quiet at least. You are trying not to make much noise. You are very tired");
            if (playerHP <= 0) {
               System.out.println("You died!!!");
               deathPic ();
               System.exit(0);}
            pressEnterToContinue();}
        System.out.println("You are walking through the forrest, when you see a deer in front of you. The deer is looking into your eyes, but you have a feeling like he sees your soul.");
        System.out.println("The deer is somehow.. transparent. Shiny. You feel the soul of the forrest is coming with him.");
        System.out.println("What do you want to do? \n 1. Come closer\n 2. Kill him fast! (either way, you have no clue what's going to happen)" + "    Part 2 coming soon");
        questionNumber = input.nextInt(); 
        while (questionNumber != 1 && questionNumber != 2 ){
           System.out.println("Please choose properly!");
           questionNumber = input.nextInt();}    
        if ( questionNumber == 1) {
           System.out.println("   "); }
          
          
          
          
          
          
          
          
          
                 
                 
                 
         } // end of rescue friend
                 
                 
                 
      if (questionNumber == 2) {
         System.out.println("You are scared! You decide to get home as fast as possible. Maybe you can find help in the castle in your hometown! You know a way home...");
         System.out.println("You feel ashamed and crushed. What if it will be too late to save him after you seek help? You know each other from childhood, how could you leave him to die?");
         System.out.println("You can't get these thoughts out of your head. It's already dark, hard to see in the forest.");
         System.out.println("What do you want to do?\n 1. Build a fire and rest (Dangerous, but you will be rested)\n 2. Proceed (You should get home faster)");
         questionNumber = input.nextInt(); 
         while (questionNumber != 1 && questionNumber != 2 ){
            System.out.println("Please choose properly!");
            questionNumber = input.nextInt();}
         if (questionNumber == 1) {
            playerHP += 3*coefficientHealth;
            playerR += 3/coefficientDamage;
            System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
            System.out.println("You build a small campfire and lay on the ground.");
            System.out.println("You can't sleep very well, but you are rested at least. You let the fire burn and proceed.");   }
         else if (questionNumber == 2) {
            playerHP -= 2/coefficientHealth;
            playerR -= 2*coefficientDamage;
            System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
            System.out.println("You decide to go further, you are scared and don't want to stay here any longer.\nIt's very dark, but the forrest is quiet at least. You are trying not to make much noise. You are very tired");
            if (playerHP <= 0) {
               System.out.println("You died!!!");
               deathPic ();
               System.exit(0);}
            pressEnterToContinue();}
         System.out.println("After a while, you can see a light not far away from you! You are exhausted after a long day and really hungry.\nStill, after all that happened today, you decide to proceed carefully.");
         System.out.println("You got really close to the small cabin. You are looking through the window. You can see two people.");
         pressEnterToContinue();
         System.out.println("Young, beautiful girl, wearing only long white blouse is tied to the wall with thick ropes. She's crying quietly.\nOn the other side of the room, there is someone in a long, black cape, reading something in a book.");
         System.out.println("What will you do?\n 1. Get in the cabin (You will get in safely)\n 2. Leave them alone (You will survive for sure)");
         questionNumber = input.nextInt(); 
         while (questionNumber != 1 && questionNumber != 2 ){
            System.out.println("Please choose properly!");
            questionNumber = input.nextInt();}
         if (questionNumber == 1) {
            System.out.println("You got in quietly, it was not locked. Noone can see you in the corner now.");
            System.out.println("Now you can see everything clearly. Person in cape has some elixirs and ingredients around.\nSome magical patterns are drawn on the ground in front of the girl. You know her by her face...");   
            if (playerClass == 1) {
               System.out.println("You are mage so you are sure this is sacrification ritual.");}
            else {
               System.out.println("You don't have to be mage to tell that this is a sacrification ritual.");}
            System.out.println("How will you decide?\n 1. Try to cut the ropes and free the girl (You will be in major danger, she will survive)\n 2. Try to kill the mage (She can die, you will have the attack adventage)"); 
            questionNumber = input.nextInt();
            while (questionNumber != 1 && questionNumber != 2 ){
               System.out.println("Please choose properly!");
               questionNumber = input.nextInt();}
            if (questionNumber == 1) {
               System.out.println("Your knife is cutting through the ropes. Girl is smart enough to be quiet. She ran out of the cabin just in time.\nMage turned around and saw you two, girl running away and you crouching near the symbols.");
               System.out.println("Now you see the face of the mage. He quickly casts a ball of shadow and hits your legs. You fall to the ground.");
               playerHP -= 3/coefficientHealth;
               System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
               if (playerHP <= 0) {
                  System.out.println("You died!!!");
                  deathPic ();
                  System.exit(0);}
               System.out.println("What do you want to do?\n 1. Fight the mage!!! (One of you will die)  -3 "+ playerResource + " \n 2. Talk to the mage (He didn't kill you yet, that maybe means something)   \n 3. Run for your life!!! (Very dangerous but managable)");
               questionNumber = input.nextInt();
               while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                  System.out.println("Please choose properly!");
                  questionNumber = input.nextInt();}
               while (playerR<3 && questionNumber == 1) {
                  System.out.println("You can't do that, you are too weak");
                  questionNumber = input.nextInt();
                  if (questionNumber != 1){
                     break;  }}
                                                
                                                // fight mage back
                                                
               if (questionNumber == 1) {
                  System.out.println("You decided to fight him back!");
                  if (playerClass == 2){
                     playerHP -= 1/coefficientHealth;
                     playerR -= 3*coefficientDamage;
                     System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                     System.out.println("You quickly stand up. Mage casts a fireball that hits you, but you wear an iron armor, so you are more or less unharmed. You are running towards him.\nYou swing your sword and cut his arm.");
                     if (playerHP <= 0) {
                        System.out.println("You died!!!");
                        deathPic ();
                        System.exit(0);}
                     System.out.println("The mages blood colors his cape. He lookes angry, but injury is quite serious!");
                     System.out.println("How will the fight coninue?\n 1. Strong attack (Huge damage, slower) -5 "+ playerResource + " \n 2. Fast attack (Lesser damage, really fast)  -3 "+ playerResource + " \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1){
                        playerR -= 5*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You try to perform the most powerful attack you can! You swing your sword and cut through the mage!");
                        pressEnterToContinue ();
                        System.out.println("However, it was just an illusion! The true mage had enough time to cast it and now he is standing behind you, stabbing his dagger into your back!");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);}
                        System.out.println("What do you want to do next?\n 1. Hit him with handle (You will stun him) \n 2. Crouch and cut his legs (You will be successful, but suffer damage!  -3 "+ playerResource  );
                        questionNumber = input.nextInt();
                        while (questionNumber != 1 && questionNumber != 2 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<3 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 2){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.print("You hit the mage with the handle of your sword. He looks stunned! Now it's time to attack!");
                           System.out.println("What do you want to do next?\n 1. Finish him! (Fatality)  -5 "+ playerResource + " \n 2. Hit him hard with dagger (He will maybe not die)");
                           questionNumber = input.nextInt();
                           while (questionNumber != 1 && questionNumber != 2 ){
                              System.out.println("Please choose properly!");
                              questionNumber = input.nextInt();}
                           while (playerR<5 && questionNumber == 1) {
                              System.out.println("You can't do that, you are too weak");
                              questionNumber = input.nextInt();
                              if (questionNumber != 1){
                                 break;  }}
                           if (questionNumber == 1)  {
                              playerR -= 5*coefficientDamage;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                              System.out.println("Your sword cuts through him like through the butter. His insides are lying on the floor near him. The fight is over.");
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                              System.out.println("As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                              }
                           else{
                              playerHP -= 4*coefficientHealth;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");     
                              System.out.println("You hit mage into the stomach with your small dagger. He is dying now, for sure. Still he manages to cast another shadow bolt in your direction.");     
                              System.out.println("Surprised by this action, you couldn't dodge it!");
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0);}  
                              System.out.println("There's not much to think about, you have to kill him now! You run towards him, with all your energy left.");
                              if (playerR<5){
                                 playerR = 1;}
                              else {
                                 playerR -= 5*coefficientDamage;}
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                              System.out.println("You cut him in his neck! He falls to the ground. As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              
                              }
                           }
                     
                     else { // begin crouch attack
                        playerR -= 3*coefficientDamage;
                        playerHP -= 4/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You crouch unexpectedly and cut his legs! Mage suffers serious damage, he can't stand anymore");
                        System.out.println("He is shouting in pain! Through all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit.");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You survived it, somehow. He is crawling away from you scared od dying.");
                        System.out.println("What will you do? \n 1. Spare his life (You are a good person!) \n 2. Kill him angrily with your sword (He will die quickly)  -4 "+ playerResource + "\n 3. Slowly cut his throat with your dagger (He will die in horrible pain)");
                        while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<4 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 1){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.println("You decide to spare mages life. You are about to his hand. Suddenly, when you hold it, you feel horrible pain. \nDarkness enters your body. Now, you don't feel anything more, just pain and emptyness. Black mage is cursed. You are both dying in pain.");
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);                     
                           }
                        else if (questionNumber == 2) {
                           playerR -= 4*coefficientDamage;
                           System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                           System.out.println("You stab his chest with your sword."); 
                           System.out.println("As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                           }
                        else if (questionNumber == 3) {
                           System.out.println("You are slowly cutting through his neck. He is screaming and you can hear his blood bubbling in his mouth and throat. He is really suffering!");
                           System.out.println("As he dies, burst of dark energy hits you!");
                           playerHP -= 3/coefficientHealth;
                           if (playerHP <= 0) {
                              System.out.println("You died!!!");
                              deathPic ();
                              System.exit(0); }
                           }
                                                  
                                                 
                     }
                                                           
                                                           
                  } // end of strong attack 
                                               
                                                                                  
                  else if (questionNumber ==2) {  // fast attack
                                                
                     System.out.println("You try to perfotm fast attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage)  -5 "+ playerResource + " \n 2. Quickly attack once more! (Fast, low damage)  -3 "+ playerResource + "\n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your sword cuts through him like through the butter. His insides are lying on the floor near him. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                     }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {          //dagger attack 
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }
               
                 }// end of fast attack
                 
                 else if (questionNumber == 3) {
                     System.out.println("You try to perfotm dagger attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage)  -5 "+ playerResource + " \n 2. Quickly attack once more! (Fast, low damage) -3 "+ playerResource + " \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your sword cuts through him like through the butter. His insides are lying on the floor near him. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                        }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {       
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }


               } // end of dagger attack  
                                              
            } // ending warrior fight
            
            
            else {  // begin mage fight
               playerHP -= 1/coefficientHealth;
                     playerR -= 3*coefficientDamage;
                     System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                     System.out.println("You quickly stand up. Mage casts a fireball that hits you, but you trained for this, so you are more or less unharmed. You are running towards him.\nYou cast a quick spell and burn his arm.");
                     if (playerHP <= 0) {
                        System.out.println("You died!!!");
                        deathPic ();
                        System.exit(0);}
                     System.out.println("The mages blood colors his cape. He lookes angry, but injury is quite serious!");
                     System.out.println("How will the fight coninue?\n 1. Strong attack (Huge damage, slower)  -5 "+ playerResource + " \n 2. Fast attack (Lesser damage, really fast)  -3 "+ playerResource + " \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1){
                        playerR -= 5*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You try to cast the most powerful attack you can! You shout the magical words and summon a demonic dragon created from a fire. You hit the mage!");
                        pressEnterToContinue ();
                        System.out.println("However, it was just an illusion! The true mage had enough time to cast it and now he is standing behind you, stabbing his dagger into your back!");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);}
                        System.out.println("What do you want to do next?\n 1. Cast sparks (You will stun him) \n 2. Crouch freeze his legs (You will be successful, but suffer damage! -3 "+ playerResource );
                        questionNumber = input.nextInt();
                        while (questionNumber != 1 && questionNumber != 2 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<3 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 2){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.print("You cast a spark spell. He is stunned! Now it's time to attack!");
                           System.out.println("What do you want to do next?\n 1. Finish him! (Fatality)  -5 "+ playerResource + " \n 2. Hit him hard with dagger (He will maybe not die)");
                           questionNumber = input.nextInt();
                           while (questionNumber != 1 && questionNumber != 2 ){
                              System.out.println("Please choose properly!");
                              questionNumber = input.nextInt();}
                           while (playerR<4 && questionNumber == 1) {
                              System.out.println("You can't do that, you are too weak");
                              questionNumber = input.nextInt();
                              if (questionNumber != 1){
                                 break;  }}
                           if (questionNumber == 1)  {
                              playerR -= 5*coefficientDamage;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                              System.out.println("He is weak now, so you can cast a curse on him. He explodes from the inside. His insides are lying on the floor near him. The fight is over.");
                              System.out.println("As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                              }
                           else{
                              playerHP -= 4*coefficientHealth;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");     
                              System.out.println("You hit mage into the stomach with your small dagger. He is dying now, for sure. Still he manages to cast another shadow bolt in your direction.");     
                              System.out.println("Surprised by this action, you couldn't dodge it!");
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0);}  
                              System.out.println("There's not much to think about, you have to kill him now! You run towards him, with all your energy left.");
                              if (playerR<5){
                                 playerR = 1;}
                              else {
                                 playerR -= 5*coefficientDamage;}
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                              System.out.println("He is weak now, so you can cast a curse on him. He explodes from the inside. Rest of his body falls to the ground. As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              
                              }
                           }
                     
                     else { // begin crouch attack
                        playerR -= 3*coefficientDamage;
                        playerHP -= 4/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You crouch unexpectedly and freeze his legs! Mage suffers serious damage, he can't stand anymore");
                        System.out.println("He is shouting in pain! Through all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit.");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You survived it, somehow. He is crawling away from you scared od dying.");
                        System.out.println("What will you do? \n 1. Spare his life (You are a good person!) \n 2. Kill him angrily with burning spell (He will die quickly)  -5 "+ playerResource + " \n 3. Slowly cut his throat with your dagger (He will die in horrible pain)");
                        while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<5 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 1){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.println("You decide to spare mages life. You are about to his hand. Suddenly, when you hold it, you feel horrible pain. \nDarkness enters your body. Now, you don't feel anything more, just pain and emptyness. Black mage is cursed. You are both dying in pain.");
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);                     
                           }
                        else if (questionNumber == 2) {
                           playerR -= 5*coefficientDamage;
                           System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                           System.out.println("You instantly cremate him."); 
                           System.out.println("As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                           }
                        else if (questionNumber == 3) {
                           System.out.println("You are slowly cutting through his neck. He is screaming and you can hear his blood bubbling in his mouth and throat. He is really suffering!");
                           System.out.println("As he dies, burst of dark energy hits you!");
                           playerHP -= 3/coefficientHealth;
                           if (playerHP <= 0) {
                              System.out.println("You died!!!");
                              deathPic ();
                              System.exit(0); }
                           }
                                                  
                                                 
                     }
                                                           
                                                           
                  } // end of strong attack 
                                               
                                                                                  
                  else if (questionNumber ==2) {  // fast attack
                                                
                     System.out.println("You try to perfotm fast attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage)  -5 "+ playerResource + "\n 2. Quickly attack once more! (Fast, low damage)  -3 "+ playerResource + "\n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your powerful lighting bolt flies through him like through the cloud. He is lying on the floor near the symbols. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                     }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {          //dagger attack 
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }
               
                 }// end of fast attack
                 
                 else if (questionNumber == 3) { // start dagger attack
                     System.out.println("You try to perfotm dagger attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage)  -5 "+ playerResource + "\n 2. Quickly attack once more! (Fast, low damage)  -3 "+ playerResource + " \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your powerful lighting bolt flies through him like through the cloud. He is lying on the floor near the symbols. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                        }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {       
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       System.out.println("As he dies, burst of dark energy hits you!");
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }


               } // end dagger attack
            
            
            } //end of mage fight                               
                                           
                   
         
                                 
                              
            System.out.println("Mage is dead. You survived!");
         } // end fight
         
         else if (questionNumber == 2) {  // begin talking
            System.out.println("\"What do you wanted to do with her?\" you ask the mage. He, however, doesn't look like he would like to talk! You interrupted his ritual, what would you expect?");
            System.out.println("Instead, he casts a fireball at you!");
            if (playerClass == 2){
                     playerHP -= 1/coefficientHealth;
                     playerR -= 3*coefficientDamage;
                     System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                     System.out.println("Fireball hits you, but you wear an iron armor, so you are more or less unharmed. You are running towards him.\nYou swing your sword and cut his arm.");
                     if (playerHP <= 0) {
                        System.out.println("You died!!!");
                        deathPic ();
                        System.exit(0);}
                     System.out.println("The mages blood colors his cape. He lookes angry, but injury is quite serious!");
                     System.out.println("How will the fight coninue?\n 1. Strong attack (Huge damage, slower) \n 2. Fast attack (Lesser damage, really fast) \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1){
                        playerR -= 5*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You try to perform the most powerful attack you can! You swing your sword and cut through the mage!");
                        pressEnterToContinue ();
                        System.out.println("However, it was just an illusion! The true mage had enough time to cast it and now he is standing behind you, stabbing his dagger into your back!");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);}
                        System.out.println("What do you want to do next?\n 1. Hit him with handle (You will stun him) \n 2. Crouch and cut his legs (You will be successful, but suffer damage!  -3 "+ playerResource );
                        questionNumber = input.nextInt();
                        while (questionNumber != 1 && questionNumber != 2 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<3 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 2){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.print("You hit the mage with the handle of your sword. He looks stunned! Now it's time to attack!");
                           System.out.println("What do you want to do next?\n 1. Finish him! (Fatality)  -5 "+ playerResource + " \n 2. Hit him hard with dagger (He will maybe not die)");
                           questionNumber = input.nextInt();
                           while (questionNumber != 1 && questionNumber != 2 ){
                              System.out.println("Please choose properly!");
                              questionNumber = input.nextInt();}
                           while (playerR<5 && questionNumber == 1) {
                              System.out.println("You can't do that, you are too weak");
                              questionNumber = input.nextInt();
                              if (questionNumber != 1){
                                 break;  }}
                           if (questionNumber == 1)  {
                              playerR -= 5*coefficientDamage;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                              System.out.println("Your sword cuts through him like through the butter. His insides are lying on the floor near him. The fight is over.");
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                              System.out.println("As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                              }
                           else{
                              playerHP -= 4*coefficientHealth;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");     
                              System.out.println("You hit mage into the stomach with your small dagger. He is dying now, for sure. Still he manages to cast another shadow bolt in your direction.");     
                              System.out.println("Surprised by this action, you couldn't dodge it!");
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0);}  
                              System.out.println("There's not much to think about, you have to kill him now! You run towards him, with all your energy left.");
                              if (playerR<5){
                                 playerR = 1;}
                              else {
                                 playerR -= 5*coefficientDamage;}
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                              System.out.println("You cut him in his neck! He falls to the ground. As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              
                              }
                           }
                     
                     else { // begin crouch attack
                        playerR -= 3*coefficientDamage;
                        playerHP -= 4/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You crouch unexpectedly and cut his legs! Mage suffers serious damage, he can't stand anymore");
                        System.out.println("He is shouting in pain! Through all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit.");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You survived it, somehow. He is crawling away from you scared od dying.");
                        System.out.println("What will you do? \n 1. Spare his life (You are a good person!) \n 2. Kill him angrily with your sword (He will die quickly)  -5 "+ playerResource + " \n 3. Slowly cut his throat with your dagger (He will die in horrible pain)");
                        while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<5 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 1){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.println("You decide to spare mages life. You are about to his hand. Suddenly, when you hold it, you feel horrible pain. \nDarkness enters your body. Now, you don't feel anything more, just pain and emptyness. Black mage is cursed. You are both dying in pain.");
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);                     
                           }
                        else if (questionNumber == 2) {
                           playerR -= 5*coefficientDamage;
                           System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                           System.out.println("You stab his chest with your sword."); 
                           System.out.println("He falls to the ground. As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                           }
                        else if (questionNumber == 3) {
                           System.out.println("You are slowly cutting through his neck. He is screaming and you can hear his blood bubbling in his mouth and throat. He is really suffering!");
                           System.out.println("As he dies, burst of dark energy hits you!");
                           playerHP -= 3/coefficientHealth;
                           if (playerHP <= 0) {
                              System.out.println("You died!!!");
                              deathPic ();
                              System.exit(0); }
                           }
                                                  
                                                 
                     }
                                                           
                                                           
                  } // end of strong attack 
                                               
                                                                                  
                  else if (questionNumber ==2) {  // fast attack
                                                
                     System.out.println("You try to perfotm fast attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage)  -5 "+ playerResource + " \n 2. Quickly attack once more! (Fast, low damage)  -3 "+ playerResource + " \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your sword cuts through him like through the butter. His insides are lying on the floor near him. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                     }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {          //dagger attack 
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }
               
                 }// end of fast attack
                 
                 else if (questionNumber == 3) {
                     System.out.println("You try to perfotm dagger attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage)  -5 "+ playerResource + " \n 2. Quickly attack once more! (Fast, low damage) -3 "+ playerResource + " \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your sword cuts through him like through the butter. His insides are lying on the floor near him. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                        }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {       
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }


                 } // end of dagger attack  
                                              
              } // end of talking for warrior
              
            else { // talking for mage
               playerHP -= 1/coefficientHealth;
                     playerR -= 3*coefficientDamage;
                     System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                     System.out.println("You quickly stand up. Mage casts a fireball that hits you, but you trained for this, so you are more or less unharmed. You are running towards him.\nYou cast a quick spell and burn his arm.");
                     if (playerHP <= 0) {
                        System.out.println("You died!!!");
                        deathPic ();
                        System.exit(0);}
                     System.out.println("The mages blood colors his cape. He lookes angry, but injury is quite serious!");
                     System.out.println("How will the fight coninue?\n 1. Strong attack (Huge damage, slower)  -5 "+ playerResource + "\n 2. Fast attack (Lesser damage, really fast)  -3 "+ playerResource + " \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1){
                        playerR -= 5*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You try to cast the most powerful attack you can! You shout the magical words and summon a demonic dragon created from a fire. You hit the mage!");
                        pressEnterToContinue ();
                        System.out.println("However, it was just an illusion! The true mage had enough time to cast it and now he is standing behind you, stabbing his dagger into your back!");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);}
                        System.out.println("What do you want to do next?\n 1. Cast sparks (You will stun him) \n 2. Crouch and freeze his legs (You will be successful, but suffer damage!  -3 "+ playerResource );
                        questionNumber = input.nextInt();
                        while (questionNumber != 1 && questionNumber != 2 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<3 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 2){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.print("You cast a spark spell. He is stunned! Now it's time to attack!");
                           System.out.println("What do you want to do next?\n 1. Finish him! (Fatality) \n 2. Hit him hard with dagger (He will maybe not die)");
                           questionNumber = input.nextInt();
                           while (questionNumber != 1 && questionNumber != 2 ){
                              System.out.println("Please choose properly!");
                              questionNumber = input.nextInt();}
                           while (playerR<4 && questionNumber == 1) {
                              System.out.println("You can't do that, you are too weak");
                              questionNumber = input.nextInt();
                              if (questionNumber != 1){
                                 break;  }}
                           if (questionNumber == 1)  {
                              playerR -= 5*coefficientDamage;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                              System.out.println("He is weak now, so you can cast a curse on him. He explodes from the inside. His insides are lying on the floor near him. The fight is over.");
                              System.out.println("As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                              }
                           else{
                              playerHP -= 4*coefficientHealth;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");     
                              System.out.println("You hit mage into the stomach with your small dagger. He is dying now, for sure. Still he manages to cast another shadow bolt in your direction.");     
                              System.out.println("Surprised by this action, you couldn't dodge it!");
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0);}  
                              System.out.println("There's not much to think about, you have to kill him now! You run towards him, with all your energy left.");
                              if (playerR<5){
                                 playerR = 1;}
                              else {
                                 playerR -= 5*coefficientDamage;}
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                              System.out.println("He is weak now, so you can cast a curse on him. He explodes from the inside. Rest of his body falls to the ground. As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              
                              }
                           }
                     
                     else { // begin crouch attack
                        playerR -= 3*coefficientDamage;
                        playerHP -= 4/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You crouch unexpectedly and freeze his legs! Mage suffers serious damage, he can't stand anymore");
                        System.out.println("He is shouting in pain! Through all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit.");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You survived it, somehow. He is crawling away from you scared od dying.");
                        System.out.println("What will you do? \n 1. Spare his life (You are a good person!) \n 2. Kill him angrily with burning spell (He will die quickly)  -5 "+ playerResource + " \n 3. Slowly cut his throat with your dagger (He will die in horrible pain)");
                        while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<5 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 1){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.println("You decide to spare mages life. You are about to his hand. Suddenly, when you hold it, you feel horrible pain. \nDarkness enters your body. Now, you don't feel anything more, just pain and emptyness. Black mage is cursed. You are both dying in pain.");
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);                     
                           }
                        else if (questionNumber == 2) {
                           playerR -= 5*coefficientDamage;
                           System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                           System.out.println("You instantly cremate him."); 
                           System.out.println("As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                           }
                        else if (questionNumber == 3) {
                           System.out.println("You are slowly cutting through his neck. He is screaming and you can hear his blood bubbling in his mouth and throat. He is really suffering!");
                           System.out.println("As he dies, burst of dark energy hits you!");
                           playerHP -= 3/coefficientHealth;
                           if (playerHP <= 0) {
                              System.out.println("You died!!!");
                              deathPic ();
                              System.exit(0); }
                           }
                                                  
                                                 
                     }
                                                           
                                                           
                  } // end of strong attack 
                                               
                                                                                  
                  else if (questionNumber ==2) {  // fast attack
                                                
                     System.out.println("You try to perfotm fast attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage) \n 2. Quickly attack once more! (Fast, low damage) \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your powerful lighting bolt flies through him like through the cloud. He is lying on the floor near the symbols. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                     }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {          //dagger attack 
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }
               
                 }// end of fast attack
                 
                 else if (questionNumber == 3) { // start dagger attack
                     System.out.println("You try to perfotm dagger attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage) \n 2. Quickly attack once more! (Fast, low damage) \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your powerful lighting bolt flies through him like through the cloud. He is lying on the floor near the symbols. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                        }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {       
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       System.out.println("As he dies, burst of dark energy hits you!");
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }


               } // end dagger attack         
            } // end of talking for mage
           
          } // end of talking
         
         
         
         
         
         else { // begin running
            playerHP -= 6/coefficientHealth;
            System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
            System.out.println("You stand up somehow and turn to the door. Of course, you get a hard hit in your back by an unknown spell!");
            if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
            System.out.println("Luckily, you manage to stay on your legs. You are running to the door, slower than before.");
            pressEnterToContinue();
            playerHP -= 6/coefficientHealth;
            System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
            System.out.println("You are almost out! You are just in the door, when you feel terrible pain! All your insides feel like burning. You see a shadowy, dark creature coming through your chest.");
            if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
            System.out.println("This pain is unbearable! You don't know how, but you manage to sustain it. Now, you are running into the forrest, not looking back!");              
            
            }  // end of running
            
         } //end of getting home
         
      else { // start of fighting the mage first
         if (playerClass == 1) { // begin fight as mage
            System.out.println("What do you want to do?\n 1. Strong attack (Mana consuming, slow, heavy damage)\n 2. Attack with dagger (Fast, noisy, no mana consumption, low damage)");
            while (questionNumber != 1 && questionNumber != 2  ){
               System.out.println("Please choose properly!");
               questionNumber = input.nextInt();}
            while (playerR<5 && questionNumber == 1) {
               System.out.println("You can't do that, you are too weak");
               questionNumber = input.nextInt();
               if (questionNumber != 1){
                  break;  }}
            if (questionNumber == 1) {
               playerR -= 5*coefficientDamage;
               System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
               System.out.println("You attack the mage with powerful fireball. He is knocked to the ground by it!");
               System.out.println("Sooner as you can do something, however, he casts a huge shadow bolt. You gained enough time to dodge it!");
               pressEnterToContinue();
               System.out.println("You hear girl screaming. The place she is tied is right behind you. She is killed by the shadow bolt and her blouse is no longer white. Her dead body is hanging on the wall.\nHer blood is dripping from the blouse.");
               System.out.println("This puts you on your knees. Now you have to kill him!");
               }
            else {
               System.out.println("You attack the mage with your dagger. He heard you running and now he turns his face to you!");
               System.out.println("Sooner as you can do something, he casts a huge shadow bolt. You gained enough time to dodge it!");
               pressEnterToContinue();
               System.out.println("You hear girl screaming. The place she is tied is right behind you. She is killed by the shadow bolt and her blouse is no longer white. Her dead body is hanging on the wall.\nHer blood is dripping from the blouse.");
               System.out.println("This puts you on your knees. Now you have to kill him!");
               }
                     // begin mage attack after attacking the mage first
                     playerHP -= 1/coefficientHealth;
                     playerR -= 3*coefficientDamage;
                     System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                     System.out.println("You quickly stand up. Mage casts a fireball that hits you, but you trained for this, so you are more or less unharmed. You are running towards him.\nYou cast a quick spell and burn his arm.");
                     if (playerHP <= 0) {
                        System.out.println("You died!!!");
                        deathPic ();
                        System.exit(0);}
                     System.out.println("The mages blood colors his cape. He lookes angry, but injury is quite serious!");
                     System.out.println("How will the fight coninue?\n 1. Strong attack (Huge damage, slower) \n 2. Fast attack (Lesser damage, really fast) \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1){
                        playerR -= 5*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You try to cast the most powerful attack you can! You shout the magical words and summon a demonic dragon created from a fire. You hit the mage!");
                        pressEnterToContinue ();
                        System.out.println("However, it was just an illusion! The true mage had enough time to cast it and now he is standing behind you, stabbing his dagger into your back!");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);}
                        System.out.println("What do you want to do next?\n 1. Cast sparks (You will stun him) \n 2. Crouch freeze his legs (You will be successful, but suffer damage!");
                        questionNumber = input.nextInt();
                        while (questionNumber != 1 && questionNumber != 2 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<3 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 2){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.print("You cast a spark spell. He is stunned! Now it's time to attack!");
                           System.out.println("What do you want to do next?\n 1. Finish him! (Fatality) \n 2. Hit him hard with dagger (He will maybe not die)");
                           questionNumber = input.nextInt();
                           while (questionNumber != 1 && questionNumber != 2 ){
                              System.out.println("Please choose properly!");
                              questionNumber = input.nextInt();}
                           while (playerR<4 && questionNumber == 1) {
                              System.out.println("You can't do that, you are too weak");
                              questionNumber = input.nextInt();
                              if (questionNumber != 1){
                                 break;  }}
                           if (questionNumber == 1)  {
                              playerR -= 5*coefficientDamage;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                              System.out.println("He is weak now, so you can cast a curse on him. He explodes from the inside. His insides are lying on the floor near him. The fight is over.");
                              System.out.println("As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                              }
                           else{
                              playerHP -= 4*coefficientHealth;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");     
                              System.out.println("You hit mage into the stomach with your small dagger. He is dying now, for sure. Still he manages to cast another shadow bolt in your direction.");     
                              System.out.println("Surprised by this action, you couldn't dodge it!");
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0);}  
                              System.out.println("There's not much to think about, you have to kill him now! You run towards him, with all your energy left.");
                              if (playerR<5){
                                 playerR = 1;}
                              else {
                                 playerR -= 5*coefficientDamage;}
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                              System.out.println("He is weak now, so you can cast a curse on him. He explodes from the inside. Rest of his body falls to the ground. As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              
                              }
                           }
                     
                     else { // begin crouch attack
                        playerR -= 3*coefficientDamage;
                        playerHP -= 4/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You crouch unexpectedly and freeze his legs! Mage suffers serious damage, he can't stand anymore");
                        System.out.println("He is shouting in pain! Through all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit.");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You survived it, somehow. He is crawling away from you scared od dying.");
                        System.out.println("What will you do? \n 1. Spare his life (You are a good person!) \n 2. Kill him angrily with burning spell (He will die quickly) \n 3. Slowly cut his throat with your dagger (He will die in horrible pain)");
                        while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<4 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 1){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.println("You decide to spare mages life. You are about to his hand. Suddenly, when you hold it, you feel horrible pain. \nDarkness enters your body. Now, you don't feel anything more, just pain and emptyness. Black mage is cursed. You are both dying in pain.");
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);                     
                           }
                        else if (questionNumber == 2) {
                           playerR -= 4*coefficientDamage;
                           System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                           System.out.println("You instantly cremate him."); 
                           System.out.println("As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                           }
                        else if (questionNumber == 3) {
                           System.out.println("You are slowly cutting through his neck. He is screaming and you can hear his blood bubbling in his mouth and throat. He is really suffering!");
                           System.out.println("As he dies, burst of dark energy hits you!");
                           playerHP -= 3/coefficientHealth;
                           if (playerHP <= 0) {
                              System.out.println("You died!!!");
                              deathPic ();
                              System.exit(0); }
                           }
                                                  
                                                 
                     }
                                                           
                                                           
                  } // end of strong attack 
                                               
                                                                                  
                  else if (questionNumber ==2) {  // fast attack
                                                
                     System.out.println("You try to perfotm fast attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage) \n 2. Quickly attack once more! (Fast, low damage) \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your powerful lighting bolt flies through him like through the cloud. He is lying on the floor near the symbols. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                     }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {          //dagger attack 
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }
               
                 }// end of fast attack
                 
                 else if (questionNumber == 3) { // start dagger attack
                     System.out.println("You try to perfotm dagger attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage) \n 2. Quickly attack once more! (Fast, low damage) \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your powerful lighting bolt flies through him like through the cloud. He is lying on the floor near the symbols. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                        }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {       
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       System.out.println("As he dies, burst of dark energy hits you!");
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }


               }
               
         
      
         } // end of mage atack after attack mage first
         
       if (playerClass == 2) { // begin fight as warrior
            System.out.println("What do you want to do?\n 1. Strong attack (Energy consuming, slow, heavy damage)\n 2. Attack with dagger (Fast, noisy, no energy consumption, low damage)");
            while (questionNumber != 1 && questionNumber != 2  ){
               System.out.println("Please choose properly!");
               questionNumber = input.nextInt();}
            while (playerR<5 && questionNumber == 1) {
               System.out.println("You can't do that, you are too weak");
               questionNumber = input.nextInt();
               if (questionNumber != 1){
                  break;  }}
            if (questionNumber == 1) {
               playerR -= 5*coefficientDamage;
               System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
               System.out.println("You hit the mage in his back. He is knocked to the ground by your sword!");
               System.out.println("Sooner as you can do something, however, he casts a huge shadow bolt. You gained enough time to dodge it!");
               pressEnterToContinue();
               System.out.println("You hear girl screaming. The place she is tied is right behind you. She is killed by the shadow bolt and her blouse is no longer white. Her dead body is hanging on the wall.\nHer blood is dripping from the blouse.");
               System.out.println("This puts you on your knees. Now you have to kill him!");
               }
            else {
               System.out.println("You attack the mage with your dagger. He heard you running and now he turns his face to you!");
               System.out.println("Sooner as you can do something, he casts a huge shadow bolt. You gained enough time to dodge it!");
               pressEnterToContinue();
               System.out.println("You hear girl screaming. The place she is tied is right behind you. She is killed by the shadow bolt and her blouse is no longer white. Her dead body is hanging on the wall.\nHer blood is dripping from the blouse.");
               System.out.println("This puts you on your knees. Now you have to kill him!");
               }
                  // begin fight as warrior
               
                     playerHP -= 1/coefficientHealth;
                     playerR -= 3*coefficientDamage;
                     System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                     System.out.println("You quickly stand up. Mage casts a fireball that hits you, but you wear an iron armor, so you are more or less unharmed. You are running towards him.\nYou swing your sword and cut his arm.");
                     if (playerHP <= 0) {
                        System.out.println("You died!!!");
                        deathPic ();
                        System.exit(0);}
                     System.out.println("The mages blood colors his cape. He lookes angry, but injury is quite serious!");
                     System.out.println("How will the fight coninue?\n 1. Strong attack (Huge damage, slower) \n 2. Fast attack (Lesser damage, really fast) \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1){
                        playerR -= 5*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You try to perform the most powerful attack you can! You swing your sword and cut through the mage!");
                        pressEnterToContinue ();
                        System.out.println("However, it was just an illusion! The true mage had enough time to cast it and now he is standing behind you, stabbing his dagger into your back!");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);}
                        System.out.println("What do you want to do next?\n 1. Hit him with handle (You will stun him) \n 2. Crouch and cut his legs (You will be successful, but suffer damage!");
                        questionNumber = input.nextInt();
                        while (questionNumber != 1 && questionNumber != 2 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<3 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 2){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.print("You hit the mage with the handle of your sword. He looks stunned! Now it's time to attack!");
                           System.out.println("What do you want to do next?\n 1. Finish him! (Fatality) \n 2. Hit him hard with dagger (He will maybe not die)");
                           questionNumber = input.nextInt();
                           while (questionNumber != 1 && questionNumber != 2 ){
                              System.out.println("Please choose properly!");
                              questionNumber = input.nextInt();}
                           while (playerR<4 && questionNumber == 1) {
                              System.out.println("You can't do that, you are too weak");
                              questionNumber = input.nextInt();
                              if (questionNumber != 1){
                                 break;  }}
                           if (questionNumber == 1)  {
                              playerR -= 5*coefficientDamage;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                              System.out.println("Your sword cuts through him like through the butter. His insides are lying on the floor near him. The fight is over.");
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                              System.out.println("As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                              }
                           else{
                              playerHP -= 4*coefficientHealth;
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");     
                              System.out.println("You hit mage into the stomach with your small dagger. He is dying now, for sure. Still he manages to cast another shadow bolt in your direction.");     
                              System.out.println("Surprised by this action, you couldn't dodge it!");
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0);}  
                              System.out.println("There's not much to think about, you have to kill him now! You run towards him, with all your energy left.");
                              if (playerR<5){
                                 playerR = 1;}
                              else {
                                 playerR -= 5*coefficientDamage;}
                              System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                              System.out.println("You cut him in his neck! He falls to the ground. As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                              
                              }
                           }
                     
                     else { // begin crouch attack
                        playerR -= 3*coefficientDamage;
                        playerHP -= 4/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        System.out.println("You crouch unexpectedly and cut his legs! Mage suffers serious damage, he can't stand anymore");
                        System.out.println("He is shouting in pain! Through all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit.");
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You survived it, somehow. He is crawling away from you scared od dying.");
                        System.out.println("What will you do? \n 1. Spare his life (You are a good person!) \n 2. Kill him angrily with your sword (He will die quickly) \n 3. Slowly cut his throat with your dagger (He will die in horrible pain)");
                        while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                           System.out.println("Please choose properly!");
                           questionNumber = input.nextInt();}
                        while (playerR<4 && questionNumber == 2) {
                           System.out.println("You can't do that, you are too weak");
                           questionNumber = input.nextInt();
                           if (questionNumber != 1){
                              break;  }}
                        if (questionNumber == 1) {
                           System.out.println("You decide to spare mages life. You are about to his hand. Suddenly, when you hold it, you feel horrible pain. \nDarkness enters your body. Now, you don't feel anything more, just pain and emptyness. Black mage is cursed. You are both dying in pain.");
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0);                     
                           }
                        else if (questionNumber == 2) {
                           playerR -= 4*coefficientDamage;
                           System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                           System.out.println("You stab his chest with your sword."); 
                           System.out.println("He falls to the ground. As he dies, burst of dark energy hits you!");
                              playerHP -= 3/coefficientHealth;
                              if (playerHP <= 0) {
                                 System.out.println("You died!!!");
                                 deathPic ();
                                 System.exit(0); }
                           }
                        else if (questionNumber == 3) {
                           System.out.println("You are slowly cutting through his neck. He is screaming and you can hear his blood bubbling in his mouth and throat. He is really suffering!");
                           System.out.println("As he dies, burst of dark energy hits you!");
                           playerHP -= 3/coefficientHealth;
                           if (playerHP <= 0) {
                              System.out.println("You died!!!");
                              deathPic ();
                              System.exit(0); }
                           }
                                                  
                                                 
                     }
                                                           
                                                           
                  } // end of strong attack 
                                               
                                                                                  
                  else if (questionNumber ==2) {  // fast attack
                                                
                     System.out.println("You try to perfotm fast attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage) \n 2. Quickly attack once more! (Fast, low damage) \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your sword cuts through him like through the butter. His insides are lying on the floor near him. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                     }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {          //dagger attack 
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }
               
                 }// end of fast attack
                 
                 else if (questionNumber == 3) {
                     System.out.println("You try to perfotm dagger attack.Mage do not have time to do anything, his shoulder is seriously injured now!");
                     System.out.println("He is standing there, holding his shoulder. He is starting to cast a spell!");
                     System.out.println("What will you do?\n 1. Perform a strong attack now! (Slow, major damage) \n 2. Quickly attack once more! (Fast, low damage) \n 3. Attack with dagger (No energy consumption)");
                     questionNumber = input.nextInt();
                     while (questionNumber != 1 && questionNumber != 2 && questionNumber != 3 ){
                        System.out.println("Please choose properly!");
                        questionNumber = input.nextInt();}
                     while (playerR<5 && questionNumber == 1) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 1){
                           break;  }}
                     while (playerR<3 && questionNumber == 2) {
                        System.out.println("You can't do that, you are too weak");
                        questionNumber = input.nextInt();
                        if (questionNumber != 2){
                           break;  }}
                     if (questionNumber == 1)  {
                        playerR -= 5*coefficientDamage;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("Your sword cuts through him like through the butter. His insides are lying on the floor near him. The fight is over.");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); };
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
                        }
                     else if (questionNumber == 2) { 
                        playerR -= 3*coefficientDamage;
                        playerHP -= 3/coefficientHealth;
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                        System.out.println("You attack quickly! You hit the mage and he falls to the floor. He shout his last words and you are hit by a small piece of ice he casted!");
                        System.out.println("As he dies, burst of dark energy hits you!");
                        playerHP -= 3/coefficientHealth;
                        if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");
                        }
                     else {       
                       playerHP -= 3/coefficientHealth;
                       System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");  
                       System.out.println("You run towards mage. He is not able to cast a spell, you are too fast now. You stab him in the stomach. Blood starts to flow on the floor. He is screaming from pain.\nThrough all the shouts, you only hear \"DIE!!!\" as he hurls a purple ball of unknown energy at you. You get a direct hit."); 
                       System.out.println("Through all the pain, you stab him once more. He is not moving anymore.");
                       pressEnterToContinue ();
                       playerHP -= 3/coefficientHealth;
                       if (playerHP <= 0) {
                           System.out.println("You died!!!");
                           deathPic ();
                           System.exit(0); }
                        System.out.println("You have " + playerR + " " + playerResource + " and " + playerHP + " health points left.");                            
                       }
                   }
                   
                 }
       } // end of fighting the mage first
         
      System.out.println("You are leaving the cabin with " + playerR + " " + playerResource + " and " + playerHP + " health points left."); 
      System.out.println("Not long time after, you manage to get to the road heading to the city. You should be safe now. You want to get help in the city castle. (Part 2 maybe coming... Maybe.)");
      System.out.println("Thank you for playing the game. You decided to help the girl, but not your friend!");
      System.exit(0);
    
      } // end of getting into cabin
     
      
      else if (questionNumber == 2) {
         System.out.println("You decided to leave another person helpless. You walk away with terrible feeling. \nNot long time after, you manage to get to the road heading to the city. You should be safe now. You want to get help in the city castle. (Part 2 maybe coming... Maybe.)");
         System.out.println("Thank you for playing the game. You decided not to help anybody, you thought only about yourself!");
         System.exit(0);}
     
                     
   } // end of decision to go home
 } // end of main method
               

    
      //method for pressing enter
   private static void pressEnterToContinue () { 
      System.out.println("Press enter to continue...");
      Scanner scanner = new Scanner(System.in);
      scanner.nextLine(); }    
   
   private static void deathPic () {
      System.out.println("             .... ");
      System.out.println("            ;::::;"); 
      System.out.println("          ;::::; :;");
      System.out.println("         ;:::::'   :;");
      System.out.println("        ;:::::;     ;.");
      System.out.println("       ,:::::'       ;           OOO\\");
      System.out.println("       ::::::;       ;          OOOOO\\");
      System.out.println("       ;:::::;       ;         OOOOOOOO");
      System.out.println("      ,;::::::;     ;'         / OOOOOOO");
      System.out.println("    ;:::::::::`. ,,,;.        /  / DOOOOOO");
      System.out.println("  .';:::::::::::::::::;,     /  /     DOOOO");
      System.out.println(" ,::::::;::::::;;;;::::;,   /  /        DOOO");
      System.out.println(";`::::::`'::::::;;;::::: ,#/  /          DOOO");
      System.out.println(":`:::::::`;::::::;;::: ;::#  /            DOOO");
      System.out.println("::`:::::::`;:::::::: ;::::# /              DOO");
      System.out.println("`:`:::::::`;:::::: ;::::::#/               DOO");
      System.out.println(" :::`:::::::`;; ;:::::::::##                OO");
      System.out.println(" ::::`:::::::`;::::::::;:::#                OO");
      System.out.println(" `:::::`::::::::::::;'`:;::#                O");
      System.out.println("  `:::::`::::::::;' /  / `:#");
      System.out.println("   ::::::`:::::;'  /  /   `#"); }


}

