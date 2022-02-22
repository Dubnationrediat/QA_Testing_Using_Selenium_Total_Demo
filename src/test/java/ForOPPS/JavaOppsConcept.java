package ForOPPS;

public class JavaOppsConcept {
    // class is logical intitiy
    //  object is  physical intitiy

    //varibales
    int employeeId ;
    String employeeName;
    String employeeJob;
    int employeeSalary;

    //method
    void emploayAttribut(){
        System.out.println(employeeId);
        System.out.println(employeeName);
        System.out.println(employeeJob);
        System.out.println(employeeSalary);
        System.out.println();
    }
//the method for argument
    /*
    void setData(int id,String name, String job, int salary){
             employeeId=id;
             employeeName=name;
             employeeJob=job;
             employeeSalary=salary;
//              then we will go to the main class and call it

    }
    */

//using constractro

    JavaOppsConcept (int id,String name, String job, int salary){
        employeeId=id;
        employeeName=name;
        employeeJob=job;
        employeeSalary=salary;
    }

}
