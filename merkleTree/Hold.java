package project;
import java.util.ArrayList;

//generic array
//because its generic it can read any types in the reading file 
public class Hold<T>{
    ArrayList<T> holdBack = new ArrayList<T>();
    int size = 0; 

    public T getFirst(){
        return holdBack.get(0);
    }

    public void add(T item){
        holdBack.add(item);
        size += 1;
    }

    public int getSize(){
        return holdBack.size();
    }

     public void printAll(){
        for (int i = 0; i < this.holdBack.size();i++){
            System.out.println(this.holdBack.get(i));
        }
    }
    public ArrayList<T> getTank(){
        return holdBack;
    }

    //filter out all the small letters so that the array of secret reading file has the 8 capital words
    public void filter(){
        ArrayList<T> temp = new ArrayList<>();
        String word = new String();
        for (int i = 0; i < holdBack.size(); i++){
            if (holdBack.get(i).getClass().equals(word.getClass())){
                word = String.valueOf(holdBack.get(i));  //
                if (isUpperCase(word)){
                    temp.add(holdBack.get(i));
                }
            }
        }
        System.out.print(temp.size());
        this.holdBack = temp;
        System.out.println(this.holdBack.size());
        // return temp;
    }

    public boolean isUpperCase(String s)
    {
        for (int i=0; i<s.length(); i++)
        {
            if (!Character.isUpperCase(s.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}