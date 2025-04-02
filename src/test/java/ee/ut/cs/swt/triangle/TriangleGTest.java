package ee.ut.cs.swt.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleGTest {

	@Test(timeout = 4000)
	public void testIsIsoscelesAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 3);
	    Triangle triangle1 = triangle0.setSideLengths(1, 3, 1);
	    boolean boolean0 = triangle1.isIsosceles();
	    assertEquals("1,3,1", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsClassify() throws Throwable {
	    Triangle triangle0 = new Triangle(502, 502, 2511);
	    String string0 = triangle0.classify();
	    assertEquals("isossceles", string0);
	    assertEquals(3515, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndSetSideLengthsAndIsIsoscelesReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle((-1478), 0, 1);
	    triangle0.setSideLengths(585, 1944, (-176));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("585,1944,-176", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningZero() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    int int0 = triangle0.getPerimeter();
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 4904, 4904);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals("3,4904,4904", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 3);
	    Triangle triangle1 = triangle0.setSideLengths(1, 3, 1);
	    double double0 = triangle1.getArea();
	    assertEquals(5, triangle0.getPerimeter());
	    assertEquals(Double.NaN, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereIsRightAngledIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle((-1421), 0, 0);
	    triangle0.setSideLengths(1306, 0, 1306);
	    double double0 = triangle0.getArea();
	    assertEquals("1306,0,1306", triangle0.getSideLengths());
	    assertEquals((-1.0), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-955), 0);
	    assertEquals("0,-955,0", triangle0.getSideLengths());
	    triangle0.setSideLengths(0, 0, 0);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    Triangle triangle1 = triangle0.setSideLengths(306, 3352, 3769);
	    double double0 = triangle1.getArea();
	    assertFalse(triangle0.isImpossible());
	    assertEquals(44291.94626565873, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereGetAreaIsZero() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 3);
	    Triangle triangle1 = triangle0.setSideLengths(3, 3, 1);
	    String string0 = triangle1.classify();
	    assertEquals(0.0, triangle0.getArea(), 0.01);
	    assertEquals("isossceles", string0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereGetPerimeterIsNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    Triangle triangle1 = triangle0.setSideLengths((-1411), 3, (-883));
	    boolean boolean0 = triangle1.isScalene();
	    assertFalse(triangle0.isIsosceles());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndIsIsoscelesReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle((-1478), 0, 1);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertFalse(boolean0);
	    assertEquals((-1477), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsEquilateral() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-1189914439), (-1189914439));
	    boolean boolean0 = triangle0.isEquilateral();
	    assertEquals(1915138418, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsEquilateral() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 3);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(boolean0);
	    assertEquals(2.0, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetPerimeter() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths((-827), (-2671), (-1));
	    int int0 = triangle0.getPerimeter();
	    assertTrue(triangle0.isScalene());
	    assertEquals((-3499), int0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 3);
	    String string0 = triangle0.getSideLengths();
	    assertEquals("3,3,3", string0);
	}

	@Test(timeout = 4000)
	public void testClassify0() throws Throwable {
	    Triangle triangle0 = new Triangle(502, 502, 2511);
	    String string0 = triangle0.classify();
	    assertEquals("isossceles", string0);
	    assertEquals(3515, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testClassify1() throws Throwable {
	    Triangle triangle0 = new Triangle(1042, 1042, (-3084));
	    String string0 = triangle0.classify();
	    assertEquals("1042,1042,-3084", triangle0.getSideLengths());
	    assertEquals("impossible", string0);
	}

	@Test(timeout = 4000)
	public void testIsImpossibleReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(306, 3352, 3769);
	    boolean boolean0 = triangle0.isImpossible();
	    assertFalse(triangle0.isIsosceles());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(1787, 1, 3);
	    triangle0.classify();
	    assertFalse(triangle0.isIsosceles());
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 4904, 4904);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals("3,4904,4904", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testClassify2() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 3);
	    String string0 = triangle0.classify();
	    assertEquals("equilateral", string0);
	}

	@Test(timeout = 4000)
	public void testClassify3() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3205, 3205);
	    String string0 = triangle0.classify();
	    assertEquals("scalene", string0);
	    assertEquals("3,3205,3205", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereGetAreaIsPositive() throws Throwable {
	    Triangle triangle0 = new Triangle((-1478), 0, 1);
	    triangle0.setSideLengths(2, 2, 686);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals("2,2,686", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-955), 0);
	    double double0 = triangle0.getArea();
	    assertEquals((-1.0), double0, 0.01);
	    assertEquals("0,-955,0", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    Triangle triangle1 = triangle0.setSideLengths(0, 0, 191);
	    boolean boolean0 = triangle1.isRightAngled();
	    assertEquals(191, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsImpossibleAndSetSideLengths1() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    triangle0.setSideLengths(1, (-969), 1115);
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals(147, triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsImpossibleAndSetSideLengths0() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    triangle0.setSideLengths((-969), (-969), (-2816));
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals((-4754), triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningZero() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 3);
	    triangle0.setSideLengths(1, 1, 1);
	    double double0 = triangle0.getArea();
	    assertEquals("1,1,1", triangle0.getSideLengths());
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsImpossible() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(306, 3352, 3769);
	    boolean boolean0 = triangle0.isImpossible();
	    assertFalse(triangle0.isIsosceles());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsRightAngled() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    Triangle triangle1 = triangle0.setSideLengths(0, 0, 191);
	    boolean boolean0 = triangle1.isRightAngled();
	    assertEquals(191, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetPerimeter() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    int int0 = triangle0.getPerimeter();
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testClassify() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(1787, 1, 3);
	    triangle0.classify();
	    assertFalse(triangle0.isIsosceles());
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 3);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(boolean0);
	    assertEquals(2.0, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereGetPerimeterIsNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(0, (-533), (-533));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals((-1066), triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsEquilateralAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(0, (-709), 1);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(triangle0.isScalene());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle((-1478), 0, 1);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertFalse(boolean0);
	    assertEquals((-1477), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle((-1478), 0, 1);
	    triangle0.setSideLengths(585, 1944, (-176));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("585,1944,-176", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    int int0 = triangle0.getPerimeter();
	    assertEquals(3, int0);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsWithZero() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(3, 191, 0);
	    boolean boolean0 = triangle0.isImpossible();
	    assertFalse(triangle0.isIsosceles());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths((-827), (-2671), (-1));
	    int int0 = triangle0.getPerimeter();
	    assertTrue(triangle0.isScalene());
	    assertEquals((-3499), int0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengthsAndSetSideLengthsWithNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(3352, (-1324), 1404);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals("3352,-1324,1404", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereIsEquilateralIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 3);
	    triangle0.setSideLengths((-2143922319), 3, (-2143922319));
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals(7122661, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 3);
	    String string0 = triangle0.getSideLengths();
	    assertEquals("3,3,3", string0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndIsIsoscelesReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 2);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("3,3,2", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-955), 0);
	    double double0 = triangle0.getArea();
	    assertEquals((-1.0), double0, 0.01);
	    assertEquals("0,-955,0", triangle0.getSideLengths());
	}

}