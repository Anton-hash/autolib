package com.meshkel.autolib.service;

import com.meshkel.autolib.repository.BrandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandsService {

    @Autowired
    private  BrandsRepository brandsrepository;


}
