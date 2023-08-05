//Static keyword is used for memory management.
//Static variable creates a copy and that copy shared with all objects

class test2
{
int  empid;
String name;
static String company="mythhai";//it will allocate one time memory only in class or method area even for more than 1000... objects  

void display()
{
System.out.println(empid+" "+name+" "+company);
}

test2(int empid,String name)
{
this.empid=empid;
this.name=name;
//this.company=company;
}
public static void main(String args[])
{
test2 e1=new test2(1,"yuko");//objects are storing within heap area..
//test2 e1=new test2(1,"yuko","mythhai");
e1.display();
test2 e2=new test2(2,"lugo");
//test2 e1=new test2(1,"yuko");
e2.display();
}
}

