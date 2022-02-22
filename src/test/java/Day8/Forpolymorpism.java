package Day8;

//polymorphism is implimented through overloading
//overloading is the concept of having diffrent number of arguments like in diffrent data type

public class Forpolymorpism {
    int x,y,z;
    double d;

    void morph(int a , int b){
            x=a;
            y=b;
        System.out.println(x+y);
    }

    void morph(int j, double o){
        z=j;
        d=o;
        System.out.println(z+d);
    }

    void morph ( int b, int u , double w){
        x=b;
        y=u;
        d=w;
        System.out.println(x+y+d);
    }

    public static void main(String[] args) {
        Forpolymorpism a = new Forpolymorpism();
        a.morph(3,4);
        a.morph(4,5.6);
        a.morph(5,6,7.9);

    }

}
