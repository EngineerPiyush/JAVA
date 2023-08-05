// How to create your own custom Exception ??
class AgeInvalidException extends Exception
{
AgeInvalidException()
{
super("Age is invalid");
}
AgeInvalidException(String message)
{
super(message);
}
}
class test5
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
if(n2<10)
{
throw new AgeInvalidException("My age Invalid");
}
}
catch(AgeInvalidException e)
{
System.out.println("Invalid N2");
System.out.println(e.getMessage());
}
catch(Exception e)
{
System.out.println("Error.. ");
System.out.println(e.getMessage()); 
}
System.out.println("Terminated..");
}
}