package Exercise31;

//Overriding static method. Ok, we can't override static methods because overriding is based on dynamic binding at run time and
//static methods are bonded using static binding at compile time. So we can't override methods.
//If we call a static method using the parent class object, the original static method will be called from the parent class
//If we call sa static method by using the child class object, the static method of the child class will be called
//In the following example, the Parent class has a static method named display() and the ChildClass also has the same method signature.
//The method in the derived class(ChildClass) hides the method in the base class
public class Example1 {  //This is the parent class

    public static void display(){

        System.out.println("Display() method of the parent class");
    }
}
