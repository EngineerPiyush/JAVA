class A
{
void a()
{
System.out.println("i am parent class");
}
}
class test2 extends A
{
void b()
{
System.out.println("i am child class");
//super keyword refer imediate parent class.
//so i can invoke parent class method also using super keyword. 
super.a();
}
public static void main(String args[])
{
test2 t=new test2();
t.b();
}
}