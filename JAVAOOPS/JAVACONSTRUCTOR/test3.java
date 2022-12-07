class test3
{
int marks;
String name;
test3(int number,String naam)
{
this.marks=number;
this.name=naam;
System.out.println("user defined paramiterrised constructor called automatically after obj1 creation");
System.out.println("____________________________");
}
void display()
{
System.out.println("marks= "+marks+" "+"name= "+name);
System.out.println("its called by obj1 because it is not constructor can not call automatically");
}
public static void main(String args[])
{
test3 obj1=new test3(1672,"shukla");
obj1.display();
}
}