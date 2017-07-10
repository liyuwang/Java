package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wly on 17-2-27.
 */
public class BinaryTree {
    public int array[] = {6,2,8,0,1,9,4,3,7,5};
    public static List<Node> nodeList = new ArrayList<Node>();

    public class Node {
        Node leftChild;
        Node rightChild;
        int data;

        Node(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        for (int i = 0; i < array.length; i++){
            nodeList.add(new Node(array[i]));
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        System.out.println(tree.nodeList.get(0).data);

    }
}
