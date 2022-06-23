package com.ddd.addressapi.inbound.facade;

import com.ddd.addressapi.inbound.facade.dto.AddressDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AddressFacade {

    AddressDTO create(AddressDTO addressDTO);

    AddressDTO update(AddressDTO addressDTO, Long id);

    AddressDTO delete(Long id);

    AddressDTO findById(Long id);

    Page<AddressDTO> findAll(Pageable pageable);

}
