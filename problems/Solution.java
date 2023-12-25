package problems;
import java.util.*;
public class Solution {	
	public static int tripletSum(int[] arr, int num)
	 {
		//Your code goes here
		Arrays.sort(arr);
		int n=arr.length;
		int numTriplets=0;
		for(int i=0;i<n;i++){
			int pariSumFor=num-arr[i];
			int numParis=parisSum(arr,(i+1),(n-1),pariSumFor);

			numTriplets+=numParis;
		}
		return numTriplets;
	 }


	 	private static int parisSum(int[] arr,int startIndex,int endIndex,int num)
	{
		int numPair=0;

		while(startIndex<endIndex){

			if(arr[startIndex]+arr[endIndex]<num) startIndex++;
			else if(arr[startIndex]+arr[endIndex]>num) endIndex--;
			else{

				int elementAtStart=arr[startIndex];
				int elementAtEnd=arr[endIndex];

				if(elementAtStart==elementAtEnd)
				{
					int totalElmentsFromStartToEnd=(endIndex-startIndex)+1;
					numPair+=(totalElmentsFromStartToEnd*(totalElmentsFromStartToEnd-1)/2);
					return numPair;
				}
				int tempstart=startIndex+1;
				int tempend=endIndex-1;
				while(tempstart<=tempend&&arr[tempstart]==elementAtStart){
					tempstart++;
				}
				while(tempend>=tempstart&&arr[tempend]==elementAtEnd){
					tempend--;
				}
				int totalElFromStart=(tempstart-startIndex);
				int totalElFromEnd=(endIndex-tempend);
				numPair+=(totalElFromStart*totalElFromEnd);
				startIndex=tempstart;
				endIndex=tempend;
			}
		}
		return numPair;
	}
}