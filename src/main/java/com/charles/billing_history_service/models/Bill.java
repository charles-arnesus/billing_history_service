package com.charles.billing_history_service.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "billing_history")
public class Bill {
    @Id
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "biller_id")
    private String billerId;
    @Column(name = "status")
    private String status;
    @Column(name = "total_amount")
    private Double totalAmount;
    @Column(name = "created_date_time")
    private LocalDateTime createdDateTime;
    @Column(name = "updated_date_time")
    private LocalDateTime updatedDateTime;
    @Column(name = "payment_date")
    private LocalDate paymentDate;

    public Bill() {

    }

    public Bill(String orderId,
                String userId,
                String billerId,
                String status,
                Double totalAmount,
                LocalDateTime createdDateTime,
                LocalDateTime updatedDateTime,
                LocalDate paymentDate) {
        this.orderId = orderId;
        this.userId = userId;
        this.billerId = billerId;
        this.status = status;
        this.totalAmount = totalAmount;
        this.createdDateTime = createdDateTime;
        this.updatedDateTime = updatedDateTime;
        this.paymentDate = paymentDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBillerId() {
        return billerId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
}
