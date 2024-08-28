package polymorphism;

public class methodoverloading {

    void area(double side){
        System.out.println(4*side);
    }

    void area(double h,double b){
        System.out.println(b*h);
    }

    void area(double l,double h,double w){
        System.out.println(l*h*w);
    }
}

class shapemain{
    public static void main(String[] args) {
        methodoverloading m=new methodoverloading();
        m.area(5);
        m.area(5,7);
        m.area(2,3,4);
    }
}
