package inheritance; //Multilevel  ie boxprice extends the class nox weight which extends box

public class boxprice extends boxweight{

    double price;

    boxprice(double l,double h,double w,double weight,double price){
        super(l,h,w,weight);
        this.price=price;
    }

    boxprice(double side,double weight,double price){
        super(side,weight);
        this.price=price;
    }

    void value(double l,double h,double w,double weight,double price){
        System.out.println(l*w*h*weight*price);
    }
}


class pricemain{
    public static void main(String[] args) {
        boxprice b1=new boxprice(2,3,4,5,6);
        b1.value(1,2,3,4,5);

        System.out.println(b1.h+" "+b1.l+" "+b1.w+" "+b1.weight+" "+b1.price);

        boxprice b2=new boxprice(5.0,10,5000);
        System.out.println(b2.side +" "+b2.weight+" "+b2.price);




    }
}