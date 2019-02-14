package com.hildon.marlon.model.dao;

import com.hildon.marlon.db.DB;
import com.hildon.marlon.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
