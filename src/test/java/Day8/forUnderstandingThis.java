package Day8;

public class forUnderstandingThis {


    int x,y;    // when u create a variable in class level we call them global or instance variables
    void  getData(int x, int y){
       this.x=x;
       this.y=y;
    }

    void display (){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
       forUnderstandingThis th = new forUnderstandingThis();
       th.getData(100,455);
       th.display();
    }
}
