package Genric;

public class createPair<T>
{
    private T first;
    private T second;

    createPair(T first,T second)
    {
        this.first=first;
        this.second=second;
    }
    public T getFirst(){
        return this.first;
    }
    public T getSecond()
    {
        return this.second;
    }
}
