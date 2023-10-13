package com.chatopreview.api.api.controllers;

import com.chatopreview.api.api.models.Rental;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class RentalsController {
    @GetMapping("rental")
    public ResponseEntity<List<Rental>> getRentals() {
        List<Rental> rentals = new ArrayList<>();

        rentals.add(new Rental(1, "house 1", 456, 3000, "https://blog.technavio.org/wp-content/uploads/2018/12/Online-House-Rental-Sites.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam a lectus eleifend, varius massa ac, mollis tortor", 1));
        rentals.add(new Rental(2, "house 2", 123, 2435, "https://blog.technavio.org/wp-content/uploads/2018/12/Online-House-Rental-Sites.jpg", "Lorem ipsum dolor sit amet", 1));
        rentals.add(new Rental(3, "house 3", 234, 5643, "https://blog.technavio.org/wp-content/uploads/2018/12/Online-House-Rental-Sites.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam a lectus eleifend, varius massa ac, mollis tortor", 1));

        return ResponseEntity.ok(rentals);

    }

    @GetMapping("rental/{id}")
    public Rental rentalDetail(@PathVariable int id) {
        return new Rental(id,"house 1",456, 3000, "https://blog.technavio.org/wp-content/uploads/2018/12/Online-House-Rental-Sites.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam a lectus eleifend, varius massa ac, mollis tortor", 1);
    }

    @PostMapping("rental/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Rental> createRental(@RequestBody Rental rental) {
        System.out.println(rental.getName());
        System.out.println(rental.getSurface());
        System.out.println(rental.getPrice());
        System.out.println(rental.getPicture());
        System.out.println(rental.getDescription());
        System.out.println(rental.getOwner_id());
        return new ResponseEntity<>(rental, HttpStatus.CREATED);
    }

    @PutMapping("rental/{id}/update")
    public ResponseEntity<Rental> updateRental(@RequestBody Rental rental, @PathVariable("id") int rentalId) {
        System.out.println(rental.getName());
        System.out.println(rental.getSurface());
        System.out.println(rental.getPrice());
        System.out.println(rental.getPicture());
        System.out.println(rental.getDescription());
        System.out.println(rental.getOwner_id());
        return ResponseEntity.ok(rental);
    }
    @DeleteMapping("rental/{id}/delete")
    public ResponseEntity<String> deleteRental(@PathVariable("id") int rentalId) {
        System.out.println(rentalId);
        return ResponseEntity.ok("annonce supprimer avec succès");
    }
}
