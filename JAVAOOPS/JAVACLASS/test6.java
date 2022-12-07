//modifiers with data and methods

public class test6
{
private int marks=46;
String name="Piyush";
protected void display()
{
System.out.println("marks = "+marks+ "   "+"name = "+name);
}
public static void main(String args[])
{
test6 obj=new test6();
obj.display();
}
}