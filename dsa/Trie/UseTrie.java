package dsa.Trie;

public class UseTrie {
    public static void main(String[] args) {
        Trie t = new Trie();
        String arr[] = { "venky", "is", "a", "handsome", "guy" };
        for (String str : arr)
            t.insert(str);

        Trie t2 = new Trie();
        String ans = "ababa";
        for (int i = 0; i < ans.length(); i++) {
            t2.insert(ans.substring(i));
        }
        System.out.println(t2.countUnique(t2.root));
    }
}
