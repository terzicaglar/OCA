package com.albayrak.erdil.design_factory.abstract_factory;

public class WriterFactory {

    private final String name;

    public WriterFactory(final String name) {
        this.name = name;
    }

    public AbstractWriter createWriter(final WriterTypeEnum writerType) {
        if (WriterTypeEnum.FILE_WRITER.equals(writerType)) {
            return new FileWriter(name);
        } else if (WriterTypeEnum.DATABASE_WRITER.equals(writerType)) {
            return new DatabaseWriter(name);
        } else {
            throw new IllegalArgumentException(String.format("Illegeal arguement of writer type: %s", writerType));
        }
    }

    public enum WriterTypeEnum {
        FILE_WRITER, DATABASE_WRITER;
    }
}
