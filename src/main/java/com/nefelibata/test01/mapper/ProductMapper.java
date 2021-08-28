package com.nefelibata.test01.mapper;

import com.nefelibata.test01.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
    @Repository
    public interface ProductMapper {

        List<Product> getProductList();
    }

