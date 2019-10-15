package com.practice.controller;

import com.practice.annotation.Logeable;
import com.practice.extractor.ModelExtractor;
import com.practice.model.AnimalModel;
import com.practice.model.PersonModel;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@Logeable
public class HomeController {

    private final ModelExtractor animalExtractor;
    private final ModelExtractor personExtractor;

    @Autowired
    public HomeController(
            @Qualifier("animalExtractor") ModelExtractor animalExtractor,
            @Qualifier("personExtractorImpl") ModelExtractor personExtractor) {
        this.animalExtractor = animalExtractor;
        this.personExtractor = personExtractor;
    }


    @GetMapping(path = "/", headers = "Accept=application/json", produces = {"application/json"})
    @ResponseBody
    public List<PersonModel> homePage(final HttpServletRequest request) {

        final ArrayList<PersonModel> listResult = new ArrayList<>();

        final AnimalModel animalModel = new AnimalModel.Builder()
                .withNick("meli")
                .withAge("6")
                .build();

        final PersonModel personModel = new PersonModel.Builder()
                .withName("polloman")
                .withSurName("loco")
                .withCustomNick(request.getParameter("nick"))
                .build();
        final List<String> animalExtraction = animalExtractor.extraction(animalModel);
        final List<String> personExtraction = personExtractor.extraction(personModel);

        final PersonModel person1 = new PersonModel.Builder()
                .withName(personModel.getName())
                .withCustomNick(personModel.getCustomNick())
                .withSurName(personModel.getSurName())
                .withProperties(animalExtraction)
                .build();
        final PersonModel person2 = new PersonModel.Builder()
                .withName(personModel.getName())
                .withCustomNick(personModel.getCustomNick())
                .withSurName(personModel.getSurName())
                .withProperties(personExtraction)
                .build();

        listResult.add(person1);
        listResult.add(person2);
        return listResult;
    }
}
