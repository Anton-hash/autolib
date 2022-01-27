package com.meshkel.autolib.dto;

import com.meshkel.autolib.repository.model.Modifications;
import org.springframework.stereotype.Component;

@Component
public class ModificationsConverter {

    public Modifications fromModificationsDtoToModifications(ModificationsDto modificationsDto){
        return Modifications.builder()
                .id(modificationsDto.getId())
                .id_model(modificationsDto.getId_model())
                .generation(modificationsDto.getGeneration())
                .year_start(modificationsDto.getYear_start())
                .year_end(modificationsDto.getYear_end())
                .body(modificationsDto.getBody())
                .build();
    }

    public ModificationsDto fromModificationsToModificationsDto(Modifications modifications){
        return ModificationsDto.builder()
                .id(modifications.getId())
                .id_model(modifications.getId_model())
                .generation(modifications.getGeneration())
                .year_start(modifications.getYear_start())
                .year_end(modifications.getYear_end())
                .body(modifications.getBody())
                .build();
    }
}
