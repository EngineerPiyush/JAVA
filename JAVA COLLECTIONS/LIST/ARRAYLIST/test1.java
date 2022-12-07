import java.util.*;
public class test1
{
public static void main(String []args)
{
/* to create a collection we have to methods for creating 1:-TypeSafe collection 2:-Untypesafe
collection........
in typesafe we can only create same type of objects..
in untypeSafe we can store diffrent types too..    */
//TypeSafe...

ArrayList<String> name = new ArrayList<String>();
name.add("Piyush--");
name.add("Prachi");
name.add("Sanskriti");
name.add("kavita");//removes first matches
name.add("Pateshwari");
name.add("Sanskriti");
name.add("kavita");
name.remove(5);
name.add("Piyush--");
name.remove("kavita");
System.out.println(name);
//System.out.println(name.get(2));
//System.out.println(name.get(4));
System.out.println("SIZE ="+name.size());
System.out.println(name.contains("Shreya Thakur"));
System.out.println(name.isEmpty());
System.out.println(name.equals("Piyush-"));
//UntypeSafe....
/*
ArrayList list=new ArrayList();
list.add("Sachin");
list.add(3468.6834);
list.add(6346);
list.add(true);
System.out.println(list);
*/
}
}
