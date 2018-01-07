/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combiningobservables;

import io.reactivex.Observable;
import org.reactivestreams.Publisher;

/**
 *
 * @author webprog26
 */
public class CombiningObservables {
   
    private static final Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
    private static final Observable<String> source2 = Observable.just("Zeta", "Eta", "Theta");
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObservablesCombiner merge = new ObservableMerge();
        merge.combine(source, source2);
    }
    
}
