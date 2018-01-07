/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combiningobservables;

import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;

/**
 *
 * @author webprog26
 */
public class ObservableGrouping extends AbstractCombiner{

    @Override
    public void combine(Observable<String> o) {
        Observable<GroupedObservable<Integer, String>> byLengths = o.groupBy(s -> s.length());
        byLengths.flatMapSingle(grp -> grp.toList()).subscribe(System.out::println);
        super.combine(o); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
