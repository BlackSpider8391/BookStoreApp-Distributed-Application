package com.devd.spring.bookstorecatalogservice.model;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-29
 */
@Data
public class ProductsPagedResponse {
    
    Page<Product> page;
    Map<String, String> _links = new HashMap<>();
    
}
