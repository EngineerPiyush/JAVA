class test2
{
int marks;
String name;
test2()
{
System.out.println("no  argument constructor created by user");
}
void display()
{
System.out.println("marks= "+marks+" "+"name= "+name);
}
public static void main(String args[])
{
test2 obj1=new test2();
}
}