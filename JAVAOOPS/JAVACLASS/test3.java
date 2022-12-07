//error program 
//An object can aquire the property of only our class by which class they have created...
class test2
{
int marks;
String name;
void store(int number,String naam)
{
marks= number;
name= naam;
}
void display()
{
System.out.println("marks= "+ marks+" "+"name = "+name);
}
}
public class test3
{
void run()
{
System.out.println("test3 class method is running");
}
public static void  main(String args[])
{
test2 obj1=new test2();
test3 obj2=new test3();
obj1.store(100,"Piyush");
//obj2.display();// not able to access
obj2.run();
//obj1.run();// can not aqure the other class property
}
}
