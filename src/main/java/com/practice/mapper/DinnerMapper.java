package com.practice.mapper;

import com.practice.pojos.domain.DinnerDomain;
import com.practice.pojos.web.DinnerRequestCopy;
import com.practice.pojos.web.DinnerRequestWeb;
import org.mapstruct.Mapper;

@Mapper
public interface DinnerMapper {

//    DinnerMapper instance = Mappers.getMapper( DinnerMapper.class );

    DinnerRequestWeb dinnerDomainToDinnerRequetWeb(DinnerDomain dinnerDomain);

    DinnerRequestCopy dinnerDomainToDinnerRequestCopy(DinnerDomain dinnerDomain);

}
