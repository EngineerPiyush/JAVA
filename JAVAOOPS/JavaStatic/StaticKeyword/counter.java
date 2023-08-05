// here i will illustrate through program that how static variables works..
//i have taken a count variable and i will increaase count value if i will make count as static then each time a new object will 
//create and it will increase according to initial value not previous value..
class counter
{
static int count=0;//static variable is for class not object
int countt=0;
counter()
{
++count;
System.out.println(count);
++countt;
System.out.println(countt+"---");
}
public static void main(String args[])
{
counter c1=new counter();
counter c2=new counter();
counter c3=new counter();
}
}
