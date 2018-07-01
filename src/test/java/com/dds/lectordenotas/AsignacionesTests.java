package com.dds.lectordenotas;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AsignacionesTests {

    @Test
    public void arraysAsListGeneraUnaListaVaciaSinArgumentos() {
        assertEquals(0, Arrays.asList().size());
    }
}
