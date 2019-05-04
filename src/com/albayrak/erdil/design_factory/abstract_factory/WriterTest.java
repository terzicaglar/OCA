package com.albayrak.erdil.design_factory.abstract_factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WriterTest {

    private static final String TEST_STRING = "test string";
    private static final String TEST_NAME = "test_name";
    private final WriterFactory writerFactory = new WriterFactory(TEST_NAME);
    private AbstractWriter writer;

    @Test
    void testIfNullWriterTypeIsPassedThrowsIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> writerFactory.createWriter(null));
    }

    @Test
    void testIfDatabaseWriterSelectedWritesToDatabase() {
        writer = writerFactory.createWriter(WriterFactory.WriterTypeEnum.DATABASE_WRITER);
        Assertions.assertTrue(writer instanceof DatabaseWriter);
    }

    @Test
    void testIfFileWriterSelectedWritesToFile() {
        writer = writerFactory.createWriter(WriterFactory.WriterTypeEnum.FILE_WRITER);
        Assertions.assertTrue(writer instanceof FileWriter);
    }

    @Test
    void testPolymorphism() {
        writer = writerFactory.createWriter(WriterFactory.WriterTypeEnum.DATABASE_WRITER);
        DatabaseWriter databaseWriter = (DatabaseWriter) writer;
        final IWriter iWriter = writer;
        Assertions.assertThrows(ClassCastException.class, () -> {
            final FileWriter fileWriter = (FileWriter) writer;
        });


        databaseWriter.write(TEST_STRING);
        AbstractWriter abstractWriter = (AbstractWriter) databaseWriter;
        abstractWriter.write(TEST_STRING);

        databaseWriter = new DatabaseWriter("name");
        abstractWriter = (AbstractWriter) databaseWriter;
        abstractWriter.write(TEST_STRING);
    }

}