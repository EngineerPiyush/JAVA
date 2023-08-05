class Test5
{
public static void main(String args[])
{
//Concatation of String
String s1="Piyush";
String s2="Java";
System.out.println(s1+s2);
System.out.println(s1+10);
System.out.println(10+s2);
System.out.println(10+s1+20);
System.out.println(s2+10+20+30);
System.out.println(10+20-5+s2);
System.out.println(s1+20/10);//gives priority acording to BODMOS
//System.out.println(s1+10-5);//error
System.out.println(s1.concat(s2));
//Concating by join method .In join method we are actually passing two arguments CharSequence delimeter 
//and CharSequence var args.It is a static method.
System.out.println(10+s2);
System.out.println(String.join(",",s1,s2));
System.out.println(String.join(";",s1,s2));
System.out.println(String.join(";",null,s2));//But we can not provide null at the palce of  delimeter.
}
}

