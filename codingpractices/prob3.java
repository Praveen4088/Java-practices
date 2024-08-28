//Write a Java program to create a class called "Rectangle" with width and height attributes.
// Calculate the area and perimeter of the rectangle
package codingpractices;

class Rectangle{
    double width,height;

    Rectangle(double w,double h){
        this.width=w;
        this.height=h;
    }

    double area(){
        return (int)width*height;
    }

    double perimeter(){
        return (int)2*(width+height);
    }
}

public class prob3 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(5,4);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
