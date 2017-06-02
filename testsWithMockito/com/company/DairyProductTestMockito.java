package com.company;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by pbarna on 2017.06.01..
 */
class DairyProductTestMockito {
    @Test
    void getType() {
        DairyProduct dairyProduct = Mockito.mock(DairyProduct.class);
        DairyProduct mizo = new DairyProduct("Budget Milk", 1, DairyProduct.Type.COW, LocalDate.of(2017,05,30));
        Mockito.when(dairyProduct.getType()).thenReturn(DairyProduct.Type.COW);
        assertEquals(mizo.getType(), DairyProduct.Type.COW);
    }

    @Test
    void getExpDate() {
        DairyProduct dairyProduct = Mockito.mock(DairyProduct.class);
        DairyProduct mizo = new DairyProduct("Budget Milk", 1, DairyProduct.Type.COW, LocalDate.of(2017,05,30));
        Mockito.when(dairyProduct.getExpDate()).thenReturn(mizo.getExpDate());
        assertEquals(mizo.getExpDate(), LocalDate.of(2017, 05, 30));
    }

    @Test
    void dairyExpired() {
        DairyProduct dairyProduct = Mockito.mock(DairyProduct.class);
        DairyProduct mizo = new DairyProduct("Budget Milk", 1, DairyProduct.Type.COW, LocalDate.of(2017,05,30));
        Mockito.when(dairyProduct.dairyExpired()).thenReturn(true);
        assertEquals(mizo.dairyExpired(), true);
    }

}