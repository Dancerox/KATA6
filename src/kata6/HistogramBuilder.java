/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class HistogramBuilder <T> {

    private final ArrayList<T> lista;

    public HistogramBuilder(ArrayList<T> lista) {
        this.lista = lista;
    }
    
    public <A> Histogram<A> build(Attribute<T,A> attribute) {
        Histogram<A> histo = new Histogram<>();
        for (T lista1 : lista) {
            A value = attribute.get(lista1);
            histo.increment(value);
        }
        return histo;
    }
}
