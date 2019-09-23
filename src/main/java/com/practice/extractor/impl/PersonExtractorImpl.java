package com.practice.extractor.impl;

import com.practice.extractor.ModelExtractor;
import com.practice.model.PersonModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
