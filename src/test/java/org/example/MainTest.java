package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void addTest() {
        Assertions.assertEquals(5, Main.add(2, 3));
        Assertions.assertEquals(10, Main.add(5, 5));
    }
}

