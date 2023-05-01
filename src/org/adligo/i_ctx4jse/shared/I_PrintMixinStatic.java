package org.adligo.i_ctx4jse.shared;

import java.io.PrintStream;

/**
 * This mixin provides a println method wrapper to your class or interface,
 * no more System.out.println yea!
 * 
 * @author scott<br/>
 * 
 *         <pre>
 * <code>
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
 * </code>
 *         </pre>
 */
public interface I_PrintMixinStatic {

  /**
   * This wraps the {@link} System}'s {@link PrintStream#print(Object)} so that it
   * can be easily stubbed with tools like; {@link <a href=
   * "https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}
   * 
   * @param message
   * @return
   */
  static void print(Object message) {
    System.out.println(message);
  }

  /**
   * This wraps the {@link} System}'s {@link PrintStream#print(String)} so that it
   * can be easily stubbed with tools like; {@link <a href=
   * "https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}
   * 
   * @param message
   * @return
   */
  static void print(String message) {
    System.out.println(message);
  }

  /**
   * This wraps the {@link} System}'s {@link PrintStream#println(Object)} so that
   * it can be easily stubbed with tools like; {@link <a href=
   * "https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}
   * 
   * @param message
   * @return
   */
  static void println(Object message) {
    System.out.println(message);
  }

  /**
   * This wraps the {@link} System}'s {@link PrintStream#println(String)} so that
   * it can be easily stubbed with tools like; {@link <a href=
   * "https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}
   * 
   * @param message
   * @return
   */
  static void println(String message) {
    System.out.println(message);
  }
}
