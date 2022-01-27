package com.meshkel.autolib.repository;

import com.meshkel.autolib.repository.model.Brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandsRepository extends JpaRepository <Brands, Integer> {

}
