/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sparkrest;

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
public class SparkRestComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.sparkrest.SparkConfiguration getOrCreateConfiguration(SparkRestComponent target) {
        if (target.getSparkConfiguration() == null) {
            target.setSparkConfiguration(new org.apache.camel.component.sparkrest.SparkConfiguration());
        }
        return target.getSparkConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SparkRestComponent target = (SparkRestComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "disablestreamcache":
        case "disableStreamCache": getOrCreateConfiguration(target).setDisableStreamCache(property(camelContext, boolean.class, value)); return true;
        case "ipaddress":
        case "ipAddress": target.setIpAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "keystorefile":
        case "keystoreFile": target.setKeystoreFile(property(camelContext, java.lang.String.class, value)); return true;
        case "keystorepassword":
        case "keystorePassword": target.setKeystorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "mapheaders":
        case "mapHeaders": getOrCreateConfiguration(target).setMapHeaders(property(camelContext, boolean.class, value)); return true;
        case "matchonuriprefix":
        case "matchOnUriPrefix": getOrCreateConfiguration(target).setMatchOnUriPrefix(property(camelContext, boolean.class, value)); return true;
        case "maxthreads":
        case "maxThreads": target.setMaxThreads(property(camelContext, int.class, value)); return true;
        case "minthreads":
        case "minThreads": target.setMinThreads(property(camelContext, int.class, value)); return true;
        case "port": target.setPort(property(camelContext, int.class, value)); return true;
        case "sparkbinding":
        case "sparkBinding": target.setSparkBinding(property(camelContext, org.apache.camel.component.sparkrest.SparkBinding.class, value)); return true;
        case "sparkconfiguration":
        case "sparkConfiguration": target.setSparkConfiguration(property(camelContext, org.apache.camel.component.sparkrest.SparkConfiguration.class, value)); return true;
        case "timeoutmillis":
        case "timeOutMillis": target.setTimeOutMillis(property(camelContext, int.class, value)); return true;
        case "transferexception":
        case "transferException": getOrCreateConfiguration(target).setTransferException(property(camelContext, boolean.class, value)); return true;
        case "truststorefile":
        case "truststoreFile": target.setTruststoreFile(property(camelContext, java.lang.String.class, value)); return true;
        case "truststorepassword":
        case "truststorePassword": target.setTruststorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "urldecodeheaders":
        case "urlDecodeHeaders": getOrCreateConfiguration(target).setUrlDecodeHeaders(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("disableStreamCache", boolean.class);
        answer.put("ipAddress", java.lang.String.class);
        answer.put("keystoreFile", java.lang.String.class);
        answer.put("keystorePassword", java.lang.String.class);
        answer.put("mapHeaders", boolean.class);
        answer.put("matchOnUriPrefix", boolean.class);
        answer.put("maxThreads", int.class);
        answer.put("minThreads", int.class);
        answer.put("port", int.class);
        answer.put("sparkBinding", org.apache.camel.component.sparkrest.SparkBinding.class);
        answer.put("sparkConfiguration", org.apache.camel.component.sparkrest.SparkConfiguration.class);
        answer.put("timeOutMillis", int.class);
        answer.put("transferException", boolean.class);
        answer.put("truststoreFile", java.lang.String.class);
        answer.put("truststorePassword", java.lang.String.class);
        answer.put("urlDecodeHeaders", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SparkRestComponent target = (SparkRestComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "disablestreamcache":
        case "disableStreamCache": return getOrCreateConfiguration(target).isDisableStreamCache();
        case "ipaddress":
        case "ipAddress": return target.getIpAddress();
        case "keystorefile":
        case "keystoreFile": return target.getKeystoreFile();
        case "keystorepassword":
        case "keystorePassword": return target.getKeystorePassword();
        case "mapheaders":
        case "mapHeaders": return getOrCreateConfiguration(target).isMapHeaders();
        case "matchonuriprefix":
        case "matchOnUriPrefix": return getOrCreateConfiguration(target).isMatchOnUriPrefix();
        case "maxthreads":
        case "maxThreads": return target.getMaxThreads();
        case "minthreads":
        case "minThreads": return target.getMinThreads();
        case "port": return target.getPort();
        case "sparkbinding":
        case "sparkBinding": return target.getSparkBinding();
        case "sparkconfiguration":
        case "sparkConfiguration": return target.getSparkConfiguration();
        case "timeoutmillis":
        case "timeOutMillis": return target.getTimeOutMillis();
        case "transferexception":
        case "transferException": return getOrCreateConfiguration(target).isTransferException();
        case "truststorefile":
        case "truststoreFile": return target.getTruststoreFile();
        case "truststorepassword":
        case "truststorePassword": return target.getTruststorePassword();
        case "urldecodeheaders":
        case "urlDecodeHeaders": return getOrCreateConfiguration(target).isUrlDecodeHeaders();
        default: return null;
        }
    }
}

