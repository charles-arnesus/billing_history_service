package com.charles.billing_history_service.repositories;

import com.charles.billing_history_service.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillRepository extends JpaRepository<Bill, String> {
    Bill save(Bill bill);

    List<Bill> findAllByUserId(String userId);
}
