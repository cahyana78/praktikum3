package org.d3ifcool.ima03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestJurnal02 {

    private static final String[] INPUT = {
            "Implementasi Algoritma\n6"
    };
    private static final String[] OUTPUT = {
            "Aku suka kuliah Implementasi Algoritma.\nKuliah 6 jam per minggu rasanya kurang.\nTambahin dong jadi 12 jam per minggu :)" 
    };

    @Test
    public void testJurnal() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        for (int i = 0; i < INPUT.length; i++) {
            System.setIn(new ByteArrayInputStream(INPUT[i].getBytes()));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(bos));

            Jurnal02.main(null);

            assertEquals(OUTPUT[i] + "\n", bos.toString());
        }

        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
