package project;

import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;


// Application: 

// The application of this project is to secure and protect the information of the file
//when someone is trying to copy or open the content of the file. 
// A file contains important information, in which there are 8 capitalized words. The program will
//  ask the user to enter every capitalized word that the file contains. If everything they have typed
//   in is correct, the user will be given an option to either copy the file to the location the user 
//   wants or get the entire content of the file as the output of the program. If option 1 is chosen, 
//   the program will copy the entire content of the file and end the program. If option 2, then the 
//   program will output the entire content of the file and end the program. If option 3, it will stop 
//   running without taking any further action. 

//Coding requirment
//Inheritance: UserInput.java inherting the( (count variable) the length of reading file from read.java (line12 - 14 uses super to set legnth and use in line 36)
//Generic: line10,41 Read.java  line 5 Hold.java
//Abstraction: line 16-19 R,9 Read.java
//Collection: leaf.java line 5 and after

//8 answer key words : apple, banana ,cake,orange,qicu,texas,washington,zip (any order)
//every letter should be typed in either all lower cases or all upper cases

public class Driver {
  public static void main(String[] args){ 
//polymorphism:

  Read r = new UserInput(8);


  Comparator<String> com = new Comparator<String>(){
      public int compare(String l1, String l2){
        return l1.compareTo(l2);
      }};

  //reading file
  r.readfile();   //read the words
  // System.out.println(r.getHold());

  //storing the reading file item to Hold object
  Hold secret = new Hold<>();
  secret.holdBack = r.getHold();
  // secret.holdBack = secret.filter();
  secret.filter();
  Collections.sort(secret.holdBack, com);
  // secret.printAll();

  // //getting userInput and storing the input to data that leaf nodes contain
  r.asking();

  Vector<String> input = r.getData();

  Collections.sort(input, com);

  Data userData = new Data(input);
  Leaf leafNodes = new Leaf(userData);

  Bst merkle = new Bst(leafNodes,userData);
// //////////////////////////////////
//   //making the merkle tree process up to root
  merkle.createNodes();
  merkle.createGrand();
  merkle.getRoot();
//   /////////////////////////////////////////

//   //comparing the rootkey to then content of the reading file key words
  ////////////////////////////////
  //checking if match and giving the output
  int cnt = 0;

  // //////////////////////////////////
  //   //making the merkle tree process up to root
  merkle.createNodes();
  merkle.createGrand();
  merkle.getRoot();
  Boolean match = r.compare(secret.holdBack);
   
  int userChoice;
  if (match == true){
    System.out.println("You have successfully typed in the secret words. Chosee your following options by typting the #option: ");
    System.out.println("Option1: copy the file \n Option2: get the content of the file as output \n Option 3: End the program");
    Scanner scan = new Scanner(System.in);
    int choice = -12345678;
    boolean repeat = true;
	while (repeat) {
	try {
	    choice = scan.nextInt();
	    repeat = false;
	}

	catch (InputMismatchException a) {
	    System.out.print("You didn't have a valid input, please try again! ");
	    scan.next(); 
	    repeat = true;
	}
	}
    switch(choice){
      case 1:
          createfile g = new createfile(r.getHold());
          g.openFile();
          g.addRecords();
          g.closeFile();
          System.out.print("The content has been copied into a new file. ");
          break;
      case 2: 
         r.printAll();
          break;
      case 3: 
        System.out.println("Ending the program. Thank you");
        System.exit(0);
        break;
      default:
          System.out.println("Invalid input. Ending the program.");
    }
  }
  else{
    System.out.println("Invalid input. Ending the program");
  }
  }
}
