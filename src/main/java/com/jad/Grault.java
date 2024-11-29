package com.jad;

public class Grault {
    private final Foo foo;

    public Grault(Foo foo) {
        this.foo = foo; // Composition stricte, Grault est lié à Foo
    }

    public Foo getFoo() {
        return foo;
    }
}



