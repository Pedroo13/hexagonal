package com.arantes.hexagonal.application.core.usecase;

import com.arantes.hexagonal.application.core.domain.Customer;
import com.arantes.hexagonal.application.ports.out.FindAddresByZipCodeOutputPort;
import com.arantes.hexagonal.application.ports.out.InsertCustomerOutputPort;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class InsertCustomerUseCase {

    private final FindAddresByZipCodeOutputPort findAddresByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public void insert(Customer customer, String zipCode){
        var address = findAddresByZipCodeOutputPort.find(zipCode);
        customer.setAdress(address);
        insertCustomerOutputPort.insert(customer);

    }
}
