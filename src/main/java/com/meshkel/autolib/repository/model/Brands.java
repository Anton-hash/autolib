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
@Table (name = "Brands")
@NoArgsConstructor
@AllArgsConstructor
public class Brands {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "Brand_name")
        private String brandName;

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
