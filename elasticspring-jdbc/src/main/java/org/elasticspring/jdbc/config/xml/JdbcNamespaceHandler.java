/*
 * Copyright 2013 the original author or authors.
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

package org.elasticspring.jdbc.config.xml;

import org.elasticspring.jdbc.rds.config.xml.AmazonRdsBeanDefinitionParser;
import org.elasticspring.jdbc.rds.config.xml.AmazonRdsRetryInterceptorBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * {@link org.springframework.beans.factory.xml.NamespaceHandler} implementation for the ElasticSpring 'jdbc' name
 * space.
 *
 * @author Agim Emruli
 * @since 1.0
 */
@SuppressWarnings("UnusedDeclaration")
public class JdbcNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("dataSource", new AmazonRdsBeanDefinitionParser());
		registerBeanDefinitionParser("retry-interceptor", new AmazonRdsRetryInterceptorBeanDefinitionParser());
	}
}
