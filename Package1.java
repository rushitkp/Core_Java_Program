package p1;
class Pack
{
    protected void show()
    {
        System.out.println("Package");
    }
}
class Package1
{
    public static void main(String[] args) 
    {
        Pack r=new Pack();
        r.show();    
    }
}