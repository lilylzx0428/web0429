package cn.service;

import cn.dao.ProductDao;
import cn.model.Product;

public class ProductService {
    private ProductDao productDao=new ProductDao();
    public void save(Product product){
        productDao.save(product);
    }
}
