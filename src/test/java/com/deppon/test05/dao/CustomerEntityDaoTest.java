package com.deppon.test05.dao;

import com.deppon.test05.dao.impl.CustomerEntityDao;
import com.deppon.test05.dao.impl.PersonEntityDao;
import com.deppon.test05.entity.CustomerEntity;
import com.deppon.test05.entity.PersonEntity;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by lilei on 5/16/2017.
 */
public class CustomerEntityDaoTest {
    private CustomerEntityMapper customerEntityDao;

    @Before
    public void before() {
        customerEntityDao = new CustomerEntityDao();
    }

    @Test
    public void testInsert() {

        CustomerEntity customer = new CustomerEntity();
        customer.setEi(7);
        customer.setCustomerid(UUID.randomUUID().toString());
        customer.setName("sony company");
        customer.setCustomerno("");
        customer.setAddress("");
        customer.setArea("");
        customerEntityDao.insert(customer);
    }
}
