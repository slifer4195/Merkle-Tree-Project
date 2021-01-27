package project;

import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Vector;

//abstractr class for reading holds the reading content file to an Object
public abstract class Read<T>{

    int count;
    Read(int ToCount){
        count = ToCount;
    }
    //abstract functions 
    public abstract Vector<String> getData();
    public abstract Boolean compare(ArrayList arrHold);
    public abstract void asking();

    Hold tank = new Hold<>();
    //this function reads from the secret.txt file and collects the data that file
    public void readfile() {
        try {
                    File myObj = new File("secret.txt");
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNext()) {
                        String data = myReader.next();
                        tank.add(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
        }

    public void printAll(){
        tank.printAll();
    }

    public ArrayList<T> getHold(){
        return tank.getTank();
    } 

    // public void giveLength(){
    //     //stub function we will be implemt
    //     //this gives the length of the words in file
    // }
}