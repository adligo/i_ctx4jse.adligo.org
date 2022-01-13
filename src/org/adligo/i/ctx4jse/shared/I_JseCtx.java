package org.adligo.i.ctx4jse.shared;

import org.adligo.i.ctx.shared.I_Ctx;

/**
 * This is a Contextual interface for Java Standard Edition stuff, which like
 * all of Adligp's Context (abbreviated Ctx) facilitate the Context Creation and
 * Contextualitan design patterns.  These patterns allow stubbing with tools like;
 * {@link <a href="https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}<br/><br/>
 * This overloads the methods in I_Ctx using 
 * Java Classes instead of Strings, since plain old Javascript
 * will not have the concept of Java Classes.   The methods in this
 * interface SHOULD generally be used instead of the methods I_Ctx. <br/><br/>
 * 
 * @see {@link I_Ctx}
 * @author scott<br/><br/>
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
public interface I_JseCtx extends I_Ctx {

  /**
   * This overloads the method with the same name also 
   * facilitating the Context Creation pattern.
   * I_Ctx#create(String) with the same purpose. However
   * there are a few additional strategies;
   * 
   * JSE on the JVM
   *   This can be implemented as a reflection on the bean (zero argument)
   * constructor.  However this reflection code will NOT compile to GWT or 
   * native executables.
   * 
   * GWT and Native Compilation
   *   This can be implemented with a Map&lt;Class, Supplier&gt; allowing
   * GWT or Native Compilation to behave in a similar manor to Java Reflection
   * from the perspective of the clients of this method.
   * @param <T>
   * @param clazz
   * @return
   * @see {@link I_Ctx#create(String)} 
   */
  public <T> T create(Class<T> clazz);
  
  /**
   * This overloads the method with the same name 
   * I_Ctx#get(String) also 
   * facilitating the Contextualtan pattern. If a instance 
   * of the Class doesn't exist then one should be created using 
   * the create method above.
   *
   * 
   * @param <T>
   * @param clazz
   * @return
   * @see {@link I_Ctx#get(String)}
   */
  public <T> T get(Class<T> clazz);
  
  @Override
  default long getTime() {
    return System.currentTimeMillis();
  }
}
