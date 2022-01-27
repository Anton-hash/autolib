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
@Table (name = "Brands")
        public class Brands {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String brand_name;

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinColumn(name = "id_brand", referencedColumnName = "id")
        private List<Model> model;

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
                Brands brands = (Brands) o;
                return id != null && Objects.equals(id, brands.id);
        }

        @Override
        public int hashCode() {
                return getClass().hashCode();
        }
}
