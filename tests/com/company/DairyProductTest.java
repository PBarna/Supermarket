package com.company;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by pbarna on 2017.05.31..
 */
class DairyProductTest {


    @Test
    void dairyExpired() {
        DairyProduct mizo = new DairyProduct("Budget Milk", 1, DairyProduct.Type.COW, LocalDate.of(2017,05,30));
        assertEquals(mizo.dairyExpired(), true);
    }

    @Test
    void getExpDate() {
        DairyProduct mizo = new DairyProduct("Budget Milk", 1, DairyProduct.Type.COW, LocalDate.of(2017,05,30));
        assertEquals(mizo.getExpDate(), LocalDate.of(2017, 05, 30));
    }

    @Test
    void getType() {
        DairyProduct mizo = new DairyProduct("Budget Milk", 1, DairyProduct.Type.COW, LocalDate.of(2017,05,30));
        assertEquals(mizo.getType(), DairyProduct.Type.COW);
    }
}