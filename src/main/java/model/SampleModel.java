package model;

import rx.Observable;

import java.util.Arrays;
import java.util.List;

public class SampleModel {
    public Observable<List<String>> getData() {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        return Observable.just(strings);
    }
}
