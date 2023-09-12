package com.example.avioes.plane;

public record PlaneResponseDTO(Long id, String title, String image, String company) {
        public PlaneResponseDTO(Plane plane){
            this(plane.getId(), plane.getTitle(), plane.getImage(), plane.getCompany());
        }
}
