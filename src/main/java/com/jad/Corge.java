package com.jad;

public class Corge {
    private Foo foo; // Référence à l'objet Foo


    public Corge(final Foo foo) {
        setFoo(foo);
    }


    public Foo getFoo() {
        return this.foo;
    }


    public void setFoo(Foo foo) {

        if (this.foo == foo) {
            return;
        }


        if (this.foo != null) {
            this.foo.setCorge(null); // Déconnecte l'ancien Corge de Foo
        }

        this.foo = foo;


        if (foo != null && foo.getCorge() != this) {
            foo.setCorge(this); // Établit l'association bidirectionnelle avec Foo
        }
    }
}





