package project;

import java.util.HashMap;

//each node contains a hash
public class Node {
    String key;
    public HashMap<String, String> hasher;
    Node(String keyData){
        key = keyData;
    }
    Node right;
    Node left;

}
