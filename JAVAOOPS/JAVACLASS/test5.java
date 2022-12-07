//Access modifiers on data and methods

class test5 
{
private int marks;
String name;
void update(int number, String naam)
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
test4 obj1=new test4();//it will run because within a same package
//test5 obj1=new test5();
// obj1.update(101,"Dubey");  //variable obj1 cant not be created even then also when it is the method
// of diffrent class that is test 5 because it is within a method that is main and we know that
// we can only create a same variable in same method..
test5 obj2=new test5();
obj2.update(101,"Piyush");
obj2.display();
}
}
