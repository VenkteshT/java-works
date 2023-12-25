package sorting;
public class bubble {
    public static void bubbleSort(int[] arr,int n)
    {
        for(int i=1;i<=n;i++)
        {
            int j=0;
            while(j<n-i)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,5,3,4,1,0,9,8};
        int n=arr.length;
        bubbleSort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }    
    }
    
}
