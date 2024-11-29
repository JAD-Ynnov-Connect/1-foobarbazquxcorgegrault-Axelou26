package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private final Bar bar; 
    private final Qux qux;
    private final List<Baz> bazs;
    private Corge corge;
    private final List<Grault> graults;

    public Foo(Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
        this.bazs = new ArrayList<>();
        this.graults = new ArrayList<>();
    }

    // Getter pour Bar
    public Bar getBar() {
        return bar;
    }

    // Gestion des Bazs (agrégation)
    public List<Baz> getBazs() {
        return new ArrayList<>(bazs);
    }

    public void addBaz(Baz baz) {
        if (baz != null) {
            bazs.add(baz);
        }
    }

    // Getter pour Qux
    public Qux getQux() {
        return qux;
    }

    // Gestion des Graults (composition)
    public List<Grault> getGraults() {
        return new ArrayList<>(graults);
    }

    public void addGrault() {
        graults.add(new Grault(this));
    }

    // Gestion de Corge (bidirectionnelle)
    public Corge getCorge() {
        return corge;
    }

    public void setCorge(Corge corge) {
        if (this.corge != null) {
            this.corge.setFoo(null);
        }
        this.corge = corge;
        if (corge != null) {
            corge.setFoo(this);
        }
    }
}
