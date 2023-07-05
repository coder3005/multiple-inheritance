/* multiple inheritance */
interface A 
{
    void show(); //public + abstract
}
interface B 
{
    void disp(); //public + abstract
}
class multiple implements A,B /* multiple inheritance support java through interface */
{
    public void show()
    {
        System.out.println("Interface A");
    }
    public void disp()
    {
        System.out.println("Interface B");
    }
    public static void main(String[] args) {
        multiple m=new multiple();
        m.show(); m.disp();
    }
}
