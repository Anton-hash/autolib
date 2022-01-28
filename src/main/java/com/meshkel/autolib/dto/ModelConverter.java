package com.meshkel.autolib.dto;

import com.meshkel.autolib.repository.model.Model;
import org.springframework.stereotype.Component;

@Component
public class ModelConverter {

    public Model fromModelDtoToModel(ModelDto modelDto){
        return Model.builder()
                .id(modelDto.getId())
                .idBrand(modelDto.getIdBrand())
                .modelName(modelDto.getModelName())
                .build();
    }

    public ModelDto fromModelToModelDto(Model model){
        return ModelDto.builder()
                .id(model.getId())
                .idBrand(model.getIdBrand())
                .modelName(model.getModelName())
                .build();
    }
}
