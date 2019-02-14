package com.hildon.marlon.dboperations;

import java.util.Date;

import com.hildon.marlon.model.dao.DaoFactory;
import com.hildon.marlon.model.dao.SellerDao;
import com.hildon.marlon.model.entities.Department;
import com.hildon.marlon.model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@mail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}

}
