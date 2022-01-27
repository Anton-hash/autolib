package com.meshkel.autolib.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ModelDto {
    private Long id;
    private Long id_brand;
    private String model_name;
}
