package application;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

         Department obj = new Department(1,"books");

         Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.00, obj);

         Connection con = null;
         Statement st = null;
         ResultSet rs = null;

         try{
             con = DB.getConnection();
             st = con.createStatement();

             rs = st.executeQuery("SELECT * FROM seller");

             while(rs.next()){
                 System.out.println(rs.getInt("id"));
             }

         }
         catch(SQLException e){
            e.printStackTrace();
        }
         finally {
             DB.closeConnection();
             DB.closeStatement(st);
         }

        System.out.println(seller);

    }

}
