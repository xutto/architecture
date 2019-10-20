package com.practice.controller;

import com.practice.mapper.DinnerMapper;
import com.practice.pojos.domain.DinnerDomain;
import com.practice.pojos.web.DinnerRequestCopy;
import javax.servlet.http.HttpServletRequest;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MappingTrainingController {

    @GetMapping(path = "/map-objects", headers = "Accept=application/json", produces = {"application/json"})
    @ResponseBody
    public DinnerRequestCopy mapObjects(final HttpServletRequest request) {

//        DinnerRequestCopy dinnerRequestWebNew = DinnerRequestCopy.newBuilder().withFirstDish("gazpacho").withSecondDish("pollo").build();

        DinnerDomain dinnerDomain = new DinnerDomain("primer plato sopa", "segundo plato pollo");
        DinnerMapper dinnerMapper = Mappers.getMapper(DinnerMapper.class);
        DinnerRequestCopy dinnerRequestWeb = dinnerMapper.dinnerDomainToDinnerRequestCopy(dinnerDomain);

        return dinnerRequestWeb;
    }

}
