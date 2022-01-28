package com.meshkel.autolib.service;

import com.meshkel.autolib.dto.BrandsDto;

import java.util.List;

public interface BrandsService {

    BrandsDto findByName(String name);

    List<BrandsDto> findAll();

}
