package day10;

interface abc{
    int x = 100;
    void m1();
}
interface xyz{
    int y =200;
    void m2();
}

class pqr{
    int z =890;
    void m3(){
        System.out.println("z");
    }
}

public class MultipleInheritanceDemo extends pqr implements abc,xyz {

    public void m1 (){
        System.out.println("from abc");
    }

    public void m2 (){
        System.out.println("from xyz");
    }

    public static void main(String[] args) {
         MultipleInheritanceDemo mi = new MultipleInheritanceDemo();
         mi.m1();
         mi.m2();
         mi.m3();
    }
}
