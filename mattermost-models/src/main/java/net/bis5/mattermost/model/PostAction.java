/*
 * @(#) net.bis5.mattermost.model.PostAction
 * Copyright (c) 2017 Maruyama Takayuki
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 */
package net.bis5.mattermost.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * TODO 型の説明
 * 
 * @author Maruyama Takayuki
 * @since 2017/12/20
 */
@Data
public class PostAction {
	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("integration")
	private PostActionIntegration integration;

	@Data
	public static class PostActionIntegration {
		@JsonProperty("url")
		private String url;
		@JsonProperty("context")
		private Map<String, String> context;
	}

	@Data
	public static class PostActionIntegrationRequest {
		@JsonProperty("user_id")
		private String userId;
		@JsonProperty("context")
		private Map<String, String> context;
	}

	@Data
	public static class PostActionIntegrationResponse {
		@JsonProperty("update")
		private Post update;
		@JsonProperty("ephemeral_text")
		private String ephemeralText;
	}
}
