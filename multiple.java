/* multiple inheritance */
class A 
{
    void show()
    {
        System.out.println("This is class A");
    }
}
class B 
{
    void show()
    {
        System.out.println("This is class B");
    }
}
class multiple extends A,B /* error will come because multiple inheritance does not support in java */
{
    public static void main(String[] args) {
        multiple m=new multiple();
        m.show();
    }
}
