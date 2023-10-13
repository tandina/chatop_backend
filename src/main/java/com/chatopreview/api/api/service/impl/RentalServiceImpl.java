package com.chatopreview.api.api.service.impl;

import com.chatopreview.api.api.dto.RentalDto;
import com.chatopreview.api.api.models.Rental;
import com.chatopreview.api.api.repository.RentalRepository;
import com.chatopreview.api.api.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalServiceImpl implements RentalService {
    private RentalRepository rentalRepository;

    @Autowired
    public RentalServiceImpl(RentalRepository rentalRepository) {
        this.rentalRepository=rentalRepository;
    }
    @Override
    public RentalDto createRental(RentalDto rentalDto) {
        Rental rental = new Rental();
        rental.setName(rentalDto.getName());
        rental.setSurface(rentalDto.getSurface());
        rental.setPrice(rentalDto.getPrice());
        rental.setPicture(rentalDto.getPicture());
        rental.setDescription(rentalDto.getDescription());
        rental.setOwner_id(rentalDto.getOwner_id());

        Rental newRental = rentalRepository.save(rental);

        return null;
    }
}
