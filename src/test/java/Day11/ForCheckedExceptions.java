package Day11;

public class ForCheckedExceptions {

//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("started...");
//        System.out.println("inprogress...");
//        Thread.sleep(5000);  // excetpin አድ ሳናረግ ያው ኢረር ነው ሚያሳየን
//        System.out.println("completed...");
//        System.out.println("Finished....");
//    }
//    ሌላኛው መንገድ ደግሞ
        public static void main(String[] args) {
            System.out.println("started...");
           System.out.println("inprogress...");
           try {
               Thread.sleep(5000);
           }catch (InterruptedException e){
               e.printStackTrace();  // ይሄ የሚያሣየው e is object of interruptedEcxeption  ena print endiyaregelene kefelegen new menetekemew
           }
           System.out.println("completed...");
           System.out.println("Finished....");



        }
        }
