class A
{
A()
{
System.out.println("i am parent class");
}
}
class test3 extends A
{
test3()
{
super();//optional
//compiler creates a default super constructur if i do not create thats why i have
//written optional .
System.out.println("i am child class");
//super keyword refer imediate parent class constructor syntax is super();.
 
}
public static void main(String args[])
{
test3 t=new test3();
}
}