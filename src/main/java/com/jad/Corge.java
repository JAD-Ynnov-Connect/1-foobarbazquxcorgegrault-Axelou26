package com.jad;

public class Corge {
    private Foo foo;


    public Corge(final Foo foo) {
        this.foo = foo;
        if (foo.getCorge() != this) {
            foo.setCorge(this);
        }
    }


    public Foo getFoo() {
        return this.foo;
    }


    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}



