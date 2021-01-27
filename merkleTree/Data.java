package project;
import java.util.Vector;

//these are the datasets for the leafNodes
public class Data {
    protected String firstData;
    protected String secondData;
    protected String thirdData;
    protected String forthData;
    protected String fifthData;
    protected String sixthData;
    protected String seventhData;
    protected String eigthData;

    protected Node firstNode;
    protected Node secondNode;
    protected Node thirdNode;
    protected Node forthNode;
    protected Node fifthNode;
    protected Node sixthNode;
    protected Node seventhNode;
    protected Node eigthNode;

    Data(Vector<String> userInput){
        firstData = userInput.get(0);
        firstNode = new Node(firstData);
        secondData = userInput.get(1);
        secondNode = new Node(secondData);
        thirdData = userInput.get(2);
        thirdNode = new Node(thirdData);
        forthData = userInput.get(3);
        forthNode = new Node(forthData);
        fifthData = userInput.get(4);
        fifthNode = new Node(fifthData);
        sixthData = userInput.get(5);
        sixthNode = new Node(sixthData);
        seventhData = userInput.get(6);
        seventhNode = new Node(seventhData);
        eigthData = userInput.get(7);
        eigthNode = new Node(eigthData);
    }    
}
