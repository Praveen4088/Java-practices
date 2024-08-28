package inheritance;          //hierachial inheritance since boxweight is inherited by boxprice and boxcolor

public class boxcolor extends boxweight{

    String color;

    boxcolor(double l,double w,double h,double weight,String color){
        super(l,h,w,weight);
        this.color=color;

    }

    boxcolor(double side,double weight,String color){
        super(side,weight);
        this.color=color;
    }
}


class colormain{
    public static void main(String[] args) {
        boxcolor b1=new boxcolor(2,5,"yellow");
        boxcolor b2=new boxcolor(1,2,3,4,"blue");

        System.out.println(b1.side+" "+b1.weight+" "+b1.color);
        System.out.println(b2.h+" "+b2.w+" "+b2.l+" "+b2.color);
    }
}
