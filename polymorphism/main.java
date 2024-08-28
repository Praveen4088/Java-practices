package polymorphism;

public class main {
    public static void main(String[] args) {
        shape s=new shape();
        circle c= new circle();
        triangle t= new triangle();
        square sq= new square();

        s.area();
        c.area();
        t.area();
        sq.area();
    }
}
