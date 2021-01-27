package project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class UserInput extends Read {

    private int length;

    //setting the legnth
    UserInput(int userlength){
        super(userlength);
    }

    Vector<String> input = new Vector<String>();
    private String userData;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object

    //this is the user asking format and collecting data from the user
    public void asking() {
        System.out.println("All words should be typed in all small cases or all Upper cases: ");
        System.out.println("Enter one of eight key words to unlock: ");
        int cnt = 0;
        while (cnt < 8) {
            userData = myObj.next(); // Read user input
            System.out.println("Enter the next word"); // Output user input
            input.add(userData);
            cnt++;
        }
    }

    public Vector<String> getData() {
        return input;
    }

    //convert everything to upper for comaprison because user may input small case letters
    public Boolean compare(ArrayList arrHold) {
        for (int i = 0; i < count; i++) {
            String compareWord = input.get(i).toString().toUpperCase();
            // String upper = compareWord.toUpperCase();
            // System.out.println(input.get(i) + "   " + upper + "   " + input.get(i).equals(upper));
            if (!arrHold.get(i).equals(compareWord)){
                // System.out.println("input: " + compareWord + "  " + "reading: " + arrHold.get(i));
                // System.out.println(input.get(i) + " " + upper +  "     " +  input.get(i).equals(compareWord));
              return false;
            }
            // System.out.println(arrHold.get(i) +"  " + compareWord);
        }
    return true;
    }
}
