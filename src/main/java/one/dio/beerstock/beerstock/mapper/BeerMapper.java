package one.dio.beerstock.beerstock.mapper;

import one.dio.beerstock.beerstock.entity.Beer;
import one.dio.beerstock.beerstock.dto.BeerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
