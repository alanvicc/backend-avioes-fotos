package com.example.avioes.plane;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "plane")
@Entity(name = "plane")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Plane {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private String company;

    public Plane(PlaneRequestDTO data){
        this.title = data.title();
        this.image = data.image();
        this.company = data.company();
    }
}
