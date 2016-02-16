package com.louisamoros.cdb.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.louisamoros.cdb.dao.CompanyDao;
import com.louisamoros.cdb.dao.impl.CompanyDaoImpl;
import com.louisamoros.cdb.model.Company;
import com.louisamoros.cdb.service.CompanyService;
import com.louisamoros.cdb.service.impl.CompanyServiceImpl;

@RunWith(PowerMockRunner.class)
@PrepareForTest(CompanyDaoImpl.class)
public class CompanyServiceTest {

	private static Logger LOGGER = LoggerFactory.getLogger(CompanyServiceTest.class);
	private static CompanyDao mockCompanyDao;

	@BeforeClass
	public static void init() {
		LOGGER.debug("Init mocking companyDao...");
		mockCompanyDao = PowerMockito.mock(CompanyDaoImpl.class);
		PowerMockito.when(mockCompanyDao.getCompanies()).thenReturn(new ArrayList<Company>());
	}

	@Test
	public void getAllCompaniesTest() {
		LOGGER.debug("getAllCompaniesTest...");
		CompanyService companyService = CompanyServiceImpl.INSTANCE;
		companyService.setCompanyDao(mockCompanyDao);
		Assert.assertTrue(companyService.getCompanies() instanceof List<?>);
	}

}