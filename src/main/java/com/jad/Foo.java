package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private final Bar bar;
    private final List<Baz> bazs;
    private final List<Grault> graults;
    private Qux qux;
    private Corge corge;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
        this.graults = new ArrayList<>();
        this.qux = new Qux();
    }

    public Bar getBar() {
        return bar;
    }

    public List<Baz> getBazs() {
        return new ArrayList<>(bazs);
    }

    public void addBaz(Baz baz) {
        bazs.add(baz);
    }

    public List<Grault> getGraults() {
        return new ArrayList<>(graults);
    }

    public void addGrault() {
        Grault grault = new Grault(this); // Création d'un nouveau Grault
        if (!graults.contains(grault)) {
            graults.add(grault); // Ajout dans la liste de Foo
        }
    }

    public void removeGrault(Grault grault) {
        if (graults.contains(grault)) {
            graults.remove(grault); // Retirer de la liste de Foo
            grault.setFoo(null);   // Supprimer la référence bidirectionnelle
        }
    }

    public Qux getQux() {
        return qux;
    }

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
