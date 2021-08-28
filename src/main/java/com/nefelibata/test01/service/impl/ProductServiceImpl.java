package com.nefelibata.test01.service.impl;

import com.nefelibata.test01.entity.Product;
import com.nefelibata.test01.mapper.ProductMapper;
import com.nefelibata.test01.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
    @Service
    public class ProductServiceImpl implements ProductService {
        @Autowired
        ProductMapper productMapper;



        public List<Product> getProductList() {
            List<Product> proList = productMapper.getProductList();
            return proList;
        }
    }

