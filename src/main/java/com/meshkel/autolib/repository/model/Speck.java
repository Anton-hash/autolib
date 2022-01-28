package com.meshkel.autolib.repository.model;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Builder
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Specifications")
public class Speck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long id_engine;

    @Column
    private Boolean turbo;

    @Column
    private Integer rpm;

    @Column
    private Integer max_torque;

    @Column
    private Integer max_speed;

    @Column
    private Double acceleration;

    @Column
    private Double consumption_city;

    @Column
    private Double consumption_out;

    @Column
    private String drive;

    @Column
    private String suspension_fr;

    @Column
    private String suspension_bc;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Speck speck = (Speck) o;
        return id != null && Objects.equals(id, speck.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
