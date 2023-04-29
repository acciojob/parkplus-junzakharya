package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    int id;

    Boolean isPaymentCompleted;

    @Enumerated(EnumType.STRING)
    PaymentMode paymentMode;

    @OneToOne(mappedBy = "payment", cascade = CascadeType.ALL)
    Reservation reservation;

    public Payment() {
    }

    public Payment(int id, Boolean isPaymentCompleted, PaymentMode paymentMode, Reservation reservation) {
        this.id = id;
        this.isPaymentCompleted = isPaymentCompleted;
        this.paymentMode = paymentMode;
        this.reservation = reservation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getPaymentCompleted() {
        return isPaymentCompleted;
    }

    public void isPaymentCompleted(Boolean paymentCompleted) {
        isPaymentCompleted = paymentCompleted;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
