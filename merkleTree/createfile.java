package project;
import java.io.*;
import java.util.*;


//this class is a generic type class that heps to copy/write to a file from reading file
public class createfile<T> {
    
    private ArrayList<T> holder = new ArrayList<T>(); //genreic
    private Formatter x;
    private int cnt = 0;
    createfile(ArrayList<T> readContent){
        holder = readContent;
    }

    public void openFile() {
        try {
            x = new Formatter("copy.txt");
        }
        catch(Exception e){
            System.out.println("Have an error");
        }
    }
    // writes to a different file in a correct format
    public void addRecords(){
        for (int i = 0; i < holder.size(); i++){
            // System.out.println(holder.get(i));
            x.format("%s%s", holder.get(i) ," ");
            cnt += 1;
            if (cnt == 8) {
                x.format("%s" ,"\n ");
                cnt -= 8;
            };
        }
        // x.format("%s%s%s", "20 ","bucky ", "");        
    }
    public void closeFile(){
        x.close();
    }
}
