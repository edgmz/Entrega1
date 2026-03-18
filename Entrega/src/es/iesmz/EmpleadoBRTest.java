package es.iesmz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoBRTest {
    EmpleadoBR e = new EmpleadoBR();

    // calculaSalarioNeto (2000) == 1640
    @Test
    void test1() {
        assertEquals(1640, e.calculaSalarioNeto(2000));
    }

    // calculaSalarioNeto (1500) == 1230
    @Test
    void test2() {
        assertEquals(1230, e.calculaSalarioNeto(1500));
    }

    // calculaSalarioNeto (1499.99) == 1259.9916
    @Test
    void test3() {
        assertEquals(1259.9916f, e.calculaSalarioNeto(1499.99));
    }

    // calculaSalarioNeto (1250) == 1050
    @Test
    void test4() {
        assertEquals(1050, e.calculaSalarioNeto(1250));
    }

    // calculaSalarioNeto (1000) == 840
    @Test
    void test5() {
        assertEquals(840, e.calculaSalarioNeto(1000));
    }

    // calculaSalarioNeto (999.99) == 999.99
    @Test
    void test6() {
        assertEquals(999.99f, e.calculaSalarioNeto(999.99));
    }

    // calculaSalarioNeto (500) == 500
    @Test
    void test7() {
        assertEquals(500, e.calculaSalarioNeto(500));
    }

    @Test
    void test8() {
        assertEquals(0, e.calculaSalarioNeto(0));
    }

    @Test
    void test9() {
        assertEquals(-1, e.calculaSalarioNeto(-1));
    }

    // calculaSalarioBruto (venedor, 2000 euros, 8h) == 1360
    @Test
    void test10() {
        assertEquals(1360, e.calculaSalarioBruto(EmpleadoBR.Tipoempleado.veneder, 2000, 8));
    }

    // calculaSalarioBruto (venedor, 1500 euros, 3h) == 1260
    @Test
    void test11() {
        assertEquals(1260, e.calculaSalarioBruto(EmpleadoBR.Tipoempleado.veneder, 1500, 3));
    }

    // calculaSalarioBruto (venedor, 1499.99 euros, 0h) == 1100
    @Test
    void test12() {
        assertEquals(1100, e.calculaSalarioBruto(EmpleadoBR.Tipoempleado.veneder, 1499.99F, 0));
    }

    // calculaSalarioBruto (encarregat, 1250 euros, 8h) == 1760
    @Test
    void test13() {
        assertEquals(1760, e.calculaSalarioBruto(EmpleadoBR.Tipoempleado.encarregat, 1250, 8));
    }

    // calculaSalarioBruto (encarregat, 1000 euros, 0h) == 1600
    @Test
    void test14() {
        assertEquals(1600, e.calculaSalarioBruto(EmpleadoBR.Tipoempleado.encarregat, 1000, 0));
    }

    // calculaSalarioBruto (encarregat, 999.99 euros, 3h) == 1560
    @Test
    void test15() {
        assertEquals(1560, e.calculaSalarioBruto(EmpleadoBR.Tipoempleado.encarregat, 999.99F, 3));
    }

    // calculaSalarioBruto (encarregat, 500 euros, 0h) == 1500
    @Test
    void test16() {
        assertEquals(1500, e.calculaSalarioBruto(EmpleadoBR.Tipoempleado.encarregat, 500, 0));
    }

    // calculaSalarioBruto (encarregat, 0 euros, 8h) == 1660
    @Test
    void test17() {
        assertEquals(1660, e.calculaSalarioBruto(EmpleadoBR.Tipoempleado.encarregat, 0, 8));
    }

    // calculaSalarioBruto (venedor, -1 euros, 8h) == -1
    @Test
    void test18() {
        assertEquals(-1, e.calculaSalarioBruto(EmpleadoBR.Tipoempleado.veneder, -1, 8));
    }

    // calculaSalarioBruto (venedor, 1500 euros, -1h) == -1
    @Test
    void test19() {
        assertEquals(-1, e.calculaSalarioBruto(EmpleadoBR.Tipoempleado.veneder, 1500, -1));
    }

    // calculaSalarioBruto (null, 1500 euros, 8h) == -1
    @Test
    void test20() {
        assertEquals(-1, e.calculaSalarioBruto(null, 1500, 8));
    }
}
