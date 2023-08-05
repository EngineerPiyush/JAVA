/*  
1: A method without body (no implementation) nis known as abstract method.
2: A method must always be decleared in an abstract class but not vice-versa.
3: If a regular class extends an abstract class then the class must have to implement all the abstract methods of abstract 
   parent class.
4: we can not create object of an abstract class but we can create reference.
*/
 abstract class vehicle
{
 abstract void start();
} 
class car extends vehicle
{
void start()
{
System.out.println("Car starts with key");
}
}
class scooter extends vehicle
{
void start()
{
System.out.println("Scooter starts with kick");
}
public static void main(String args[])
{
//vehicle v= new vehicle(); above  point 4 
car c=new car();
c.start();
scooter s=new scooter();
s.start();
}
}