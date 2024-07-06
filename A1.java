package p1;
class A1
{
    void show()
    {
        System.out.println("Package");
    }
}
class A2 extends A1
{
    public static void main(String[] args) 
    {
        A1 r=new A1();
        r.show();    
    }
}