/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.bonita;

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
public class BonitaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BonitaEndpoint target = (BonitaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "hostname": target.getConfiguration().setHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "port": target.getConfiguration().setPort(property(camelContext, java.lang.String.class, value)); return true;
        case "processname":
        case "processName": target.getConfiguration().setProcessName(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("hostname", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("password", java.lang.String.class);
        answer.put("port", java.lang.String.class);
        answer.put("processName", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("username", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BonitaEndpoint target = (BonitaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "hostname": target.getConfiguration().getHostname(); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.isLazyStartProducer(); return true;
        case "password": target.getConfiguration().getPassword(); return true;
        case "port": target.getConfiguration().getPort(); return true;
        case "processname":
        case "processName": target.getConfiguration().getProcessName(); return true;
        case "synchronous": target.isSynchronous(); return true;
        case "username": target.getConfiguration().getUsername(); return true;
        default: return null;
        }
    }
}

