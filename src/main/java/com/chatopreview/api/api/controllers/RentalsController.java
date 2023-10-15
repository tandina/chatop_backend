package com.chatopreview.api.api.controllers;

import com.chatopreview.api.api.dto.RentalDto;
import com.chatopreview.api.api.models.Rental;
import com.chatopreview.api.api.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class RentalsController {
    private final RentalService rentalService;

    public RentalsController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

//@Autowired
    @GetMapping("rental")
    public ResponseEntity<List<RentalDto>> getRentals() {
        return new ResponseEntity<>(rentalService.getAllRental(), HttpStatus.OK);
    }

    @GetMapping("rental/{id}")
    public ResponseEntity<RentalDto> rentalDetail(@PathVariable int id) {
        return ResponseEntity.ok(rentalService.getRentalById(id));
    }

    @PostMapping("rental/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<RentalDto> createRental(@RequestBody RentalDto rentalDto) {
        return new ResponseEntity<>(rentalService.createRental(rentalDto), HttpStatus.CREATED);
    }


    @PutMapping("rental/{id}/update")
    public ResponseEntity<RentalDto> updateRental(@RequestBody RentalDto rentalDto, @PathVariable("id") int rentalId) {
        RentalDto response = rentalService.updateRental(rentalDto, rentalId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @DeleteMapping("rental/{id}/delete")
    public ResponseEntity<String> deleteRental(@PathVariable("id") int rentalId) {
        System.out.println(rentalId);
        return ResponseEntity.ok("annonce supprimer avec succès");
    }
}
