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

/**
 * A request to renew an access token.
 */
public class OAuthRenewAccessToken extends AbstractOAuthGetToken {

	/**
	 * The token that was previously obtained via {@link com.blackcat.oauth.OAuthGetAccessToken}.
	 */
	public String token;

	/**
	 * The long running session id that allows us to renew tokens.
	 */
	public String sessionId;

	/**
	 * @param authorizationServerUrl encoded authorization server URL
	 */
	public OAuthRenewAccessToken(String authorizationServerUrl) {
		super(authorizationServerUrl);
	}

	@Override
	public OAuthParameters createParameters() {
		OAuthParameters result = super.createParameters();
		result.token = token;
		result.sessionHandle = sessionId;
		return result;
	}
}
