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
public abstract class AbstractCombiner implements ObservablesCombiner{

    @Override
    public void combine(Observable o, Observable o1) {}

    @Override
    public void combine(Observable<String> o) {}
}
