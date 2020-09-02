package com.charles.billing_history_service.models;

import java.time.LocalDateTime;

public class Bill {
    private String orderId;
    private String userId;
    private String billerId;
    private String status;
    private Double totalAmount;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;

    public Bill() {

    }

    public Bill(String orderId,
                String userId,
                String billerId,
                String status,
                Double totalAmount,
                LocalDateTime createdDateTime,
                LocalDateTime updatedDateTime) {
        this.orderId = orderId;
        this.userId = userId;
        this.billerId = billerId;
        this.status = status;
        this.totalAmount = totalAmount;
        this.createdDateTime = createdDateTime;
        this.updatedDateTime = updatedDateTime;
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
}
