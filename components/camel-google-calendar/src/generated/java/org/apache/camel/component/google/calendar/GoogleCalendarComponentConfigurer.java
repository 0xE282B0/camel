/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.calendar;

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
public class GoogleCalendarComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.google.calendar.GoogleCalendarConfiguration getOrCreateConfiguration(GoogleCalendarComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.google.calendar.GoogleCalendarConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleCalendarComponent target = (GoogleCalendarComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": getOrCreateConfiguration(target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname":
        case "applicationName": getOrCreateConfiguration(target).setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientfactory":
        case "clientFactory": target.setClientFactory(property(camelContext, org.apache.camel.component.google.calendar.GoogleCalendarClientFactory.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": getOrCreateConfiguration(target).setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.google.calendar.GoogleCalendarConfiguration.class, value)); return true;
        case "emailaddress":
        case "emailAddress": getOrCreateConfiguration(target).setEmailAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "p12filename":
        case "p12FileName": getOrCreateConfiguration(target).setP12FileName(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken":
        case "refreshToken": getOrCreateConfiguration(target).setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": getOrCreateConfiguration(target).setScopes(property(camelContext, java.lang.String.class, value)); return true;
        case "user": getOrCreateConfiguration(target).setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessToken", java.lang.String.class);
        answer.put("applicationName", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("clientFactory", org.apache.camel.component.google.calendar.GoogleCalendarClientFactory.class);
        answer.put("clientId", java.lang.String.class);
        answer.put("clientSecret", java.lang.String.class);
        answer.put("configuration", org.apache.camel.component.google.calendar.GoogleCalendarConfiguration.class);
        answer.put("emailAddress", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("p12FileName", java.lang.String.class);
        answer.put("refreshToken", java.lang.String.class);
        answer.put("scopes", java.lang.String.class);
        answer.put("user", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GoogleCalendarComponent target = (GoogleCalendarComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": getOrCreateConfiguration(target).getAccessToken(); return true;
        case "applicationname":
        case "applicationName": getOrCreateConfiguration(target).getApplicationName(); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.isBridgeErrorHandler(); return true;
        case "clientfactory":
        case "clientFactory": target.getClientFactory(); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).getClientId(); return true;
        case "clientsecret":
        case "clientSecret": getOrCreateConfiguration(target).getClientSecret(); return true;
        case "configuration": target.getConfiguration(); return true;
        case "emailaddress":
        case "emailAddress": getOrCreateConfiguration(target).getEmailAddress(); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.isLazyStartProducer(); return true;
        case "p12filename":
        case "p12FileName": getOrCreateConfiguration(target).getP12FileName(); return true;
        case "refreshtoken":
        case "refreshToken": getOrCreateConfiguration(target).getRefreshToken(); return true;
        case "scopes": getOrCreateConfiguration(target).getScopes(); return true;
        case "user": getOrCreateConfiguration(target).getUser(); return true;
        default: return null;
        }
    }
}

