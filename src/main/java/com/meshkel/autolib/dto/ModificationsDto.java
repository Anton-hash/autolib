package com.meshkel.autolib.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ModificationsDto {
    private Long id;
    private Long id_model;
    private String generation;
    private Integer year_start;
    private Integer year_end;
    private String body;
}
