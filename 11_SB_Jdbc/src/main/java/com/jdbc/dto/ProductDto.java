package com.jdbc.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.bo.ProductBo;

@Repository
public class ProductDto {
	
	private final String SQL_GET_PRODUCT = 
		    "SELECT productNo, productName, description, warranty, price FROM product";	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	public List<ProductBo> getProducts(){
		return jdbctemplate.query(SQL_GET_PRODUCT, (rs,rowNo) ->{
			return new ProductBo(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4),rs.getDouble(5));
		});
	}
}
