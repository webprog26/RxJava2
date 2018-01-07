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
public class ObservableMerge implements ObservablesCombiner{

    @Override
    public void combine(Observable o, Observable o1) {
     Observable.merge(o, o1)
                .subscribe(i -> System.out.println("Received " + i));
    }

    
    
    
}
