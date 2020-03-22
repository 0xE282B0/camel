/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hazelcast.map;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HazelcastMapEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        HazelcastMapEndpoint target = (HazelcastMapEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "defaultoperation":
        case "defaultOperation": target.setDefaultOperation(property(camelContext, org.apache.camel.component.hazelcast.HazelcastOperation.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "hazelcastinstance":
        case "hazelcastInstance": target.setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastinstancename":
        case "hazelcastInstanceName": target.setHazelcastInstanceName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("defaultOperation", org.apache.camel.component.hazelcast.HazelcastOperation.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("hazelcastInstance", com.hazelcast.core.HazelcastInstance.class);
        answer.put("hazelcastInstanceName", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        HazelcastMapEndpoint target = (HazelcastMapEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.isBridgeErrorHandler(); return true;
        case "defaultoperation":
        case "defaultOperation": target.getDefaultOperation(); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.getExceptionHandler(); return true;
        case "exchangepattern":
        case "exchangePattern": target.getExchangePattern(); return true;
        case "hazelcastinstance":
        case "hazelcastInstance": target.getHazelcastInstance(); return true;
        case "hazelcastinstancename":
        case "hazelcastInstanceName": target.getHazelcastInstanceName(); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.isLazyStartProducer(); return true;
        case "synchronous": target.isSynchronous(); return true;
        default: return null;
        }
    }
}

