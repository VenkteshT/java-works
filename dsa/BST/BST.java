package dsa.BST;

public class BST {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public BST() {
        this.root = null;
    }

    /////////////////////// INSERT INTO TREE ///////////////////////////

    public void insert(int data) {
        this.root = inserNode(root, data);
    }

    public static Node inserNode(Node node, int data) {
        if (node == null) {
            Node n = new Node(data);
            return n;
        }
        if (data >= node.data)
            node.right = inserNode(node.right, data);
        else
            node.left = inserNode(node.left, data);
        return node;
    }

    /////////////////////// PRINT TREE ///////////////////////////

    public void print() {
        helpPrint(this.root);
    }

    private static void helpPrint(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + ":");
        if (root.left != null)
            System.out.print("L:" + root.left.data + ",");
        else
            System.out.print("L:-1");
        if (root.right != null)
            System.out.print("R:" + root.right.data + ",");
        else
            System.out.print("R:-1");
        System.out.println();

        helpPrint(root.left);
        helpPrint(root.right);
    }

    /////////////////////// GET MIN_VALUE ///////////////////////////

    public int min() {
        return helperMin(root);
    }

    private static int helperMin(Node node) {
        if (node == null)
            return Integer.MAX_VALUE;
        int l = helperMin(node.left);
        int r = helperMin(node.right);
        return Math.min(node.data, Math.min(l, r));
    }

    /////////////////////// DELETE ///////////////////////////
    public void delete(int data) {
        findAndReplace(null, root, data, false, false);
    }

    private static void findAndReplace(Node parent, Node root, int data, boolean left, boolean right) {
        if (root == null)
            return;
        if (root.data == data) {
            // System.out.println("found"+root.data);
            if (root.right == null && root.left == null) {
                // System.out.println("true at if");
                if (left)
                    parent.left = null;
                else
                    parent.right = null;
                return;
            } else if (root.right != null && root.left == null) {
                // System.out.println("true at elseif 1");
                parent = parent.right;
            } else if (root.left != null && root.right == null) {
                // System.out.println("true at elseif 2");
                parent = parent.right;
            } else {
                // System.out.println("true at else");
                int min = helperMin(root.right);
                root.data = min;
                findAndReplace(root, root.right, min, false, true);
            }
        }
        if (data >= root.data)
            findAndReplace(root, root.right, data, false, true);
        else
            findAndReplace(root, root.left, data, true, false);
    }
}
