package com.example.avioes.controller;

import com.example.avioes.plane.Plane;
import com.example.avioes.plane.PlaneRepository;
import com.example.avioes.plane.PlaneResponseDTO;
import com.example.avioes.plane.PlaneRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("plane")
public class PlaneController {

    @Autowired
    private PlaneRepository repository;

    @PostMapping
    public void savePlane(@RequestBody PlaneRequestDTO data){
        Plane planeData = new Plane(data);
        repository.save(planeData);
        return;
    }

    @GetMapping
    public List<PlaneResponseDTO> getAll(){

        List<PlaneResponseDTO> planeList = repository.findAll().stream().map(PlaneResponseDTO::new).toList();
        return planeList;
    }
}
