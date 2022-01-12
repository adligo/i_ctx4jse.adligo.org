package org.adligo.i.ctx4jse;

import java.io.PrintStream;

import org.adligo.i.ctx.shared.I_Ctx;

/**
 * This extends the I_JseCtx with print methods that wrap the
 * System's {@link PrintStream#println(Object)} and 
 *  {@link PrintStream#print(Object)}  methods.
 * Like all of Adligp's Context (abbreviated Ctx) facilitate the Context Creation and
 * Contextualitan design patterns.  These patterns allow stubbing with tools like;
 * {@link <a href="https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}<br/><br/>
 *   Note this is intentionally broken away from the I_JseCtx so that some systems MAY 
 *  intentionally discourage the use of these print and println methods.<br/><br/>
 * 
 * @see {@link I_Ctx}
 * @author scott<br/>
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

public interface I_PrintCtx extends I_JseCtx {

  /**
   * This wraps the {@link} System}'s {@link PrintStream#print(Object)}
   * so that it can be easily stubbed with tools like;
   * {@link <a href="https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}
   * @param message
   * @return
   */
  default I_PrintCtx print(Object message) {
    System.out.println(message);
    return this;
  }
  
  /**
   * This wraps the {@link} System}'s {@link PrintStream#print(String)}
   * so that it can be easily stubbed with tools like;
   * {@link <a href="https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}
   * @param message
   * @return
   */
  default I_PrintCtx print(String message) {
    System.out.println(message);
    return this;
  }
  
  /**
   * This wraps the {@link} System}'s {@link PrintStream#println(Object)}
   * so that it can be easily stubbed with tools like;
   * {@link <a href="https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}
   * @param message
   * @return
   */
  default I_PrintCtx println(Object message) {
    System.out.println(message);
    return this;
  }

  /**
   * This wraps the {@link} System}'s {@link PrintStream#println(String)}
   * so that it can be easily stubbed with tools like;
   * {@link <a href="https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}
   * @param message
   * @return
   */
  default I_PrintCtx println(String message) {
    System.out.println(message);
    return this;
  }

}
