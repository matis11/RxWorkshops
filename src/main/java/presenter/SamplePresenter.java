package presenter;

import model.SampleModel;
import rx.Observable;

import java.util.List;

public class SamplePresenter {
    private SampleModel model = new SampleModel();

    public rx.Observable<List<String>> getDataToDisplay() {

        Observable<List<String>> observable = model.getData()
                .map(strings -> {
                    strings.add("new");
                    return strings;
                });

        return observable;
    }
}
