package org.adligo.i.ctx4jse.shared;

import java.util.Collection;
import java.util.Map;

/**
 * This class provides Tests4j like assertion methods, which throw
 * {@link IllegalArgumentException}s.  You may use this in the public static way, 
 * however the I_Check interface allows you to mixin these methods. <br/>
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
public class Check {

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
  public static final String THE_COLLECTION_MUST_CONTAIN = "The Collection MUST contain;\n";
  public static final String THE_MAP_MUST_CONTAIN_KEY = "The Map MUST contain key;\n";
  public static final String THE_MAP_MUST_CONTAIN_VALUE = "The Map MUST contain value;\n";

  public static final String THE_COLLECTION_MUST_NOT_CONTAIN = "The Collection MUST NOT contain;\n";
  public static final String THE_MAP_MUST_NOT_CONTAIN_KEY = "The Map MUST NOT contain key;\n";
  public static final String THE_MAP_MUST_NOT_CONTAIN_VALUE = "The Map MUST NOT contain value;\n";
  public static final String TRUE_IS_REQUIRED = "True is required at this point.\n";
  
  public static final String QUOTE_NEW_LINE = "'\n";
  
  public static String assembleActualLine(Object actual) {
    if (actual == null) {
      return ACTUAL_NULL_LINE;
    }
    return ACTUAL_START_LINE + actual + QUOTE_NEW_LINE;
  }

  public static String assembleExpectedLine(Object expected) {
    if (expected == null) {
      return EXPECTED_NULL_LINE;
    }
    return EXPECTED_START_LINE + expected + QUOTE_NEW_LINE;
  }

  /**
   * This method asserts that the actual parameter is contained
   * in the collection.
   * 
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public static <O> O contains(Collection<O> collection, O actual) {
    if (collection.contains(actual)) {
      return actual;
    }
    throw new IllegalArgumentException(THE_COLLECTION_MUST_CONTAIN +
        assembleActualLine(actual));
  }

  /**
   * This method asserts that the actual parameter is contained
   * in the collection.
   * @param message the failure message
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public static <O> O contains(String message, Collection<O> collection, O actual) {
    if (collection.contains(actual)) {
      return actual;
    }
    throw new IllegalArgumentException(message + NEW_LINE +
        assembleActualLine(actual));
  }

  /**
   * This method asserts that the actual parameter is contained
   * in the map.
   * 
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public static <O,V> O containsKey(Map<O,V> map, O actual) {
    if (map.containsKey(actual)) {
      return actual;
    }
    throw new IllegalArgumentException(THE_MAP_MUST_CONTAIN_KEY +
        assembleActualLine(actual));
  }

  /**
   * This method asserts that the actual parameter is contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public static <O,V> O containsKey(String message, Map<O,V> map, O actual) {
    if (map.containsKey(actual)) {
      return actual;
    }
    throw new IllegalArgumentException(message + NEW_LINE +
        assembleActualLine(actual));
  }

  /**
   * This method asserts that the actual parameter is contained
   * in the map.
   * 
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public static <K, O> O containsValue(Map<K,O> map, O actual) {
    if (map.containsValue(actual)) {
      return actual;
    }
    throw new IllegalArgumentException(THE_MAP_MUST_CONTAIN_VALUE +
        assembleActualLine(actual));
  }

  /**
   * This method asserts that the actual parameter is contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public static <K, O> O containsValue(String message, Map<K,O> map, O actual) {
    if (map.containsValue(actual)) {
      return actual;
    }
    throw new IllegalArgumentException(message + NEW_LINE +
        assembleActualLine(actual));
  }
  
  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public static <O> O equals(Object expected, O actual) {
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
  public static <O> O equals(String message, Object expected, O actual) {
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
  public static String equals(String expected, String actual){
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
  public static String equals(String message, String expected, String actual){
    //throw NPE on expected intentionally
    if (expected.equals(actual)) {
      return actual;
    }
    throw new IllegalArgumentException(message +
        assembleActualLine(actual) + assembleExpectedLine(expected));
  }

  public static void isFalse(boolean actual){
    if (actual) {
      throw new IllegalArgumentException(FALSE_IS_REQUIRED);
    }
    return;
  }

  public static void isFalse(String message, boolean actual){
    if (actual) {
      throw new IllegalArgumentException(message);
    }
    return;
  }

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the collection.
   * 
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public static <O> O notContains(Collection<O> collection, O actual) {
    if (collection.contains(actual)) {
      throw new IllegalArgumentException(THE_COLLECTION_MUST_NOT_CONTAIN +
          assembleActualLine(actual));
    }
    return actual;
  }

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the collection.
   * @param message the failure message
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public static <O> O notContains(String message, Collection<O> collection, O actual) {
    if (collection.contains(actual)) {
      throw new IllegalArgumentException(message + NEW_LINE +
          assembleActualLine(actual));
    }
    return actual;
  }

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the map.
   * 
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public static <O,V> O notContainsKey(Map<O,V> map, O actual) {
    if (map.containsKey(actual)) {
      throw new IllegalArgumentException(THE_MAP_MUST_NOT_CONTAIN_KEY +
          assembleActualLine(actual));
    }
    return actual;
  }

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public static <O,V> O notContainsKey(String message, Map<O,V> map, O actual) {
    if (map.containsKey(actual)) {
      throw new IllegalArgumentException(message + NEW_LINE +
          assembleActualLine(actual));
    }
    return actual;
  }

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the map.
   * 
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public static <K, O> O notContainsValue(Map<K,O> map, O actual) {
    if (map.containsValue(actual)) {
      throw new IllegalArgumentException(THE_MAP_MUST_NOT_CONTAIN_VALUE +
          assembleActualLine(actual));
    }
    return actual;
  }

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public static <K, O> O notContainsValue(String message, Map<K,O> map, O actual) {
    if (map.containsValue(actual)) {
      throw new IllegalArgumentException(message + NEW_LINE +
          assembleActualLine(actual));
    }
    return actual;
  }

  /**
   * 
   * @param actual
   * @return the actual parameter
   */
  public static String notEmpty(String actual){
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
  public static String notEmpty(String message, String actual){
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
  public static <O> O  notNull(O actual){
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
  public static <O> O notNull(String message, O actual){
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
  public static <O> O notEquals(Object expected, O actual){
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
  public static <O> O notEquals(String message, Object expected, O actual) {
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
  public static String notEquals(String expected, String actual) {
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
  public static String notEquals(String message, String expected, String actual) {
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
  public static <O> O  notSame(Object expected, O actual) {
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
  public static <O> O notSame(String message, Object expected, O actual) {
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
  public static <O> O same(Object expected, O actual) {
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
  public static <O> O same(String message, Object expected, O actual) {
    //throw NPE on expected intentionally
    if (expected == actual) {
      return actual;
    }
    throw new IllegalArgumentException(message +
        assembleActualLine(actual) + assembleExpectedLine(expected));
  }

  public static void isTrue(boolean actual) {
    if (actual) {
      return;
    }
    throw new IllegalArgumentException(TRUE_IS_REQUIRED);
  }

  public static void isTrue(String message, boolean actual) {
    if (actual) {
      return;
    }
    throw new IllegalArgumentException(TRUE_IS_REQUIRED);
  }
}
