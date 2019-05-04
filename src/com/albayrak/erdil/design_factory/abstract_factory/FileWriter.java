package com.albayrak.erdil.design_factory.abstract_factory;

public class FileWriter extends AbstractWriter {

    private static final String STORING_TEXT_TO_FILE_MESSAGE = "storing the '%s' text to file";
    private String fileName;

    public FileWriter(final String name) {
        super(name);
        this.fileName = name + ".txt";
    }

    public void write(final String text) {
        System.out.println(String.format(STORING_TEXT_TO_FILE_MESSAGE, text));
    }

    public String getFileName() {
        return fileName;
    }
}
