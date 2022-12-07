class test1
{
int marks;
String name;
void display()
{
System.out.println("marks = "+marks+" "+" name = "+name);
//compiler creates a constructor and initilizes the object with default value
/*
test1()
{
this.marks=0;
this.name=null;
}
*/
}

public static void main(String args[])
{
new test1().display();
}
}
