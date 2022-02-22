package Day13;

import java.sql.*;

public class JavaDatabaseConnectivitytwo {
    /*
    እዚ ጋር የምንሰራው ከዛኛው ጋር ተመሳሳይ ሆኖ ለ select ነው select ደግሞ አንድ አቅጣጫ ብቻ ሳይሆን ሁለት አቅጣጫ ነው
    ምክንያቱም ያዘዝነውን ይዞ ስለሚመጣ ለሱ ነው ይሄንን ምንሰራው እና step አንዳይነት ሆኖ ነገር ግን አንድ ስቴፕ አራተኛ ላይ እንጨምራለን።
*/
    public static void main(String[] args) throws SQLException {
/*
       ------------------------------------
        SQL - Structured Query Language
              Launguage used to communicate with the database.

            DDL(Data defination language) - create, alter, drop, trunc
               //እኛ እንደ ቴስተር ፎከስ ምናረገው ያው DML ENA DRL ኮማንድ አይ ነው
            DML(Data manupulation language)- Insert, update,delete
            DRL(Data retriving language)- Select

            TCL(Transaction control language) - commit, roll back
            DCL(Data control language) - grant, revoke
 */
//---------------------------------------------------------------------------------
//        steps
//        ________

//        1 create a connection
//        2 create statement/query
//        3 execute statement/query
//        4.store results into result
//        5 claose connection
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
            String Q = "select * From location ";

            // stmt.executeQuery(Q);// for select command we should use executeqeuery command
//  4th  then we will store in a varialble using Resultset class like  this
        ResultSet rs = stmt.executeQuery(Q); // ይሄ ብዙ ሮው እና ኮለምን ይዞብን ሊመጣ ስለሚችል በሉፕ ሊሚት እናረገዋለን because
//        we dont know the limit of return
        while (rs.next()){  //
            String mycity = rs.getString("city");
            String mycountry= rs.getString("country");
            int pin = rs.getInt("pin");

            System.out.println(mycity + " "+ mycountry + " "+ pin);
        }
//    5th step close
              con.close();
        System.out.println("program is done");

    }



}
