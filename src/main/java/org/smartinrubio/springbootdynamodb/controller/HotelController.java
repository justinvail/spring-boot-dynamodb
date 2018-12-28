package org.smartinrubio.springbootdynamodb.controller;

import org.smartinrubio.springbootdynamodb.model.Hotel;
import org.smartinrubio.springbootdynamodb.repository.HotelRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    private final HotelRepository repository;

    public HotelController(HotelRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/table")
    public ResponseEntity createTable() {
        repository.createTable();
        return ResponseEntity.ok("Table Created!");
    }

    @GetMapping("/data")
    public ResponseEntity loadData() throws IOException {
        repository.loadData();
        return ResponseEntity.ok("Data Loaded");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return repository.save(hotel);
    }

}
