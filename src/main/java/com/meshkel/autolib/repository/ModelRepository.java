package com.meshkel.autolib.repository;

import com.meshkel.autolib.repository.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Long> {
    List<Model> findByIdBrand(Long idBrand);
    Model findByModelName(String name);
}
