import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    Triangle triangle = new Triangle();

    @Test
    @DisplayName("Проверка возможности создания при корректных значениях")
    public void canBeTest1() {
        assertTrue(triangle.canBe(3, 5, 7));
    }

    @Test
    @DisplayName("Проверка возможности создания создания при корректных значениях")
    public void canBeTest2() {
        assertTrue(triangle.canBe(5, 5, 5));
    }

    @Test
    @DisplayName("Проверка возможности создания при некорректных значениях (сумма сторон меньше длины одной)")
    public void canBeTest3() {
        assertFalse(triangle.canBe(5, 5, 15));
    }

    @Test
    @DisplayName("Проверка возможности создания при некорректных значениях (отриц. значение)")
    public void canBeTest4() {
        assertFalse(triangle.canBe(5, 5, -5));
    }

    @Test
    @DisplayName("Проверка расчёта при некорректных значениях (длина равна 0)")
    public void areaTest1() {
        assertEquals(-1, (int) triangle.area(0, 5, 5));
    }

    @Test
    @DisplayName("Проверка расчёта при некорректных значениях(суммв двух сторон равна другой")
    public void areaTest2() {
        assertEquals(-1, (int) triangle.area(2, 3, 5));
    }

    @Test
    @DisplayName("Проверка расчёта при корректных значениях")
    public void areaTest3() {
        assertEquals(10, (int) triangle.area(5, 5, 5));
    }
}