package com.louisamoros.cdb.service.impl;

import java.util.List;

import com.louisamoros.cdb.dao.CompanyDao;
import com.louisamoros.cdb.dao.impl.CompanyDaoImpl;
import com.louisamoros.cdb.model.Company;
import com.louisamoros.cdb.service.CompanyService;

/**
 * Company Service used to CRUD companies and verify inputs.
 * @author excilys
 *
 */
public enum CompanyServiceImpl implements CompanyService {

	INSTANCE;
	
	private CompanyDao companyDao = null;

	private CompanyServiceImpl() {
		companyDao = CompanyDaoImpl.INSTANCE;
	}
	
	public List<Company> getCompanies() {
		return companyDao.getCompanies();
	}

}