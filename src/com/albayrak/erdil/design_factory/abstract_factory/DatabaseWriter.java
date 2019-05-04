package com.albayrak.erdil.design_factory.abstract_factory;

public class DatabaseWriter extends AbstractWriter {

    private static final String STORING_TEXT_TO_DATABASE_MESSAGE = "storing the '%s' text to database";
    private String databaseName;

    public DatabaseWriter(final String name) {
        super(name);
        this.databaseName = name + "_database";
    }

    @Override
    public void write(String text) {
        System.out.println(String.format(STORING_TEXT_TO_DATABASE_MESSAGE, text));
    }

    public String getDatabaseName() {
        return databaseName;
    }
}
