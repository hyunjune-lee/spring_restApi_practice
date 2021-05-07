package com.example.web_pra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
@Builder
@AllArgsConstructor
public class Address {
    private String address;
    private String zipCode;
    private String telNo;

    public Address() {

    }

}
