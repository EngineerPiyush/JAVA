// SPECIAL CASES
// 1:- can i create more than one constructor?
class test4
{
int marks;
String name;
////////////////////////////////////////////////////////////////
test4()
{
System.out.println("no argument constructor");
}
////////////////////////////////////////////////////////////////
test4(int number,String naam)
{
this.marks=number;
this.name=naam;
System.out.println("____________________________");
}
////////////////////////////////////////////////////////////////
test4(String naam,int number)
{
this.marks=number;
this.name=naam;
System.out.println("____________________________");
}
////////////////////////////////////////////////////////////////
void display()
{
System.out.println("marks= "+marks+" "+"name= "+name);
}
public static void main(String args[])
{
new test4();
test4 obj1=new test4("awasthi",42526); 
test4 obj2=new test4(1672,"mishra");
obj1.display();
obj2.display();
}
}