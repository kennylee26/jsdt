/*******************************************************************************
 *
 *==============================================================================
 *
 * Copyright (c) 2008-2011 ayound@gmail.com
 * This program and the accompanying materials
 * are made available under the terms of the Apache License 2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 * All rights reserved.
 *
 * Created on 2009-3-27
 *******************************************************************************/

package org.ayound.js.debug.listener;

import org.ayound.js.debug.model.DebugStackFrame;
import org.ayound.js.debug.model.ErrorStackFrame;

public interface IStackFrameListener {
	public void addStackFrame(DebugStackFrame frame);
	public void addErrorFrame(ErrorStackFrame frame);
}
