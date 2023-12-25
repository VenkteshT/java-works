package dsa.arrList;
public class mergerarrays {
    public static int[] merge(int[] arr,int[] brr)
    {
        int len=arr.length+brr.length;
        int n=arr.length,m=brr.length;
        int res[]=new int[len];
        int i=0,j=0,k=0;
        while(i<m&&j<n)
        {
            if(arr[i]<=brr[j])
            {
                res[k]=arr[i];
                i++;
            }else{
                res[k]=brr[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {
            res[k]=arr[i];
            i++;
        }
        while(j<n)
        {
            res[k]=brr[j];
            j++;
        }
        return res;
    }
    
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        int brr[]={3,3,4,6,8};
        int[] res=merge(arr, brr);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }
}

//,3,5,7,9