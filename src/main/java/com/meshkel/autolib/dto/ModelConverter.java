package com.meshkel.autolib.dto;

import com.meshkel.autolib.repository.model.Model;
import org.springframework.stereotype.Component;

@Component
public class ModelConverter {

    public Model fromModelDtoToModel(ModelDto modelDto){
        return Model.builder()
                .id(modelDto.getId())
                .id_brand(modelDto.getId_brand())
                .model_name(modelDto.getModel_name())
                .build();
    }

    public ModelDto fromModelToModelDto(Model model){
        return ModelDto.builder()
                .id(model.getId())
                .id_brand(model.getId_brand())
                .model_name(model.getModel_name())
                .build();
    }
}
