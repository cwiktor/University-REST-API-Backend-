package com.asbt.AssociationsSpringBootApiTraining.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String country;
    private String city;
    private String ZipCode;
    private String Street;
    private String number;

    public Address(String country, String city, String zipCode, String street, String number) {
        this.country = country;
        this.city = city;
        ZipCode = zipCode;
        Street = street;
        this.number = number;
    }
}