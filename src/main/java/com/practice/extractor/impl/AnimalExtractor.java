package com.practice.extractor.impl;

import com.practice.extractor.ModelExtractor;
import com.practice.model.AnimalModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnimalExtractor implements ModelExtractor<AnimalModel, String> {

    @Override
    public List<String> extraction(AnimalModel animalModel) {

        final ArrayList<String> souList = new ArrayList<>();

        souList.add(animalModel.getNick());
        souList.add(animalModel.getAge());

        return souList;
    }
}
