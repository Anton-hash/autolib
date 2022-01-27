package com.meshkel.autolib.dto;

import com.meshkel.autolib.repository.model.Engine;
import org.springframework.stereotype.Component;

@Component
public class EngineConverter {

    public Engine fromEngineDtoToEngine(EngineDto engineDto) {
        return Engine.builder()
                .id(engineDto.getId())
                .id_mod(engineDto.getId_mod())
                .engine(engineDto.getEngine())
                .engine_volume(engineDto.getEngine_volume())
                .power(engineDto.getPower())
                .fuel(engineDto.getFuel())
                .transmission(engineDto.getTransmission())
                .build();
    }

    public EngineDto fromEngineToEngineDto(Engine engine) {
        return EngineDto.builder()
                .id(engine.getId())
                .id_mod(engine.getId_mod())
                .engine(engine.getEngine())
                .engine_volume(engine.getEngine_volume())
                .power(engine.getPower())
                .fuel(engine.getFuel())
                .transmission(engine.getTransmission())
                .build();
    }
}
