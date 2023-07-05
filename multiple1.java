/* multiple inheritance */
interface A 
{
    void show(); //public + abstract
}
interface B 
{
    void show(); //public + abstract
}
class multiple implements A,B /* multiple inheritance support java through interface */
{
    public void show()
    {
        System.out.println("Interface A & B");
    }
    public static void main(String[] args) {
        multiple m=new multiple();
        m.show();
    }
}
