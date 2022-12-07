import java.util.*;
class test1
{
public static void main(String args[])
{
LinkedList<String> list=new LinkedList<>(); //UnTypeSafe......
list.add("Hi");
list.add("hello");
list.add("hey");
System.out.println(list);
list.set(1,"oye"); 
System.out.println(list);
list.add(1,"huuu");
System.out.println(list);
list.clear();
System.out.println(list);
}
}
 
                                        
