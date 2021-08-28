package com.nefelibata.test01.controller;

import com.nefelibata.test01.entity.Product;
import com.nefelibata.test01.entity.Response;
import com.nefelibata.test01.entity.User;
import com.nefelibata.test01.service.ProductService;
import com.nefelibata.test01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Repository
public class ProductController {
    @Autowired
    ProductService productService;


//    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
//    public Response addProduct(@RequestBody Product product) {
//        if (product.getProductName() != null && product.getProductPrice() != 0 && product.getProductType() != 0 && product.getProductImg() != null && product.getProductDes() != null) {
//            int count = productService.addProduct(product);
//            if (count > 0) {
//                Response response = new Response(true, "添加成功", 1);
//                return response;
//            } else {
//                Response response = new Response(false, "添加失败", -1);
//                return response;
//            }
//        } else {
//            Response response = new Response(false, "有参数为空", -1);
//            return response;
//        }
//    }

    @RequestMapping(value = "/getProductList", method = RequestMethod.POST)
    public Response getProductList() {
            Response response = new Response();
            List<Product> productList = productService.getProductList();
            response.setResponse(true, "查询成功", 1, productList);
            return response;
        }

}

