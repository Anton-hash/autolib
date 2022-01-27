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
@NoArgsConstructor
@Table(name = "modifications")
public class Modifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long id_model;

    @Column
    private String generation;

    @Column
    private Integer year_start;

    @Column
    private Integer year_end;

    @Column
    private String body;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_mod", referencedColumnName = "id")
    private List<Engine> engine;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Modifications modifications = (Modifications) o;
        return id != null && Objects.equals(id, modifications.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
