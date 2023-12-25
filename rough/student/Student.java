package rough.student;

public class Student implements StudentInterface {
    
    private int rollNum;
    public Student(int rollNum)
    {
        this.rollNum=rollNum;
    }
    public void print()
    {
        System.out.println(this.rollNum);
    }
}
