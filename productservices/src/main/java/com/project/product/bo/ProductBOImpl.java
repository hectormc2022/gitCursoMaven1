package com.project.product.bo;

import com.project.product.dao.ProductDAO;
import com.project.product.dao.ProductDAOImpl;
import com.project.product.dto.Product;

/**
 * Created by Hector on 6/9/22.
 */
public class ProductBOImpl implements ProductBO{

    private static ProductDAO dao = new ProductDAOImpl();

    @Override
    public void create(Product product) {
        dao.create(product);
    }

    @Override
    public Product findProduct(int id) {
        return dao.read(id);
    }
}
