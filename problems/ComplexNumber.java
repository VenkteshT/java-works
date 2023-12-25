package problems;

public class ComplexNumber {
	// Complete this class
	 int x;
	 int y;

	public ComplexNumber(int a,int b)
	{	
		this.x=a;
		this.y=b;
	}
	public void add(ComplexNumber c)
	{
		x=x+c.x;
		y=y+c.y;
	}
	public void multiply(ComplexNumber c)
	{
        int t=x;
		x=(x*c.x)-(y*c.y);
		y=(t*c.y)+(y*c.x);
	}
	public void print()
	{
		System.out.println(x+" + i"+y);
	}
    public static void main(String[] arg)
    {
        ComplexNumber c1=new ComplexNumber(4, 5);
        ComplexNumber c2=new ComplexNumber(6, 7);

        c1.multiply(c2);
        c1.print();
    }
}