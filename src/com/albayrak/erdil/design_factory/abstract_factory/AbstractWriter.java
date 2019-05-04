package com.albayrak.erdil.design_factory.abstract_factory;

import com.albayrak.erdil.oca.expcetions.MyNotImplementedException;

public abstract class AbstractWriter implements IWriter {

    private String name;

    public AbstractWriter() {
        name = "default_name";
    }

    public AbstractWriter(final String name) {
        this.name = name;
    }

    @Override
    public void write(String text) {
        throw new MyNotImplementedException();
    }

    public String getName() {
        return name;
    }
}
