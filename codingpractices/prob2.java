//Write a Java program to create a class called "Dog" with a name and breed attribute.
// Create two instances of the "Dog" class, set their attributes using the constructor and
// modify the attributes using the setter methods and print the updated values.

package codingpractices;

class Dog{
    String name;
    String breed;

    Dog(String n,String b){
        this.name=n;
        this.breed=b;
    }

    String getName(){
        return name;
    }

    String getBreed(){
        return breed;
    }

    void setName(String name){
        this.name=name;
    }

    void setBreed(String breed){
        this.breed=breed;
    }
}
public class prob2 {
    public static void main(String[] args) {
        Dog d1=new Dog("Julie","German shepherd");
        Dog d2=new Dog("Rocky","labrador");

        System.out.println("Name of the dog is "+d1.getName()+" and it's breed is "+d1.getBreed());
        System.out.println("Name of the dog is "+d2.getName()+" and it's breed is "+d2.getBreed());

        d1.setName("Pradeep");
        d1.setBreed("abc");

        d2.setName("chupramani");
        d2.setBreed("golden retreiver");

        System.out.println("After updation ");

        System.out.println("Name of the dog is "+d1.getName()+" and it's breed is "+d1.getBreed());
        System.out.println("Name of the dog is "+d2.getName()+" and it's breed is "+d2.getBreed());
    }
}
