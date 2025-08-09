package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {

	public static void main(String[] args) {
		System.out.println("==== TESTE NUM 1 ====");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("==== TESTE NUM 2 ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for  (Seller obj : list) {
			System.out.println(obj);
		}
	}
}
