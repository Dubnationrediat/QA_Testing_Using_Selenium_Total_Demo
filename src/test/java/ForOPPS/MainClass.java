package ForOPPS;

public class MainClass {

    public static void main(String[] args) {
        //invoke an object


        // the follwoing is called object reference variable and its one approach
//        JavaOppsConcept emploayee1 = new JavaOppsConcept();
//        emploayee1.employeeId=1213;
//        emploayee1.employeeName="Rediat";
//        emploayee1.employeeJob="assistant";
//        emploayee1.employeeSalary=10000;
//        emploayee1.emploayAttribut();

//        JavaOppsConcept employee2 = new JavaOppsConce
//        employee2.employeeId=2345;
//        employee2.employeeName="sintayehu";
//        employee2.employeeJob="manager";
//        employee2.employeeSalary=34000;
//        employee2.emploayAttribut();

//        the soecond approach is by using a method

//        firs we will create a method wiht argument in the child class
//        and we will call it here with passing arguments

//                JavaOppsConcept employeee3 = new JavaOppsConcept();
//                employeee3.setData(2346,"kebede","vice-president",30000);
//                employeee3.emploayAttribut();

//                the third approach is using CONSTRACTOR;

//        in costractro there is no need for object envoking

          JavaOppsConcept usingConstractor = new JavaOppsConcept(234555,"buzae","vice-manager",27000);
          usingConstractor.emploayAttribut();
    }

}
