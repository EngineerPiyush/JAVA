//can not create an interface object because it is   abstract
interface I2
{
void show();
}
class test2 implements I2
{
public void show()//if we not use public keyword here then will get error weaker access because show() in interface are public.
{
System.out.println("1");
}
public static void main(String args[])
{
test2 t=new test2();
t.show();
//I2 i=new I2(); 
}
}
