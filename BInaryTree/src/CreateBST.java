class BSTNode{
    int val;
    BSTNode left, right;
}

class BST {
    public BSTNode createNewNode(int val){
        BSTNode n = new BSTNode();
        n.val = val;
        n.left = null;
        n.right = null;
        return n;
    }

    public BSTNode insertNode(BSTNode node, int val){
        if(node == null){
            return createNewNode(val);
        } else {
            if(node.val > val){
                node.left = insertNode(node.left, val);
            }else {
                node.right = insertNode(node.right, val);
            }
        }
        return node;
    }
}


public class CreateBST {
    public static void main(String[] args){
        BST obj = new BST();
        BSTNode root = null;

        root = obj.insertNode(root, 8);
        root = obj.insertNode(root, 3);
        root = obj.insertNode(root, 10);
        root = obj.insertNode(root, 1);
        root = obj.insertNode(root, 6);
        root = obj.insertNode(root, 14);
        root = obj.insertNode(root, 4);
        root = obj.insertNode(root, 7);
        root = obj.insertNode(root, 13);

    }
}
