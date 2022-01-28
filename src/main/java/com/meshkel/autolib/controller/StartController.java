package com.meshkel.autolib.controller;

import com.meshkel.autolib.dto.BrandsDto;
import com.meshkel.autolib.dto.ModelDto;
import com.meshkel.autolib.service.BrandsService;
import com.meshkel.autolib.service.ModelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StartController {

    private final BrandsService brandsService;
    private final ModelService modelService;

    @GetMapping("/findAllBrands")
    public List<BrandsDto> findAllBrands(){
        return brandsService.findAll();
    }

    @GetMapping("/findBrand")
    public BrandsDto findBrand(@RequestParam String name){
        return brandsService.findByName(name);
    }

    @GetMapping("/findAllModelsbyBrand")
    public List<ModelDto> findAllModelsbyBrand(@RequestParam BrandsDto brandsDto){
        return modelService.findByBrand(brandsDto.getId());
    }

    @GetMapping("/findModel")
    public ModelDto findModel(@RequestParam String name){
        return modelService.findByName(name);
    }
}
