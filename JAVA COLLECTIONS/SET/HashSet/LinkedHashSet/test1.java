import java.util.*;  
class Test1{  
 public static void main(String args[]){  
 //Creating LinkedHashSet and adding elements  
        LinkedHashSet<String> set=new LinkedHashSet();  
               set.add("Rohit");    
               set.add("Bipul");    
               set.add("Harsh");   
               set.add("Veer");  
               set.add("Ram");  
               System.out.println(set);
               set.remove("Veer");
               System.out.println(set);
 }  
}  
