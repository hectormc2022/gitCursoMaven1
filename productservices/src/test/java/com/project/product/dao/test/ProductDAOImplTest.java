package com.project.product.dao.test;

import com.project.product.dao.ProductDAO;
import com.project.product.dao.ProductDAOImpl;
import com.project.product.dto.Product;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert.*;
/**
 * Created by Hector on 6/9/22.
 */

public class ProductDAOImplTest {

    @Test
    public void test()
    {

    }

    @Test
    public void createShouldCrateAProduct()
    {
        ProductDAO dao = new ProductDAOImpl();
        Product product = new Product();
        product.setId(1);
        product.setName("IPhone");
        product.setDescription("It's awesome");
        product.setPrice(800);
        dao.create(product);
        Product result = dao.read(1);

        Assert.assertNotNull(result);
        Assert.assertEquals("IPhone", result.getName());

    }

}
