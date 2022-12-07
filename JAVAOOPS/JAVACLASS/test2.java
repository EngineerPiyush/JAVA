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
public static void  main(String args[])
{
test2 obj1=new test2();
obj1.store(100,"Piyush");
obj1.display();
}
}
