package dsa.Trie;

public class Trie {

    static class Node {
        Node[] child;
        boolean eow;

        public Node() {
            child = new Node[26];
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public void insert(String word) {

        Node node = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (node.child[idx] == null) {
                node.child[idx] = new Node();
            }
            if (i == word.length() - 1) {
                node.child[idx].eow = true;
                return;
            }
            node = node.child[idx];
        }
    }

    public boolean has(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (node.child[idx] == null)
                return false;
            if (i == word.length() - 1 && !node.child[idx].eow) {
                return false;
            }
            node = node.child[idx];
        }
        return true;
    }

    public boolean wordBreak(String key) {
        if (key.length() == 0)
            return true;
        for (int i = 1; i <= key.length(); i++) {
            String first = key.substring(0, i);
            String second = key.substring(i);
            if (has(first) && wordBreak(second))
                return true;
        }
        return false;
    }

    public boolean startsWith(String key) {
        Node node = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (node.child[idx] == null)
                return false;
            node = node.child[idx];
        }
        return true;
    }

    public static int countUnique(Node root) {
        if (root == null)
            return 0;
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.child[i] != null) {
                count += countUnique(root.child[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        String key = "apple";
        Trie t = new Trie();
        for (int i = 0; i < key.length(); i++) {
            t.insert(key.substring(i));
        }
        System.out.println(countUnique(root));
    }
}
