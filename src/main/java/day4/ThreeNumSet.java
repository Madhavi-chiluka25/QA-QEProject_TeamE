package day4;

public class ThreeNumSet {
    int a;
    int b;
    int c;
int g;
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    public int greaterMethod()
    {
        if ((a>b) && (a>c))
        {
            g=a;
        }
        if ((b>a) && (b>c))
        {
            g=b;
        }
        if ((c>a) && (c>b))
        {
            g=c;
        }
        return g;

    }
}
