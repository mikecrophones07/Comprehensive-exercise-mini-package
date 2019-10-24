package com.minipackage.minipackage.Service;

import com.minipackage.minipackage.Entity.Packages;
import com.minipackage.minipackage.Repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private PackageRepository packageRepo;

    public Packages add(Packages packages) {
        return packageRepo.save(packages);
    }
}
