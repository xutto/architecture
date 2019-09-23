package com.practice.extractor;

import java.util.List;

public interface ModelExtractor<O, E> {
    List<E> extraction(O o);
}
