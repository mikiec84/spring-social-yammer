/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.yammer.api.impl;

import org.springframework.social.yammer.api.ThreadOperations;
import org.springframework.social.yammer.api.YammerThread;
import org.springframework.web.client.RestTemplate;

/**
 * @author Morten Andersen-Gott
 *
 */
public class ThreadTemplate extends AbstractYammerOperations implements ThreadOperations {

	private RestTemplate restTemplate;

	public ThreadTemplate(RestTemplate restTemplate){
		this.restTemplate = restTemplate;
	}
	
	public YammerThread getThread(long id) {
		return restTemplate.getForObject(buildUri("threads/"+id+".json"), YammerThread.class);
	}

}
