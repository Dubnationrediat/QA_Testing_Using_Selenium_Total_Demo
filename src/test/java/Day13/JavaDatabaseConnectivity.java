package Day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaDatabaseConnectivity {


    public static void main(String[] args) throws SQLException {
/*
        Library --> contains classes & methods
        Libraries are available in the form of .jar files ---, jar means java archive

        Every database having their own libraries...

        Database - storage area (or) A place where all the applicaton data will be stored.
        Ex: oracle, MS-SQLServer, MySQL...
           NoSQL - MongoDB, Cassandra
//  ---------------------------------------------------------------------------
        SQL - Structured Query Language
              Launguage used to communicate with the database.

            DDL(Data defination language) - create, alter, drop, trunc
            DML(Data manupulation language)- Insert, update,delete
            DRL(Data retriving language)- Select
            TCL(Transaction control language) - commit, roll back
            DCL(Data control language) - grant, revoke
`------------------------------------------------------------------------------------
Database components:
-------------------
        1) database server(data stored here)
        2) database client( a software by which we can connect to the database)


 */

//        -----------------------------------------------------------------

//      AFTER ADDING THE JAR FILE OF MYSQUL THE FOLLOWING ARE THE STEPS TO DO

//        steps
//        ________

//        1 create a connection
//        2 create statement/query
//        3 execute statement/query
//        4 claose connection
// 1st STEP - Create conneciton
       // DriverManager.getConnection("") ; // እዚ ጋር ያረግነው ኮኔክት ነው drivermanager የሚባል ክላስ ውስጥ ያለ getconnecitn የሚባል ሜትድ
                                      //         አለ በሱ ተጠቅመን ነው ኮኔክት ምናረገው ከዛ ቀጥሎ connection string እናስገባለን connection
                                         //      string ደግሞ ይለያያል mysql or ሌላ ካለ እንደየ ዳታ ቤዙ ይለያያል እዚ ጋር ግን mysql ተጠቅመናል፣
                                            //   ከዛ በመቀጠል youser name እና password ይቀበላል።

      DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");

//      ካዛ ይሄንን ኦብጀክት አንድ ቫሪአብል ላይ connectin ክላስ አድርገን እንይዘዋለን

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");

// 2nd  AND 3rd STEP - CREATE STATMENT  AND EXCUTE STATMENT
            Statement stmt = con.createStatement();
            String Q = " insert into student value (103,'rediat')";
            // or we can use diffrent commands like the follwoing
//                      String Q = " insert into student value (103,'rediat)";
//                      String Q = "update student set sname = 'mary" where sid=102;
//                      String Q = "delete from student where sid=103";
            stmt.execute(Q);
//  4th  then we will close the connection
              con.close();
        System.out.println("program is done");

    }



}
