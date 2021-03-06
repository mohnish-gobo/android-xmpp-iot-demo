/*
 * Copyright ⓒ 2016 Florian Schmaus.
 *
 * This file is part of XIOT.
 *
 * XIOT is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * XIOT is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with XIOT.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.asmack.core;

public class XmppConnectionStatus {

	private XmppConnectionState mState = XmppConnectionState.Disconnected;
	private String mOptionalInfo;

	public XmppConnectionState getState() {
		return mState;
	}

	void setStatus(XmppConnectionState state) {
		setStatus(state, null);
	}

	void setStatus(XmppConnectionState state, String optionalInfo) {
		mState = state;
		mOptionalInfo = optionalInfo;
	}
}
