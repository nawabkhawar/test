package Tree;

public class BST {

    private static BSTNode root;

    public static void main(String args[]){
        BSTNode node1 = new BSTNode(10);
        BSTNode node2 = new BSTNode(7);
        BSTNode node3 = new BSTNode(13);
        BSTNode node4 = new BSTNode(5);
        //BSTNode node5 = new BSTNode(9);
        //BSTNode node6 = new BSTNode(10);


        node1.setLeftNode(node2);
        node1.setRightNode(node3);
        node2.setLeftNode(node4);
        //node2.setRightNode(node5);
        root = node1;
        printInOrder(root);


        insert(9);
        insert(8);
        System.out.println();
        printInOrder(root);

    }

    public static boolean insert(int n){
        if(root==null){
            root = new BSTNode(n);
            return true;
        }else{
            root.insert(n);
        }
        return false;
    }

    private static void printInOrder(BSTNode n) {
        if(n==null) return;

        printInOrder(n.getLeftNode());
        System.out.print(n.getData() + " ");
        printInOrder(n.getRightNode());

    }

}
