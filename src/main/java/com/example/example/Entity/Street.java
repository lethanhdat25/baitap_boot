package com.example.example.Entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "streets")
@ToString
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private StreetStatus status;
    private Integer districtId;
    @ManyToOne
    @JoinColumn(name = "districtId", insertable = false, updatable = false)
    private District district;
}
