package org.adligo.i.ctx4jse.shared;

import org.adligo.i.ctx.shared.I_CtxAware;

/**
 * This interfaces marks a class or other interface as having a constructor
 * with a single {@link I_JseCtx} argument.  Note that the leaf most context
 * will be passed to the constructor.
 * <br/>
 * 
 * @author scott<br/>
 *         <br/>
 * 
 * <pre><code>
 * ---------------- Apache ICENSE-2.0 --------------------------
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
 * </code><pre>
 */
public interface I_JseCtxAware extends I_CtxAware {

  /**
   * return the context
   * @return
   */
  public I_JseCtx getCtx();
}
