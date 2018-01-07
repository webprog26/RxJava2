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
public class ObservableZip extends AbstractCombiner{

    @Override
    public void combine(Observable o, Observable o1) {
        Observable.zip(o, o1, (s, i) -> s + "-" + i)
                .subscribe(System.out::println);
        super.combine(o, o1); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
