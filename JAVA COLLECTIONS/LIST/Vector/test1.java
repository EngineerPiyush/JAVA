import java.util.*;
class test1
{
public static void main(String value[])
{
LinkedList<String> list=new LinkedList<>(); //UnTypeSafe......
list.add("Hi");
list.add("hello");
list.add("hey");
Vector<String> vect=new Vector<String>();
vect.addAll(list);
System.out.println(vect);
vect.clear();
System.out.println(vect);
}
}



