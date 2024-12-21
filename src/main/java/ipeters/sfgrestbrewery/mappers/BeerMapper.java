package ipeters.sfgrestbrewery.mappers;

/* carlpeters created on 20/12/2024 inside the package - ipeters.sfgrestbrewery.mappers */

import ipeters.sfgrestbrewery.entities.Beer;
import ipeters.sfgrestbrewery.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}
