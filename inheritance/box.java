package inheritance;

public class box {
    double h,w,l,side;

    box(){
        this.h=0;
        this.l=0;
        w=0;
    }

    box(double side){
        this.h=side;
        this.w=side;
        this.l=side;
    }

    box(double h,double w,double l)
    {
        this.h=h;
        this.l=l;
        this.w=w;
    }


    static void square(double side){
        System.out.println(4*side);
    }

    static void rectangle(double l,double w){
        System.out.println(l*w);
    }
}



class main{
    public static void main(String[] args) {
        box b1=new box();
        box b2=new box(3);
        box b3=new box(2,3,4);
        System.out.println(b1.h+" "+b1.l+" "+b1.w);
        System.out.println(b2.h+" "+b2.l+" "+b2.w);
        System.out.println(b3.h+" "+b3.l+" "+b3.w);

        b2.square(5);
        b2.rectangle(5,3);
    }
}