package com.ddd.addressapi.core.repository;

import com.ddd.addressapi.core.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
