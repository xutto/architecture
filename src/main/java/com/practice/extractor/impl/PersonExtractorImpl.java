package com.practice.extractor.impl;

import com.practice.extractor.ModelExtractor;
import com.practice.model.PersonModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PersonExtractorImpl implements ModelExtractor<PersonModel, String> {

    @Override
    public List<String> extraction(PersonModel personModel) {

        final ArrayList<String> souList = new ArrayList<>();

        souList.add(personModel.getName());
        souList.add(personModel.getSurName());
        souList.add(personModel.getCustomNick());

        return souList;
    }
}
