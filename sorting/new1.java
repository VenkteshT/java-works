package sorting;
// Java program for the union of two arrays using Set
import java.util.*;

public class new1 {
	static void getUnion(int a[], int n, int b[], int m)
	{

		// Defining set container s
		HashSet<Integer> s = new HashSet<>();

		// Inserting array elements in s
		for (int i = 0; i < n; i++)
			s.add(a[i]);

		for (int i = 0; i < m; i++)
			s.add(b[i]);
		System.out.print(
			"Number of elements after union operation: "
			+ s.size() + "\n");
		System.out.print("The union set of both arrays is :"
						+ "\n");

		System.out.print(
			s.toString()
			+ " "); // s will contain only distinct
					// elements from array a and b
	}

	// Driver Code
	public static void main(String[] args)
	{
		int a[] = {1,1,2,2,3,3};
		int b[] = { 1,1,1,2,2,2,3,3,3 };

		getUnion(a, 6, b, 9);
	}
}

// This code is contributed by gauravrajput1
