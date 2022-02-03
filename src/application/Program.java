package application;

import model.DAO.DaoFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;


public class Program {

    public static void main(String[] args) {

       SellerDAO sellerDAO = DaoFactory.createSellerDAO();
/*
       Seller seller = sellerDAO.findById(3);
       System.out.println(seller);

        System.out.println();

        Department dp = new Department(2, null);
        List<Seller> list = sellerDAO.findByDepartment(dp);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();

        list = sellerDAO.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
 */
        Department dp = new Department(2, null);

/*
        Seller seller = new Seller(null, "greg", "greg@gmail.com", new Date(), 4.000, dp);
        sellerDAO.insert(seller);
        System.out.println("Inserted new id = " + seller.getId());
        */

        Seller sl = sellerDAO.findById(1);
        sl.setName("Bob Base Brown");
        sellerDAO.update(sl);
        System.out.println("update completed");

        sellerDAO.deleteById(7);

    }

}
