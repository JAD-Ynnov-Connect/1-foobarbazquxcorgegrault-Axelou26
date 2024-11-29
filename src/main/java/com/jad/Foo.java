package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private final Bar bar; // Composition avec Bar
    private final Qux qux; // Composition avec Qux
    private final List<Baz> bazs; // Agrégation avec Baz
    private Corge corge; // Association bidirectionnelle avec Corge
    private final List<Grault> graults; // Composition avec Grault

    public Foo(Bar bar) {
        this.bar = bar;
        this.qux = new Qux(); // Création interne
        this.bazs = new ArrayList<>();
        this.graults = new ArrayList<>();
    }

    // Getter pour Bar
    public Bar getBar() {
        return bar;
    }

    // Gestion des Bazs (agrégation)
    public List<Baz> getBazs() {
        return new ArrayList<>(bazs); // Retourne une copie pour protéger l'encapsulation
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
        graults.add(new Grault(this)); // Grault est créé par Foo et lié à Foo
    }

    // Gestion de Corge (bidirectionnelle)
    public Corge getCorge() {
        return corge;
    }

    public void setCorge(Corge corge) {
        if (this.corge != null) {
            this.corge.setFoo(null); // Déconnexion de l'ancien Corge
        }
        this.corge = corge;
        if (corge != null) {
            corge.setFoo(this); // Association bidirectionnelle
        }
    }
}
