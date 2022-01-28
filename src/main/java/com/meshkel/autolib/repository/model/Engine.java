package com.meshkel.autolib.repository.model;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Builder
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "modify_engine")
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long id_mod;

    @Column
    private String engine;

    @Column
    private Integer engine_volume;

    @Column
    private Integer power;

    @Column
    private String fuel;

    @Column
    private String transmission;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_engine", referencedColumnName = "id")
    private List<Speck> Speck;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Engine engine = (Engine) o;
        return id != null && Objects.equals(id, engine.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
    }