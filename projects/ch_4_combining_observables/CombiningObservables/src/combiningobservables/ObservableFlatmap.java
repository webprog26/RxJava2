/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combiningobservables;

import io.reactivex.Observable;

/**
 *
 * @author webprog26
 */
public class ObservableFlatmap extends AbstractCombiner{

    @Override
    public void combine(Observable<String> o) {
        o.flatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(System.out::println);
        super.combine(o);
    }
    
    
}
