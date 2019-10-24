package com.minipackage.minipackage.Repository;

import com.minipackage.minipackage.Entity.Packages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Packages, Long> {
}
