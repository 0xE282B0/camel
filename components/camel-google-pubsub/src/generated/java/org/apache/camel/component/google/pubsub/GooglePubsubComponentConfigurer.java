/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.pubsub;

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
public class GooglePubsubComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GooglePubsubComponent target = (GooglePubsubComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "endpoint": target.setEndpoint(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "publishercachesize":
        case "publisherCacheSize": target.setPublisherCacheSize(property(camelContext, int.class, value)); return true;
        case "publishercachetimeout":
        case "publisherCacheTimeout": target.setPublisherCacheTimeout(property(camelContext, int.class, value)); return true;
        case "publisherterminationtimeout":
        case "publisherTerminationTimeout": target.setPublisherTerminationTimeout(property(camelContext, int.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("endpoint", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("publisherCacheSize", int.class);
        answer.put("publisherCacheTimeout", int.class);
        answer.put("publisherTerminationTimeout", int.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GooglePubsubComponent target = (GooglePubsubComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.isBridgeErrorHandler(); return true;
        case "endpoint": target.getEndpoint(); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.isLazyStartProducer(); return true;
        case "publishercachesize":
        case "publisherCacheSize": target.getPublisherCacheSize(); return true;
        case "publishercachetimeout":
        case "publisherCacheTimeout": target.getPublisherCacheTimeout(); return true;
        case "publisherterminationtimeout":
        case "publisherTerminationTimeout": target.getPublisherTerminationTimeout(); return true;
        default: return null;
        }
    }
}

