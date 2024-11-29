package com.jad;

public class Corge {
    private Foo foo;

    public Corge(Foo foo) {
        setFoo(foo);
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        if (this.foo != null) {
            this.foo.setCorge(null);
        }
        this.foo = foo;
        if (foo != null && foo.getCorge() != this) {
            foo.setCorge(this);
        }
    }
}
