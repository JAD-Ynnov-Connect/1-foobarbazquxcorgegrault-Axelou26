package com.jad;

import java.util.List;
import java.util.ArrayList;

public class Foo {
    private final Bar bar;
    private final List<Baz> bazs;
    private final Qux qux;
    private Corge corge;
    private final List<Grault> graults;


    public Foo(final Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
        this.qux = new Qux();
        this.graults = new ArrayList<>();
    }


    public List<Baz> getBazs() {
        return new ArrayList<>(this.bazs); // Retourne une copie de la liste
    }


    public void addBaz(final Baz baz) {
        this.bazs.add(baz); // Ajoute le Baz à la liste
    }


    public Qux getQux() {
        return this.qux; // Retourne l'objet Qux
    }


    public List<Grault> getGraults() {
        return new ArrayList<>(this.graults);
    }


    public void addGrault() {
        this.graults.add(new Grault(this)); // Création d'un Grault et ajout à la liste
    }


    public Corge getCorge() {
        return this.corge;
    }


    public void setCorge(final Corge firstCorge) {
        if (this.corge == firstCorge) {
            return;
        }

        if (this.corge != null) {
            this.corge.setFoo(null);
        }

        this.corge = firstCorge;

        if (firstCorge != null && firstCorge.getFoo() != this) {
            firstCorge.setFoo(this);
        }
    }


    public Bar getBar() {
        return this.bar;
    }
}
