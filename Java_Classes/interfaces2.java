package Java_Classes;
interface Connection
{
    void connect();
    void query();
    void close();
}
class Oracle implements Connection
{
    public void connect()
    {
        System.out.println("Connecting to Oracle");
    }
    public void query()
    {
        System.out.println("Querying to Oracle");
    }
    public void close()
    {
        System.out.println("Closing Request from Oracle");
    }
}
class SyBase implements Connection
{
    public void connect()
    {
        System.out.println("Connecting to SyBase");
    }
    public void query()
    {
        System.out.println("Querying to SyBase");
    }
    public void close()
    {
        System.out.println("Closing Request from SyBase");
    }
}
class Informix implements Connection
{
    public void connect()
    {
        System.out.println("Connecting to Informix");
    }
    public void query()
    {
        System.out.println("Querying to Informix");
    }
    public void close()
    {
        System.out.println("Closing Request from Informix");
    }
}
class AllowConnectionToDb{
    void allowConnection(Connection ref)
    {
        ref.connect();
        ref.query();
        ref.close();
    }
}
public class interfaces2 {
    public static void main(String[] args) {
        Oracle o=new Oracle();
        SyBase s=new SyBase();
        Informix i=new Informix();
        AllowConnectionToDb a=new AllowConnectionToDb();
        a.allowConnection(o);
        a.allowConnection(s);
        a.allowConnection(i);
    }
}
