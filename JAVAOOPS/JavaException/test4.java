//Finally block will always be execute..
class test4
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
catch(Exception e)
{
System.out.println("Error ..");
System.out.println(e.getMessage()); 
}
finally
{
System.out.println("i am finally block");
System.out.println("Closing all the resources");
}
}
}