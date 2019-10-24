package com.minipackage.minipackage.Service;

import com.minipackage.minipackage.Entity.ReceiverInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiverRepository extends JpaRepository<ReceiverInfo, Long> {
}
