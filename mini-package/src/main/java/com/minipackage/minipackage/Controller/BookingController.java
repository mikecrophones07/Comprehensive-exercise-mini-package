package com.minipackage.minipackage.Controller;

import com.minipackage.minipackage.Entity.Packages;
import com.minipackage.minipackage.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping(produces = {"application/json"})
    @ResponseStatus(value = HttpStatus.CREATED)
    public Packages createBooking(@RequestBody Packages packages){
        return bookingService.add(packages);
    }
}
