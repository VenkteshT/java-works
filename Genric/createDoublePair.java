package Genric;

public class createDoublePair<S,T> {
    private S key;
    private T val;
    public createDoublePair(S key,T val)
    {
        this.key=key;
        this.val=val;
    }
    public void setFirst(S key)
    {
        this.key=key;
    }
    public void setVal(T val)
    {
        this.val=val;
    }
    public S getKey()
    {
        return key;
    }
    public T getVal()
    {
        return val;
    }
}
