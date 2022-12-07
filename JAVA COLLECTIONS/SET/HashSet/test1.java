import java.util.*;
class test1
{
public static void main(String value[])
{
//we can not give primitive types we can give only objects(Wrapper Classes) here...


/*LinkedList<String> list=new LinkedList<>(); //UnTypeSafe......
list.add("Hi");
list.add("hello");
list.add("hey");
Vector<String> vect=new Vector<String>();
vect.addAll(list);*/

HashSet<Double> name= new HashSet<Double>();
name.add(14.14);//we are giving primitivite value because of Autoboxing in Java 
name.add(34.56235);
name.add(34.56235);//duplicates will  not repeat in hashset.
System.out.println(name);
}
}
