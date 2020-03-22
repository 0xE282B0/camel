/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.etcd;

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
public class EtcdWatchEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        EtcdWatchEndpoint target = (EtcdWatchEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fromindex":
        case "fromIndex": target.getConfiguration().setFromIndex(property(camelContext, long.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "recursive": target.getConfiguration().setRecursive(property(camelContext, boolean.class, value)); return true;
        case "sendemptyexchangeontimeout":
        case "sendEmptyExchangeOnTimeout": target.getConfiguration().setSendEmptyExchangeOnTimeout(property(camelContext, boolean.class, value)); return true;
        case "servicepath":
        case "servicePath": target.getConfiguration().setServicePath(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "uris": target.getConfiguration().setUris(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.getConfiguration().setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("fromIndex", long.class);
        answer.put("password", java.lang.String.class);
        answer.put("recursive", boolean.class);
        answer.put("sendEmptyExchangeOnTimeout", boolean.class);
        answer.put("servicePath", java.lang.String.class);
        answer.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("synchronous", boolean.class);
        answer.put("timeout", java.lang.Long.class);
        answer.put("uris", java.lang.String.class);
        answer.put("userName", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        EtcdWatchEndpoint target = (EtcdWatchEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.isBridgeErrorHandler(); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.getExceptionHandler(); return true;
        case "exchangepattern":
        case "exchangePattern": target.getExchangePattern(); return true;
        case "fromindex":
        case "fromIndex": target.getConfiguration().getFromIndex(); return true;
        case "password": target.getConfiguration().getPassword(); return true;
        case "recursive": target.getConfiguration().isRecursive(); return true;
        case "sendemptyexchangeontimeout":
        case "sendEmptyExchangeOnTimeout": target.getConfiguration().isSendEmptyExchangeOnTimeout(); return true;
        case "servicepath":
        case "servicePath": target.getConfiguration().getServicePath(); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().getSslContextParameters(); return true;
        case "synchronous": target.isSynchronous(); return true;
        case "timeout": target.getConfiguration().getTimeout(); return true;
        case "uris": target.getConfiguration().getUris(); return true;
        case "username":
        case "userName": target.getConfiguration().getUserName(); return true;
        default: return null;
        }
    }
}

