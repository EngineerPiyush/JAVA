//This is simple program to handle the exception that you see in test1.java file.
class test2
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
catch(NumberFormatException e)
{
System.out.println("Invalis input");
System.out.println(e.getMessage()); 
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("you should input both numbers");
System.out.println(e.getMessage());
}
//Instead of thease many catch blocks we can use parent of thease classes so that we can obtimized code  will se in next chapter.. 
System.out.println("Terminated...");
}
}