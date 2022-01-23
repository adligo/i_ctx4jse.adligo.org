package org.adligo.i.ctx4jse.shared;

import java.util.Objects;

/**
 * This mixin provides Tests4j like assertion methods, which throw
 * {@link IllegalArgumentException}s.  Implementing (really extending this mixin) 
 * are NOT intended to be used in a testing framework, but instead intended
 * to provide Secure Code style assertions about parameters this follows
 * the {@link Objects#requireNonNull(Object)} method pattern.  However
 * this class (yep it's compiled into a bytecode .class file :) ) 
 * reduces the necessary typing by using the mixin style.<br/>
 *   Also note that String.format is NOT used to to some incompatibility issues
 * with some tools that this code is designed to work with.
 * @author scott
 * <pre><code>
 *  ---------------- Apache ICENSE-2.0 --------------------------
 *
 * Copyright 2022 Adligo Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </code></pre>
 */
public interface Check {

  public static final String ACTUAL_START_LINE = "\tactual: '";
  public static final String ACTUAL_NULL_LINE = "\tactual: null \n";
  public static final String EXPECTED_START_LINE = "\texpected: '";
  public static final String EXPECTED_NULL_LINE = "\texpected: null \n";
  public static final String FALSE_IS_REQUIRED = "False is required at this point.\n";
  public static final String NEW_LINE = "\n";
  public static final String THE_ACTUAL_IS_EMPTY = "The actual is empty.";
  public static final String THE_ACTUAL_IS_NOT_EQUAL_TO_THE_EXPECTED = "The actual is NOT equal to the expected;\n";
  public static final String THE_ACTUAL_IS_NULL = "The actual is null.";
  public static final String THE_ACTUAL_MUST_NOT_EQUAL_EXPECTED = "The actual MUST NOT equal the expected value;\n";
  public static final String THE_ACTUAL_MUST_BE_THE_SAME_AS_EXPECTED = "The actual MUST NOT be the same as the expected value;\n";
  
  public static final String TRUE_IS_REQUIRED = "True is required at this point.\n";
  
  public static final String QUOTE_NEW_LINE = "'\n";
  
  static String assembleActualLine(Object actual) {
    if (actual == null) {
      return ACTUAL_NULL_LINE;
    }
    return ACTUAL_START_LINE + actual + QUOTE_NEW_LINE;
  }

  static String assembleExpectedLine(Object expected) {
    if (expected == null) {
      return EXPECTED_NULL_LINE;
    }
    return EXPECTED_START_LINE + expected + QUOTE_NEW_LINE;
  }
  
  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object equals(Object expected, Object actual) {
    //throw NPE on expected intentionally
    if (expected.equals(actual)) {
      return actual;
    }
    throw new IllegalArgumentException(THE_ACTUAL_IS_NOT_EQUAL_TO_THE_EXPECTED +
        assembleActualLine(actual) + assembleExpectedLine(expected));
  }

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object equals(String message, Object expected, Object actual) {
    //throw NPE on expected intentionally
    if (expected.equals(actual)) {
      return actual;
    }
    throw new IllegalArgumentException(message +
        assembleActualLine(actual) + assembleExpectedLine(expected));
  }

  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object equals(String expected, String actual){
    //throw NPE on expected intentionally
    if (expected.equals(actual)) {
      return actual;
    }
    throw new IllegalArgumentException(THE_ACTUAL_IS_NOT_EQUAL_TO_THE_EXPECTED +
        assembleActualLine(actual) + assembleExpectedLine(expected));
  }

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object equals(String message, String expected, String actual){
    //throw NPE on expected intentionally
    if (expected.equals(actual)) {
      return actual;
    }
    throw new IllegalArgumentException(message +
        assembleActualLine(actual) + assembleExpectedLine(expected));
  }

  static void isFalse(boolean actual){
    if (actual) {
      throw new IllegalArgumentException(FALSE_IS_REQUIRED);
    }
    return;
  }

  static void isFalse(String message, boolean actual){
    if (actual) {
      throw new IllegalArgumentException(message);
    }
    return;
  }

  /**
   * 
   * @param actual
   * @return the actual parameter
   */
  static String notEmpty(String actual){
    if (actual == null) {
      throw new IllegalArgumentException(THE_ACTUAL_IS_NULL);
    }
    if (actual.trim().length() == 0) {
      throw new IllegalArgumentException(THE_ACTUAL_IS_EMPTY);
    }
    return actual;
  }

  /**
   * 
   * @param message
   * @param actual
   * @return the actual parameter
   */
  static Object notEmpty(String message, String actual){
    if (actual == null) {
      throw new IllegalArgumentException(message);
    }
    if (actual.trim().length() == 0) {
      throw new IllegalArgumentException(message);
    }
    return actual;
  }
  
  /**
   * 
   * @param actual
   * @return the actual parameter
   */
  static Object notNull(Object actual){
    if (actual == null) {
      throw new IllegalArgumentException(THE_ACTUAL_IS_NULL);
    }
    return actual;
  }

  /**
   * 
   * @param message
   * @param actual
   * @return the actual parameter
   */
  static Object notNull(String message, Object actual){
    if (actual == null) {
      throw new IllegalArgumentException(message);
    }
    return actual;
  }

  /**
   * 
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object notEquals(Object expected, Object actual){
    //throw NPE on expected intentionally
    if (expected.equals(actual)) {
      throw new IllegalArgumentException(THE_ACTUAL_MUST_NOT_EQUAL_EXPECTED +
          assembleActualLine(actual) + assembleExpectedLine(expected));
    }
    return actual;
  }

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object notEquals(String message, Object expected, Object actual) {
    //throw NPE on expected intentionally
    if (expected.equals(actual)) {
      throw new IllegalArgumentException(message +
          assembleActualLine(actual) + assembleExpectedLine(expected));
    }
    return actual;
  }

  /**
   * 
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object notEquals(String expected, String actual) {
    //throw NPE on expected intentionally
    if (expected.equals(actual)) {
      throw new IllegalArgumentException(THE_ACTUAL_MUST_NOT_EQUAL_EXPECTED +
          assembleActualLine(actual) + assembleExpectedLine(expected));
    }
    return actual;
  }

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object notEquals(String message, String expected, String actual) {
    //throw NPE on expected intentionally
    if (expected.equals(actual)) {
      throw new IllegalArgumentException(message +
          assembleActualLine(actual) + assembleExpectedLine(expected));
    }
    return actual;
  }

  /**
   * 
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object notSame(Object expected, Object actual) {
    //throw NPE on expected intentionally
    if (expected == actual) {
      throw new IllegalArgumentException(THE_ACTUAL_MUST_BE_THE_SAME_AS_EXPECTED +
          assembleActualLine(actual) + assembleExpectedLine(expected));
    }
    return actual;
  }

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object notSame(String message, Object expected, Object actual) {
    //throw NPE on expected intentionally
    if (expected == actual) {
      throw new IllegalArgumentException(message +
          assembleActualLine(actual) + assembleExpectedLine(expected));
    }
    return actual;
  }

  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object same(Object expected, Object actual) {
    //throw NPE on expected intentionally
    if (expected == actual) {
      return actual;
    }
    throw new IllegalArgumentException(THE_ACTUAL_MUST_BE_THE_SAME_AS_EXPECTED +
        assembleActualLine(actual) + assembleExpectedLine(expected));
  }

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  static Object same(String message, Object expected, Object actual) {
    //throw NPE on expected intentionally
    if (expected == actual) {
      return actual;
    }
    throw new IllegalArgumentException(message +
        assembleActualLine(actual) + assembleExpectedLine(expected));
  }

  static void isTrue(boolean actual) {
    if (actual) {
      return;
    }
    throw new IllegalArgumentException(TRUE_IS_REQUIRED);
  }

  static void isTrue(String message, boolean actual) {
    if (actual) {
      return;
    }
    throw new IllegalArgumentException(TRUE_IS_REQUIRED);
  }
}
