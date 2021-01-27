package project;

import java.util.HashMap;


//setting the hash for the leafNodes using data and the keys
public class Leaf { 
    //this is the hash
    public HashMap<String, String> leaves = new HashMap<String,String>();

    public String key1,key2,key3,key4,key5,key6,key7,key8;

    Leaf(Data userData){
        key1 = userData.firstData;
        leaves.put(key1, userData.firstData);

        key2 = userData.secondData;
        leaves.put(key2, userData.secondData);

        key3 = userData.thirdData;
        leaves.put(key3, userData.thirdData);

        key4 = userData.forthData;
        leaves.put(key4, userData.forthData);

        key5 = userData.fifthData;
        leaves.put(key5, userData.fifthData);

        key6 = userData.sixthData;
        leaves.put(key6, userData.sixthData);

        key7 = userData.seventhData;
        leaves.put(key7, userData.seventhData);

        key8 = userData.eigthData;
        leaves.put(key8, userData.eigthData);

    }    
}

