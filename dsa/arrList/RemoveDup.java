package dsa.arrList;
import java.util.*;
public class RemoveDup{
    public static ArrayList<Integer> remove(int[] arr)
    {
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                res.add(arr[i]);
            }
        }
        if(arr[n-1]!=res.get(res.size()-1)) res.add(arr[n-1]);
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,2,2,3,4,5,5,6,6};

        ArrayList<Integer> res;
        res=remove(arr);
        for(int i:res){
            System.out.println(i);
        }
    }
}
