package com.meshkel.autolib.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BrandsDto {

    private Long id;
    private String brandName;
}
