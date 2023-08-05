interface I1
{
public static final int x=5;
int a=10;// by default it is public static final
public  abstract void show();

default void display()
{

}
static void display2()
{

}
}

interface I2
{
private void show1()
{
System.out.println("i am private in interface");
}
}

class test1 implements I2
{
public static void main(String args[])
{
test1 t=new test1();
t.show1();
}
}
//Note: Since java 8 we can have default and static method in interface 
//Since java 9 we can have private method in interface means we can create thease in interface itselt.