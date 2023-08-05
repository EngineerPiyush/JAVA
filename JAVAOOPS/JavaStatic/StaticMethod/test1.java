//static keyword are used for memory management when we make a method static then we can call it by directly class name
//so we need not to create an object thats why memory saved.

//Static method can only access static instance variable it can not access not static data

class test1
{
static void show()
{
System.out.println("..This is static method called by test class name");
}
void display()
{
System.out.println(" ...This is non static method called by class object");
}
public static void main(String args[])
{
test1 obj=new test1();
obj.display();
test1.show();
 // or
show();// directly we can call
// print();  error we can call without class name  same class method only
X.print();// for diifrent class we need to call by that class name 
}
}
class X
{
static void print()
{
System.out.println("..This is static method called by X class name");
}
}


