package com.meshkel.autolib.service;

import com.meshkel.autolib.dto.BrandsConverter;
import com.meshkel.autolib.dto.BrandsDto;
import com.meshkel.autolib.repository.BrandsRepository;
import com.meshkel.autolib.repository.model.Brands;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandsServiceImpl implements BrandsService{

    private final BrandsRepository brandsrepository;
    private final BrandsConverter brandsConverter;

    @Override
    public BrandsDto findByName(String name) {
        Brands brands = brandsrepository.findByBrandName(name);
        System.out.println(brands);
        if (brands != null) {
            return brandsConverter.fromBrandsToBrandsDto(brands);
        }
        return null;
    }

    @Override
    public List<BrandsDto> findAll() {
        System.out.println(brandsrepository.findAll());
        return brandsrepository.findAll()
                .stream()
                .map(brandsConverter::fromBrandsToBrandsDto)
                .collect(Collectors.toList());
    }


}
