class A
{
    void showA()
    {
        System.out.println("super class A" );
    }
}
class B extends A
{
    void showB()
    {
        System.out.println("sub class B");
    }
}
class SingleInh1
{
    public static void main(String[] args) {
        B b1=new B(System.in);
        b1.showA();
        b1.showB();
    }
}
