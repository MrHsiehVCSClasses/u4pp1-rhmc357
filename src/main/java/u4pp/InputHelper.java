package u4pp;

import java.util.Scanner;

public class InputHelper {
    static String input;
    //a constructor which takes in a scanner that is used to read the input
    InputHelper(Scanner scanner){
        Scanner myScanner = scanner;
        
        input = myScanner.nextLine();
    }

    //takes in a prompt, asks the player the prompt. 
    //Everytime the player does not answer something that starts with a `y`, `Y`, `n`, or `N`, 
    //it tell the player that their input is invalid, and asks them the prompt again. 
    //Loops until proper input is given, at which point, it returns a `true` for yes and `false` for no.
    public boolean getYesNoInput(String prompt){
        System.out.println(prompt);
        while (InputHelper.input != "y" || InputHelper.input != "Y" || InputHelper.input != "n" || InputHelper.input != "N"){
            System.out.println(prompt);
        }
        if (InputHelper.input .equals ("y") || InputHelper.input != "Y"){
            return true;
        }
        return false;
    }

    //does the same thing as `getYesNoInput`, except for a few differences: 
    //Repeatedly prompts until a proper integer input is given. 
    //The integer must be larger than or equal to `min`, and less than or equal to `max`.
    public int getIntegerInput(String prompt, int min, int max){
        System.out.println(prompt);
        int num = Integer.parseInt(InputHelper.input);
        while (num < min || num > max){
            System.out.println(prompt);
        }
        return num;
    }
}
