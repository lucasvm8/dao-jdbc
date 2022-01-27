package application;

import model.DAO.DaoFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;


public class Program {

    public static void main(String[] args) {

       SellerDAO sellerDAO = DaoFactory.createSellerDAO();

       Seller seller = sellerDAO.findById(3);
       System.out.println(seller);

        System.out.println();

        Department dp = new Department(2, null);
        List<Seller> list = sellerDAO.findByDepartment(dp);
        for (Seller obj : list) {
            System.out.println(obj);
        }
    }

}
