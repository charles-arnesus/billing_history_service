package com.charles.billing_history_service.controllers;

import com.charles.billing_history_service.models.Bill;
import com.charles.billing_history_service.models.Bills;
import com.charles.billing_history_service.models.PaymentResponse;
import com.charles.billing_history_service.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BillingHistoryServiceController {

    @Autowired
    private BillRepository billRepository;

    @GetMapping("/history/{userId}")
    public Bills getAllBillHistory(@PathVariable("userId") String userId) {
        List<Bill> billList = billRepository.findAllByUserId(userId);
        Bills bills = new Bills();
        bills.setBills(billList);
        return bills;
    }

    @PostMapping("/history/")
    public Bill addBillHistory(@RequestBody PaymentResponse paymentResponse) {
        Bill bill = new Bill();
        bill.setBillerId(paymentResponse.getBillerId());
        bill.setCreatedDateTime(LocalDateTime.now());
        bill.setUpdatedDateTime(LocalDateTime.now());
        bill.setOrderId(paymentResponse.getPaymentId().toString());
        bill.setPaymentDate(paymentResponse.getPaymentDate());
        bill.setStatus(paymentResponse.getStatus());
        bill.setTotalAmount(paymentResponse.getTotalAmount());
        bill.setUserId("user-id");
        final Bill result = billRepository.save(bill);
        return result;
    }

}
