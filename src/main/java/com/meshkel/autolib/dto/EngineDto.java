package com.meshkel.autolib.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EngineDto {
    private Long id;
    private Long id_mod;
    private String engine;
    private Integer engine_volume;
    private Integer power;
    private String fuel;
    private String transmission;
}
