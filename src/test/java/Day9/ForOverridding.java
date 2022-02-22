package Day9;


class Bank {
    double roi(){
        return 0;
    }
}

class ICICI extends Bank{
    double roi(){
        return 10.5;
    }
}
class AXIS extends Bank{
    double roi(){
        return 12.0;
    }
}

public class ForOverridding {
    public static void main(String[] args) {
        ICICI ic = new ICICI();
        System.out.println(ic.roi());  // 10.5

        AXIS ax = new AXIS();
        System.out.println(ax.roi());// 12.0
    }
}
