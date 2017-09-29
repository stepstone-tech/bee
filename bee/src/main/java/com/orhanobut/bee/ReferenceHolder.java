package com.orhanobut.bee;

/**
 * Created by Piotr Bandurski <piotr.bandurski@valueadd.pl> on 29/09/2017.
 */

public class ReferenceHolder<T> {

    public T reference;

    public ReferenceHolder(T reference) {
        this.reference = reference;
    }

}
