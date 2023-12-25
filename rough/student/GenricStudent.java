package rough.student;

public class GenricStudent extends Student{
    public GenricStudent(int rollNum)
    {
        super(rollNum);
    }
    public static <T extends Student> void printArr(T[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i].print();
        }
    }
    public static void main(String[] args) {
        Student s[]=new Student[5];
        for(int i=1;i<=5;i++)
        {
            s[i-1]=new Student(i*10);
        }   
        printArr(s);
    }
}
