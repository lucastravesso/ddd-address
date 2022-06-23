package com.ddd.addressapi.core.service;

import com.ddd.addressapi.core.entity.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AddressService {

    Address create(Address address);
    Address update(Address address, Long id);
    Address delete(Long id);
    Address findById(Long id);
    Page<Address> findAll(Pageable pageable);
}
