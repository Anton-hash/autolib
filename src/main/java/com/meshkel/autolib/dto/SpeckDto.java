package com.meshkel.autolib.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SpeckDto {
    private Long id;
    private Long id_engine;
    private Boolean turbo;
    private Integer rpm;
    private Integer max_torque;
    private Integer max_speed;
    private Double acceleration;
    private Double consumption_city;
    private Double consumption_out;
    private String drive;
    private String suspension_fr;
    private String suspension_bc;
}
