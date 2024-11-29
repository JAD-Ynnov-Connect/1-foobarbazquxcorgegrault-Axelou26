package com.jad;

import java.util.List;
import java.util.ArrayList;

public class Foo {
    private final Bar bar;
    private final List<Baz> bazs = new ArrayList<>();
    private final Qux qux;
    private Corge corge;
    private final List<Grault> graults = new ArrayList<>();


    public Foo(final Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
    }


    public List<Baz> getBazs() {
        return this.bazs;
    }


    public void addBaz(final Baz baz) {
        this.bazs.add(baz);
    }


    public Qux getQux() {
        return this.qux;
    }


    public List<Grault> getGraults() {
        return this.graults;
    }


    public void addGrault() {
        this.graults.add(new Grault(this));
    }


    public Corge getCorge() {
        return this.corge;
    }


    public void setCorge(final Corge firstCorge) {
        if (this.corge == firstCorge) {
            return;
        }

        if (this.corge != null) {
            Corge oldCorge = this.corge;
            this.corge = null;
            oldCorge.setFoo(null);
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
