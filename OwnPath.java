/*
Title: Choose Your Path Project 1.3.8
Authors: Preston Jackson 
Date: 12/28/21 
Course: APCSA 
Despcription: A project that focuses on user input to create their own story/path.  
Preconditions: User Inputs
Postconditions: Story
*/
import java.util.Scanner;
public class OwnPath {

    public static void main(String[] args)
    {
    //Topic is Bert and Ernie Traveling through a swamp to find ur mom
    System.out.println("Welcome to the swamp eternal! Today you will be venturing with the legendary explorers Bert and Ernie. The goal is to locate your mom who is lost in the swamp.");
    System.out.println("As you enter the swamp, you quickly come across a fallen tree that splits the path. Bert thinks the group should go right, Ernie thinks left. Choose who you agree with!");
    Scanner sc = new Scanner(System.in);
    //calls for scanner class
    String userInput = sc.nextLine();
    //Beginning of if-else's
    //First decision
    if (userInput.equals("bert") || userInput.equals("Bert")){
    System.out.println("Right it is, after some more walking the group comes across foot prints. Bert thinks the footprints are too big to be your moms and that the group should stay on the path. Ernie thinks the foot prints are worth a shot. Choose who you agree with! (no caps)");
    userInput = sc.nextLine();
        //Second Decision
        if (userInput.equals("bert")){
        System.out.println("The group continues down the path and you all become lost. Bert thinks to go back the way you came. Ernie says keep walking. Choose who you agree with! (no caps");
        userInput = sc.nextLine();
            //Third Decision
            if (userInput.equals("bert"))
                System.out.println("On your way back, you find your mom. Congrats!");
            else if (userInput.equals("ernie"))
                System.out.println("You become lost beyond return! Game over!");
            else 
                System.out.println("Please restart and input a valid answer");
        }
        //Second Decision Else-if
        else if (userInput.equals("ernie")){
        System.out.println("The footprints seem to last forever. Ernie says continue. Bert says to go back. Choose who you agree with! (no caps)");
        userInput = sc.nextLine();
            if (userInput.equals("bert"))
                System.out.println("In an attempt to return you make a wrong turn and become lost. Game over!");
            else if (userInput.equals("ernie"))
                System.out.println("As you continue on, you find your mom. Congrats!");
            else 
                System.out.println("Please restart and input a valid answer");
        }
        //Second Decision Else
        else 
            System.out.println("Please restart and input a valid answer");
    }
    //First Decision Else-if
    else if (userInput.equals("ernie") || userInput.equals("Ernie")) {
    System.out.println("Left it is, after some walking the group comes across a hut. Bert thinks we should enter the hut and ask if anyone has seen your mom. Ernie thinks it would be best to go around the hut and continue on. Choose who you agree with! (no caps)");
    userInput = sc.nextLine();
        //Second Decision
        if (userInput.equals("bert")){
        System.out.println("The group enters the hut and you are met by an ogre. Bert thinks we should ask a question, Ernie thinks we should leave. Choose who you agree with! (no caps) ");
        userInput = sc.nextLine();
            //Third Decision
            if (userInput.equals("bert"))
                System.out.println("The ogre hears you and attacks. Game over!");
            else if (userInput.equals("ernie"))
                System.out.println("Good choice, as you back out you run into your mom. Congrats!");
            else 
                System.out.println("Please restart and input a valid answer"); 
        }
        //Second Decision else-if
        else if (userInput.equals("ernie")){
        System.out.println("The path seem to last forever. Ernie says continue. Bert says to go back. Choose who you agree with! (no caps)");
        userInput = sc.nextLine();
            //Third Decision
            if (userInput.equals("bert"))
                System.out.println("In an attempt to return you make a wrong turn and become lost. Game over!");
            else if (userInput.equals("ernie"))
                System.out.println("As you continue on, you find your mom. Congrats!");
            else 
                System.out.println("Please restart and input a valid answer");
        }
        //Second Decision else
        else 
            System.out.println("Please restart and input a valid answer");
    }
    //First Decision else
    else
        System.out.println("Please restart and input a valid answer");
    }
    
}
