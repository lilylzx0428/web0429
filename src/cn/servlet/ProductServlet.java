package cn.servlet;
import cn.model.Product;
import cn.service.ProductService;

import javax.servlet.http.*;
import java.io.IOException;

public class ProductServlet extends javax.servlet.http.HttpServlet {
    private ProductService productService=new ProductService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Product product=new Product();
        product.setName(request.getParameter("name"));
        double price=Double.parseDouble(request.getParameter("price"));
        product.setPrice(price);
        product.setRemark(request.getParameter("remark"));
        productService.save(product);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
