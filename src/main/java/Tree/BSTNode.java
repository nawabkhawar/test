package Tree;

public class BSTNode {
    private int data;
    private BSTNode leftNode;
    private BSTNode rightNode;

    public boolean insert(int n){
        boolean inserted = false;
        if(this ==null){
            this.data = n;
            return true;
        }else if(n<this.data){
        //left side
        if(this.leftNode==null){
            this.leftNode = new BSTNode(n);
            return true;
        }else{
            this.leftNode.insert(n);
        }
        }
        else if(n>this.data){
            //right side
            if(this.rightNode==null){
                this.rightNode = new BSTNode(n);
                return true;
            }else{
                this.rightNode.insert(n);
            }
        }
        return inserted;
    }

    public BSTNode(int n){
        this.data = n;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BSTNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BSTNode leftNode) {
        this.leftNode = leftNode;
    }

    public BSTNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BSTNode rightNode) {
        this.rightNode = rightNode;
    }
}
