package com.meshkel.autolib.dto;

import com.meshkel.autolib.repository.model.Speck;
import org.springframework.stereotype.Component;

@Component
public class SpeckConverter {

    public Speck fromSpeckDtoToSpeck(SpeckDto speckDto){
        return Speck.builder()
                .id(speckDto.getId())
                .id_engine(speckDto.getId_engine())
                .turbo(speckDto.getTurbo())
                .rpm(speckDto.getRpm())
                .max_torque(speckDto.getMax_torque())
                .max_speed(speckDto.getMax_speed())
                .acceleration(speckDto.getAcceleration())
                .consumption_city(speckDto.getConsumption_city())
                .consumption_out(speckDto.getConsumption_out())
                .drive(speckDto.getDrive())
                .suspension_fr(speckDto.getSuspension_fr())
                .suspension_bc(speckDto.getSuspension_bc())
                .build();
    }

    public SpeckDto fromSpeckToSpeckDto(Speck speck){
        return SpeckDto.builder()
                .id(speck.getId())
                .id_engine(speck.getId_engine())
                .turbo(speck.getTurbo())
                .rpm(speck.getRpm())
                .max_torque(speck.getMax_torque())
                .max_speed(speck.getMax_speed())
                .acceleration(speck.getAcceleration())
                .consumption_city(speck.getConsumption_city())
                .consumption_out(speck.getConsumption_out())
                .drive(speck.getDrive())
                .suspension_fr(speck.getSuspension_fr())
                .suspension_bc(speck.getSuspension_bc())
                .build();
    }
}
