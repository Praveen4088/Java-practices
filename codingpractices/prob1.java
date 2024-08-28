//Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

package codingpractices;

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void getname(){
        System.out.println("Name is:"+name);
    }

    void getage(){
        System.out.println("Age is "+age);
    }
}

public class prob1 {
    public static void main(String[] args) {
        Person praveen=new Person("Praveen",20);
        praveen.getname();
        praveen.getage();

    }
}
