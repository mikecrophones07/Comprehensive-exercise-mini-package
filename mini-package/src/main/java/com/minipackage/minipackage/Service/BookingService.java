package com.minipackage.minipackage.Service;

import com.minipackage.minipackage.Dto.PackageInformation;
import com.minipackage.minipackage.Entity.Packages;
import com.minipackage.minipackage.Entity.ReceiverInfo;
import com.minipackage.minipackage.Repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class BookingService {

    @Autowired
    private PackageRepository packageRepo;

    @Autowired
    private ReceiverRepository receiverRepo;

    public PackageInformation add(PackageInformation packageInformation) {
        Packages packages = new Packages();
        packages.setPackageNumber(packageInformation.getPackageNumber());
        packages.setWeight(packageInformation.getWeight());
        packages.setStatus("Pending");

        ReceiverInfo receiverInfo = new ReceiverInfo();
        receiverInfo.setName(packageInformation.getReceiver());
        receiverInfo.setPhoneNumber(packageInformation.getPhoneNumber());

        receiverRepo.save(receiverInfo);
        packageRepo.save(packages);
        return packageInformation;
    }
}
