package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		System.out.println("==== TESTE NUM 1 Find by id ====");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("==== TESTE NUM 2 find by department ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for  (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("==== TESTE NUM 3 Find all ====");
		list = sellerDao.findAll();
		for  (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("==== TESTE NUM 4 Seller Insert ====");
		Seller newseller = new Seller(null, "Greg", "greg@gmail.com", new Date(),5000.00,department);
		sellerDao.insert(newseller);
		System.out.println("Inserted seller successfully, new ID = " + newseller.getId());
	}
}
