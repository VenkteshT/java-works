package Genric;

public class Pair  {

    public static void main(String[] args) {
        createDoublePair<String,Integer > p1=new createDoublePair<String,Integer >("Venky",7);
        createDoublePair<String,Integer> p2=new createDoublePair<String,Integer>("jackqlene",9);
        createDoublePair<createDoublePair<String,Integer>,createDoublePair<String,Integer>> cd=new createDoublePair<>(p1,p2);
       System.out.println(cd.getKey().getKey());
       System.out.println(cd.getVal().getKey());
    }
}
