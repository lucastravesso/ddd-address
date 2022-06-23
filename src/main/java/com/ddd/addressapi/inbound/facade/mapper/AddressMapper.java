package com.ddd.addressapi.inbound.facade.mapper;

import com.ddd.addressapi.core.entity.Address;
import com.ddd.addressapi.inbound.facade.dto.AddressDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDTO convertToDTO(Address address);
    Address convertToEntity(AddressDTO addressDTO);
}
