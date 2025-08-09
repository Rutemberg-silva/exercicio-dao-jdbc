package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import db.DB;
import db.DbIntegrityException;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj1 = new Department(1,"Books");
		Seller seller = new Seller(21,"Bob", "bob@hotmail.com", new Date(),2500.00,obj1);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(obj1);
		System.out.println(seller);


	}
}
