package dsa.HashMap;

public class UseMap {
    public static void main(String[] args) {
        Map<Integer, Character> map = new Map<>();
        String name = "venkteshVenktesh";
        for (int i = 0; i < name.length(); i++) {
            map.insert(i, name.charAt(i));
        }
        System.out.println(map.has(10));
    }
}
