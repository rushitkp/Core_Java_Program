class A
{
    int a,b,c;
    void add()
    {
        a=343;b=323;c=a+b;
        System.out.println("Add="+c);
    }
}
class B extends A
{
    void sub()
    {
        a=32;b=34;c=a-b;
        System.out.println("Sub="+c);
    }
}
class C extends A
{
    void Mul()
    {
        a=10;b=20;c=a*b;c=a/b;
        System.out.println("Mul="+c);
        System.out.println("Div="+c);
    }
}
class Hierarchical1
{
    public static void main(String[] args) 
    {
        C r=new C();
        r.add();    
        r.Mul();

        B r1=new B();
        r1.sub();
    }
}