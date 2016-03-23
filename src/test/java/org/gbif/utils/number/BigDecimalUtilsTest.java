package org.gbif.utils.number;

import java.math.BigDecimal;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 *
 * Utility class to work with BigDecimal
 *
 */
public class BigDecimalUtilsTest {

  /**
   * This test is simply to illustrate why we use the BigDecimal(String) constructor.
   * new BigDecimal(23.1) equals 23.10000000000000142108547152020037174224853515625
   */
  @Test
  public void testBigDecimalConstructor(){
    assertFalse(new BigDecimal(23.1d).equals(new BigDecimal("23.1")));
  }

  @Test
  public void testFromDouble(){
    assertEquals(new BigDecimal("23.4"), BigDecimalUtils.fromDouble(23.4, true));
    assertEquals(new BigDecimal("23"), BigDecimalUtils.fromDouble(23.0, true));
    assertEquals(new BigDecimal("23.0"), BigDecimalUtils.fromDouble(23.0, false));
    assertEquals(new BigDecimal("23"), BigDecimalUtils.fromDouble(23.0000000000, true));
    assertEquals(new BigDecimal("23.000000000001"), BigDecimalUtils.fromDouble(23.000000000001, true));
  }

}