/*
 * MODIFIED BY BLACKCAT TECHNOLOGY SOLUTIONS IN OCTOBER 2014 IN ORDER TO SUPPORT OAUTH SESSIONS REQUIRED BY XERO.COM.
 *
 * Copyright (c) 2010 Google Inc.
 *
 * Copyright (c) 2014 BlackCat Technology Solutions Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.blackcat.oauth;

import com.google.api.client.auth.oauth.*;

public class OAuthGetAccessToken extends AbstractOAuthGetToken {

	/**
	 * Required temporary token. It is retrieved from the {@link com.google.api.client.auth.oauth.OAuthCredentialsResponse#token}
	 * returned from {@link OAuthGetTemporaryToken#execute()}.
	 */
	public String temporaryToken;

	/**
	 * Required verifier code received from the server when the temporary token was authorized. It is
	 * retrieved from {@link OAuthCallbackUrl#verifier}.
	 */
	public String verifier;

	/**
	 * @param authorizationServerUrl encoded authorization server URL
	 */
	public OAuthGetAccessToken(String authorizationServerUrl) {
		super(authorizationServerUrl);
	}

	@Override
	public OAuthParameters createParameters() {
		OAuthParameters result = super.createParameters();
		result.token = temporaryToken;
		result.verifier = verifier;
		return result;
	}
}
