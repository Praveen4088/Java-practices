public class constructor{
    public static void main(String[] args) {
        int a=0;
        String b="";
        float c= 0.0f;

        Students welcome=new Students();
        welcome.rno=10;
        System.out.println(welcome.rno);


        Students praveen=new Students(10, "Praveen",87.2f);
        praveen.print(a,b,c);


        Students praveenn=new Students(22,89.6f);
        System.out.println(praveenn.name);
        System.out.println(praveenn.marks);

        Students hello=new Students();
        System.out.println(hello.name);
        System.out.println(hello.marks);





    }
}
class Students {
    int rno;
    String name;
    float marks;

    Students(int a,String b,float c){
        rno=a;
        name=b;
        marks=c;
    }

    Students(int a,float b){
        rno=a;
        marks=b;
    }

    Students(){
        rno=16;
        name="hello";
        marks=78.5f;
    }

    void print(int rno, String name, float marks){
        System.out.println(this.name);
        System.out.println(this.marks);
    }
}

