package inheritance;

public class boxweight extends box {
    double side;
    double weight;

    boxweight(double l,double h,double w,double weight){
        super(l,h,w);
        this.weight=weight;
    }
    
    boxweight(double side,double weight){
        super(side);
        this.weight=weight;
    }

     double calc(double l,double h,double w,double weight){
        double a=l*h*w*weight;
        return a;
    }
}

class weightmain{
    public static void main(String[] args) {
        double c;
        boxweight b1=new boxweight(2,3,4,10);
        System.out.println(b1.h+" "+b1.l+" "+b1.w+" "+b1.weight);
        c=b1.calc(5,6,7,8);
        System.out.println(c);
        
        boxweight b2=new boxweight(5,10);
        System.out.println(b2.side +" "+b2.weight);
        
    }
}
