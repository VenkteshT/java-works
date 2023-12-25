package sorting;
public class insertionsort {
    public static void insertionSort(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min=arr[i];
            int index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<min) {
                    index=j;
                    min=arr[j];
                }
            }
            int t=arr[i];
            arr[i]=min;
            arr[index]=t;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,0,9,3,8,7,1,0};
        int n=arr.length;
        insertionSort(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
