package p1;
class Pack
{
    void show()
    {
        System.out.println("Package");
    }
}
class Package
{
    public static void main(String[] args) 
    {
        Pack r=new Pack();
        r.show();    
    }
}