package com.ddd.addressapi.inbound.facade.implement;

import com.ddd.addressapi.core.service.AddressService;
import com.ddd.addressapi.inbound.facade.AddressFacade;
import com.ddd.addressapi.inbound.facade.dto.AddressDTO;
import com.ddd.addressapi.inbound.facade.mapper.AddressMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class AddressFacadeImpl implements AddressFacade {

    private final AddressService addressService;

    private final AddressMapper addressMapper;

    public AddressFacadeImpl(AddressService addressService, AddressMapper addressMapper) {
        this.addressService = addressService;
        this.addressMapper = addressMapper;
    }

    @Override
    public AddressDTO create(AddressDTO addressDTO) {
        return addressMapper.convertToDTO(addressService.create(addressMapper.convertToEntity(addressDTO)));
    }

    @Override
    public AddressDTO update(AddressDTO addressDTO, Long id) {
        return addressMapper.convertToDTO(addressService.update(addressMapper.convertToEntity(addressDTO), id));
    }

    @Override
    public AddressDTO delete(Long id) {
        return addressMapper.convertToDTO(addressService.delete(id));
    }

    @Override
    public AddressDTO findById(Long id) {
        return addressMapper.convertToDTO(addressService.findById(id));
    }

    @Override
    public Page<AddressDTO> findAll(Pageable pageable) {
        return addressService.findAll(pageable).map(addressMapper::convertToDTO);
    }
}
