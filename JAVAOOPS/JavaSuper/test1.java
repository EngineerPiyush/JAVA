//super keyword in java 
//as their name suggest super means superiar or base class .It means super keyword refers to parent 
//class while this keyword refers current class . 
class A
{
 int i=10;
}
class test1 extends A
{
int i=20;
void fun(int i)
{
System.out.println(i);//30
System.out.println(this.i);//20
System.out.println(super.i);//10
}
public static void main(String args[])
{
test1 t=new test1();
t.fun(30);
}
}
