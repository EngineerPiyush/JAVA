/*
1: Interface is used to achieve abstraction by interface with can achieve 100% abstraction.
2: It supports multiple inheritance.
3: It can be use to achieve loose coupling.
4: In interface all methods should be declered with abstract and public  keyword or methods should be public abstract,
   abstract keyword is necessary and if we not use public keyword and abstract compiler automatically make it as public and abstract.
5: We can not create an object of interface like abstract class.
 In java 8 th version we can also create concrete method with access modifier default means default keyword will be necessary ,
 also we can create static method (method with static keyword) but should be public not default or other.
In java 9 th version we can make private methods also in interfaces.
*/
interface I1
{
void show();
}

