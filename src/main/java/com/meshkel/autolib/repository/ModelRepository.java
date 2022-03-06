package com.meshkel.autolib.repository;

import com.meshkel.autolib.repository.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
    List<Model> findByIdBrand(Long idBrand);
    Model findByModelName(String name);
}
