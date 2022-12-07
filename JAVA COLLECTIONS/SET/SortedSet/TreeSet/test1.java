import java.util.*;
class test1
{
public static void main(String value[])
{
//we can not give primitive types we can give only objects(Wrapper Classes) here...

HashSet<Double> name= new HashSet<Double>();
name.add(14.14);//we are giving primitivite value because of Autoboxing in Java 
name.add(34.56235);
name.add(0.737);
name.add(0.778);
name.add(34.56235);//duplicates will  not repeat in hashset.
// TreeSet return  sortted element........ 
TreeSet<Double> list=new TreeSet<Double>();
list.add(9.09);
list.addAll(name);
System.out.println(list);
}
}
