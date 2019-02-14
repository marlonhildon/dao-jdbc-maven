package com.hildon.marlon.dboperations;

import com.hildon.marlon.model.dao.DaoFactory;
import com.hildon.marlon.model.dao.SellerDao;
import com.hildon.marlon.model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
