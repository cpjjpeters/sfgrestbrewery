package ipeters.sfgrestbrewery.mappers;

import ipeters.sfgrestbrewery.domain.Customer;
import ipeters.sfgrestbrewery.model.CustomerDTO;
import org.mapstruct.Mapper;

/* carlpeters created on 20/12/2024 inside the package - ipeters.sfgrestbrewery.mappers */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}