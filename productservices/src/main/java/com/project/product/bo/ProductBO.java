package com.project.product.bo;

import com.project.product.dto.Product;

/**
 * Created by Hector on 6/9/22.
 */
public interface ProductBO {

    void create(Product product);

    Product findProduct(int id);
}
