package p1;
class AA
{
    void show()
    {
        System.out.println("Package");
    }
}
class B extends AA
{
    public static void main(String[] args) 
    {
        A r=new A();
        r.show();    
    }
}