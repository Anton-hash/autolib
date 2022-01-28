package com.meshkel.autolib.service;

import com.meshkel.autolib.dto.ModelDto;

import java.util.List;

public interface ModelService {
    ModelDto findByName(String name);
    List<ModelDto> findByBrand(Long idBrand);
}
