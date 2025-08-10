package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

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

		System.out.println("==== TESTE NUM 5 Seller UPDATE ====");
		seller =  sellerDao.findById(1);
		seller.setName("Kauan Cardoso");
		sellerDao.update(seller);
		System.out.println("Updated seller successfully, new ID = " + seller.getId());

		System.out.println("==== TESTE NUM 6 Seller DELETE ====");
		System.out.println("Enter id for delete test: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted seller successfully");
	sc.close();

	}
}
