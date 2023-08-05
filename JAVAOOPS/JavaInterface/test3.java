interface I1
{
void show();
}
interface I2
{
void display();
}
class test3 implements I1,I2
{
public static void main(String args[])
{
test3 t=new test3();
t.show();
t.display();
}
public void display()
{
System.out.println("Display method");
}
public void show()
{
System.out.println("Show method");
}
}