package com.meshkel.autolib.service;

import com.meshkel.autolib.dto.ModelConverter;
import com.meshkel.autolib.dto.ModelDto;
import com.meshkel.autolib.repository.ModelRepository;
import com.meshkel.autolib.repository.model.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelServiceImpl implements ModelService{

    private final ModelRepository modelRepository;
    private final ModelConverter modelConverter;

    @Override
    public ModelDto findByName(String name) {
        Model model = modelRepository.findByModelName(name);
        if (model != null){
            return modelConverter.fromModelToModelDto(model);
        }
        return null;
    }

    @Override
    public List<ModelDto> findByBrand(Long idBrand) {
        return modelRepository.findByIdBrand(idBrand)
                .stream()
                .map(modelConverter::fromModelToModelDto)
                .collect(Collectors.toList());
    }
}
