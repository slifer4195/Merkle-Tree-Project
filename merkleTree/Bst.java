
package project;

import java.util.HashMap;


public class Bst {
    public int dataNum;
    // private Node root;
    public String firstKey,secondKey,thirdKey,forthKey , firstGrandKey, secondGrandKey;
    public String rootKey;  //root
    public Leaf leaveNodes;
    public Node firstLeaf,secondLeaf,thirdLeaf,forthLeaf,fifthLeaf,sixthLeaf,seventhLeaf,eighthLeaf;
    //;eaf nodes

    //parent nodes which are the four parent nodes of leaf nodes
    public Node firstPa = new Node("first");
    public Node secondPa = new Node("second");
    public Node thirdPa = new Node("third");
    public Node forthPa = new Node("forth");

    //parents of those four parent nodes right below root node
    public Node grandPa = new Node("first");
    public Node grandMa = new Node("second");

    public Node root = new Node("root");

    //setting and consturcting the leaf nodes to hash and its data
    Bst(Leaf leafNodes,Data userData){
        dataNum = 8;
        firstLeaf = userData.firstNode;
        leaveNodes = leafNodes;
        firstLeaf.hasher = leafNodes.leaves;

        secondLeaf = userData.secondNode;
        leaveNodes = leafNodes;
        secondLeaf.hasher = leafNodes.leaves;

        thirdLeaf = userData.thirdNode;
        leaveNodes = leafNodes;
        thirdLeaf.hasher = leafNodes.leaves;

        forthLeaf = userData.forthNode;
        leaveNodes = leafNodes;
        forthLeaf.hasher = leafNodes.leaves;

        fifthLeaf = userData.fifthNode;
        leaveNodes = leafNodes;
        fifthLeaf.hasher = leafNodes.leaves;

        sixthLeaf = userData.sixthNode;
        leaveNodes = leafNodes;
        sixthLeaf.hasher = leafNodes.leaves;

        seventhLeaf = userData.seventhNode;
        leaveNodes = leafNodes;
        seventhLeaf.hasher = leafNodes.leaves;

        eighthLeaf = userData.seventhNode;
        leaveNodes = leafNodes;
        eighthLeaf.hasher = leafNodes.leaves;        
    }

    //the process of creating the four parent  nodes from the 8 leaf nodes
    public void createNodes(){
        firstKey = leaveNodes.leaves.get(leaveNodes.key1) + leaveNodes.leaves.get(leaveNodes.key2);
        firstPa.key = firstKey;
        firstPa.right = firstLeaf;
        firstPa.left = secondLeaf;

        secondKey = leaveNodes.leaves.get(leaveNodes.key3) + leaveNodes.leaves.get(leaveNodes.key4);
        secondPa.key = secondKey;
        secondPa.right = thirdLeaf;
        secondPa.left = forthLeaf;

        thirdKey = leaveNodes.leaves.get(leaveNodes.key5) + leaveNodes.leaves.get(leaveNodes.key6);
        thirdPa.key = thirdKey;
        thirdPa.right = fifthLeaf;
        thirdPa.left = sixthLeaf;

        forthKey = leaveNodes.leaves.get(leaveNodes.key7) + leaveNodes.leaves.get(leaveNodes.key8);
        forthPa.key = forthKey;
        forthPa.right = seventhLeaf;
        forthPa.left = eighthLeaf;        
    }

    //the parent of parent nodes 
    public void createGrand(){
        firstGrandKey = firstKey + secondKey;
        secondGrandKey = thirdKey + forthKey;
        grandPa.key = firstGrandKey;
        grandPa.right = firstPa;
        grandPa.left = secondPa;

        grandMa.key = secondGrandKey;
        grandPa.right = thirdPa;
        grandPa.left = forthPa;
        
    }

    //the root containing key and the actual searching key words
    public void getRoot(){
        rootKey = firstGrandKey + secondGrandKey;
        root.key = rootKey;
        root.right = grandPa;
        root.left = grandMa;        
    }

}

