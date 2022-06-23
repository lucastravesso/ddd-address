package com.ddd.addressapi.core.service.implement;

import com.ddd.addressapi.core.entity.Address;
import com.ddd.addressapi.core.repository.AddressRepository;
import com.ddd.addressapi.core.service.AddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address create(Address address) {
        address.setIsActive(true);
        return addressRepository.save(address);
    }

    @Override
    public Address update(Address address, Long id) {
        Address optAddress = addressRepository.findById(Math.toIntExact(id)).orElse(null);
        if (optAddress != null){
            return addressRepository.saveAndFlush(optAddress);
        }
        return null;
    }

    @Override
    public Address delete(Long id) {
        Address optAddress = addressRepository.findById(Math.toIntExact(id)).orElse(null);
        if (optAddress != null){
            optAddress.setIsActive(!optAddress.getIsActive());
            return addressRepository.saveAndFlush(optAddress);
        }
        return null;
    }

    @Override
    public Address findById(Long id) {
        return addressRepository.findById(Math.toIntExact(id)).orElse(null);
    }

    @Override
    public Page<Address> findAll(Pageable pageable) {
        return addressRepository.findAll(pageable);
    }
}
