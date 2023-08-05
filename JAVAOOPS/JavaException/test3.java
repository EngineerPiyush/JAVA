//In this example we have used 
class test3
{
public static void main(String args[])
{
System.out.println("Started...");
try
{
int n1=Integer.parseInt(args[0]);
System.out.println("We have got first number");
int n2=Integer.parseInt(args[1]);
System.out.println("We have got second number");
int result= n1/n2;
System.out.println("Division is="+result);
}
catch(ArithmeticException e)
{
System.out.println("n2 can not be 0 ");
System.out.println(e.getMessage()); 
}
catch(Exception e)
{
System.out.println("Error ..");
System.out.println(e.getMessage()); 
}
}
}