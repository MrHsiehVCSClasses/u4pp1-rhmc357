package u4pp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        InputHelper myInputHelper = new InputHelper(myScanner);
        myInputHelper.getYesNoInput("answer y/n");
        myInputHelper.getIntegerInput("give me num", 1, 10);
    }
    
}