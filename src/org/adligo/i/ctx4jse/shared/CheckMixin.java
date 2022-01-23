package org.adligo.i.ctx4jse.shared;

import java.util.Collection;
import java.util.Map;
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
public interface CheckMixin {


  /**
   * This method asserts that the actual parameter is contained
   * in the collection.
   * 
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public static <O> O contains(Collection<O> collection, O actual) {
    return Check.contains(collection, actual);
  }

  /**
   * This method asserts that the actual parameter is contained
   * in the collection.
   * @param message the failure message
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public default <O> O contains(String message, Collection<O> collection, O actual) {
    return Check.contains(message, collection, actual);
  }

  /**
   * This method asserts that the actual parameter is contained
   * in the map.
   * 
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public default <O,V> O containsKey(Map<O,V> map, O actual) {
    return Check.containsKey(map, actual);
  }

  /**
   * This method asserts that the actual parameter is contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public default <O,V> O containsKey(String message, Map<O,V> map, O actual) {
    return Check.containsKey(message, map, actual);
  }

  /**
   * This method asserts that the actual parameter is contained
   * in the map.
   * 
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public default <K, O> O containsValue(Map<K,O> map, O actual) {
    return Check.containsValue(map, actual);
  }

  /**
   * This method asserts that the actual parameter is contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public default <K, O> O containsValue(String message, Map<K,O> map, O actual) {
    return Check.containsValue(message,map, actual);
  }
  
  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default <O> O equals(Object expected, O actual) {
    return Check.equals(expected, actual);
  }

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default <O> O equals(String message, Object expected, O actual) {
    return Check.equals(message, expected, actual);
  }

  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default String equals(String expected, String actual){
    return Check.equals(expected, actual);
  }

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default String equals(String message, String expected, String actual){
    return Check.equals(message, expected, actual);
  }

  default void isFalse(boolean actual){
    Check.isFalse(actual);
  }

  default void isFalse(String message, boolean actual){
    Check.isFalse(message, actual);
  }


  /**
   * This method asserts that the actual parameter is NOT contained
   * in the collection.
   * 
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public default <O> O notContains(Collection<O> collection, O actual) {
    return Check.notContains(collection, actual);
  }

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the collection.
   * @param message the failure message
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public default <O> O notContains(String message, Collection<O> collection, O actual) {
    return Check.notContains(message, collection, actual);
  }

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the map.
   * 
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public default <O,V> O notContainsKey(Map<O,V> map, O actual) {
    return Check.notContainsKey(map, actual);
  }

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public default <O,V> O notContainsKey(String message, Map<O,V> map, O actual) {
    return Check.notContainsKey(message, map, actual);
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
    return Check.notContainsValue(map, actual);
  }

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public default <K, O> O notContainsValue(String message, Map<K,O> map, O actual) {
    return Check.notContainsValue(message, map, actual);
  }

  /**
   * 
   * @param actual
   * @return the actual parameter
   */
  default String notEmpty(String actual){
    return Check.notEmpty(actual);
  }

  /**
   * 
   * @param message
   * @param actual
   * @return the actual parameter
   */
  default String notEmpty(String message, String actual){
    return Check.notEmpty(message, actual);
  }
  
  /**
   * 
   * @param actual
   * @return the actual parameter
   */
  default <O> O notNull(O actual){
    return Check.notNull(actual);
  }

  /**
   * 
   * @param message
   * @param actual
   * @return the actual parameter
   */
  default <O> O notNull(String message, O actual){
    return Check.notNull(message, actual);
  }

  /**
   * 
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default <O> O notEquals(Object expected, O actual){
    return Check.notEquals(expected, actual);
  }

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default <O> O notEquals(String message, Object expected, O actual) {
    return Check.notEquals(message, expected, actual);
  }

  /**
   * 
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default String notEquals(String expected, String actual) {
    return Check.notEquals(expected, actual);
  }

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default String notEquals(String message, String expected, String actual) {
    return Check.notEquals(message, expected, actual);
  }

  /**
   * 
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default <O> O notSame(Object expected, O actual) {
    return Check.notSame(expected, actual);
  }

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default <O> O notSame(String message, Object expected, O actual) {
    return Check.notSame(message, expected, actual);
  }

  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default <O> O same(Object expected, O actual) {
    return Check.same(expected, actual);
  }

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  default <O> O  same(String message, Object expected, O actual) {
    return Check.same(message, expected, actual);
  }

  default void isTrue(boolean actual) {
    Check.isTrue(actual);
  }

  default void isTrue(String message, boolean actual) {
    Check.isTrue(message, actual);
  }
}
