package com.meshkel.autolib.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ModelDto {
    private Long id;
    private Long idBrand;
    private String modelName;
}
