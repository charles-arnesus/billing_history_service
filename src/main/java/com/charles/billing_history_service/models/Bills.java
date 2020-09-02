package com.charles.billing_history_service.models;

import java.util.List;

public class Bills {
    private List<Bill> bills;

    public Bills() {

    }

    public Bills(List<Bill> bills) {
        this.bills = bills;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }
}
