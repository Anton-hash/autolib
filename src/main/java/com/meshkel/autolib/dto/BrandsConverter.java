package com.meshkel.autolib.dto;

import com.meshkel.autolib.repository.model.Brands;
import org.springframework.stereotype.Component;

@Component
public class BrandsConverter {

    public Brands fromBrandsDtoToBrands(BrandsDto brandsDto) {
        return Brands.builder()
                .id(brandsDto.getId())
                .brandName(brandsDto.getBrandName())
                .build();
    }

    public BrandsDto fromBrandsToBrandsDto(Brands brands) {
        return BrandsDto.builder()
                .id(brands.getId())
                .brandName(brands.getBrandName())
                .build();
    }
}
