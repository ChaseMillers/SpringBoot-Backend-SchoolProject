package com.managmentsystem.fullstackapi.repository;

import com.managmentsystem.fullstackapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Long> {

}
