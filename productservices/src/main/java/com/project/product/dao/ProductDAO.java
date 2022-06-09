package com.project.product.dao;

import com.project.product.dto.Product;

/**
 * Created by Hector on 6/9/22.
 */
public interface ProductDAO {

    void create(Product product);

    Product read(int id);

    void update (Product product);

    void delete (Product product);

}
