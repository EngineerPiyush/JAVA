//Acesss modifier in class

//protected class test4 //class cannot be private or protected
class test4 //default is allowed
{
int marks;
String name;
void store(int number, String naam)
{
marks=number;
name=naam;
}
void display()
{
System.out.println("marks= "+ marks+" "+"name = "+name);
}
public static void main(String args[])
{
test4 obj1=new test4();
obj1.store(101,"Piyush");
obj1.display();
}
}