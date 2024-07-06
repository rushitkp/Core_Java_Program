package p1;
class Pack
{
    private void show()
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