package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Payment;

import java.time.Instant;

public class PaymentDTO {
    private Long id;
    private Instant moment;

    public PaymentDTO(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public PaymentDTO(Payment entity) {
        id = entity.getId();
        moment = entity.getMoment();
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }
}
