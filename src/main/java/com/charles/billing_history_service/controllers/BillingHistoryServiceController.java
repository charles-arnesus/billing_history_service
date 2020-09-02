package com.charles.billing_history_service.controllers;

import com.charles.billing_history_service.models.Bill;
import com.charles.billing_history_service.models.Bills;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BillingHistoryServiceController {

    @GetMapping("/history/{userId}")
    public Bills getAllBillHistory(@PathVariable("userId") String userId) {
        List<Bill> billList = Arrays.asList(
                new Bill("order-id",
                        "user-id",
                        "biller_id",
                        "status",
                        100.00,
                        LocalDateTime.now(),
                        LocalDateTime.now()
                ),
                new Bill("order-id",
                        "user-id",
                        "biller_id",
                        "status",
                        100.00,
                        LocalDateTime.now(),
                        LocalDateTime.now()
                )
        );
        Bills bills = new Bills();
        bills.setBills(billList);
        return bills;
    }

}
