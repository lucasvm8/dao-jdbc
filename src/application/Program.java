package application;

import db.DB;
import model.DAO.DaoFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

       SellerDAO sellerDAO = DaoFactory.createSellerDAO();

       Seller seller = sellerDAO.findById(3);

        System.out.println(seller);

    }

}
