package com.arantes.hexagonal.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Customer {

    public Customer(){
        this.isValidCpf = false;
    }

    private String id;
    private String name;
    private Address adress;
    private String cpf;
    private Boolean isValidCpf;

}
