/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twitter.directmessage;

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
public class TwitterDirectMessageEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        TwitterDirectMessageEndpoint target = (TwitterDirectMessageEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.getProperties().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "accesstokensecret":
        case "accessTokenSecret": target.getProperties().setAccessTokenSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumerkey":
        case "consumerKey": target.getProperties().setConsumerKey(property(camelContext, java.lang.String.class, value)); return true;
        case "consumersecret":
        case "consumerSecret": target.getProperties().setConsumerSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "count": target.getProperties().setCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "distancemetric":
        case "distanceMetric": target.getProperties().setDistanceMetric(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "extendedmode":
        case "extendedMode": target.getProperties().setExtendedMode(property(camelContext, boolean.class, value)); return true;
        case "filterold":
        case "filterOld": target.getProperties().setFilterOld(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "httpproxyhost":
        case "httpProxyHost": target.getProperties().setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword":
        case "httpProxyPassword": target.getProperties().setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport":
        case "httpProxyPort": target.getProperties().setHttpProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyuser":
        case "httpProxyUser": target.getProperties().setHttpProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lang": target.getProperties().setLang(property(camelContext, java.lang.String.class, value)); return true;
        case "latitude": target.getProperties().setLatitude(property(camelContext, java.lang.Double.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "locations": target.getProperties().setLocations(property(camelContext, java.lang.String.class, value)); return true;
        case "longitude": target.getProperties().setLongitude(property(camelContext, java.lang.Double.class, value)); return true;
        case "numberofpages":
        case "numberOfPages": target.getProperties().setNumberOfPages(property(camelContext, java.lang.Integer.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "radius": target.getProperties().setRadius(property(camelContext, java.lang.Double.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "sinceid":
        case "sinceId": target.getProperties().setSinceId(property(camelContext, long.class, value)); return true;
        case "sortbyid":
        case "sortById": target.getProperties().setSortById(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "type": target.getProperties().setType(property(camelContext, org.apache.camel.component.twitter.data.EndpointType.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "userids":
        case "userIds": target.getProperties().setUserIds(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessToken", java.lang.String.class);
        answer.put("accessTokenSecret", java.lang.String.class);
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("consumerKey", java.lang.String.class);
        answer.put("consumerSecret", java.lang.String.class);
        answer.put("count", java.lang.Integer.class);
        answer.put("delay", long.class);
        answer.put("distanceMetric", java.lang.String.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("extendedMode", boolean.class);
        answer.put("filterOld", boolean.class);
        answer.put("greedy", boolean.class);
        answer.put("httpProxyHost", java.lang.String.class);
        answer.put("httpProxyPassword", java.lang.String.class);
        answer.put("httpProxyPort", java.lang.Integer.class);
        answer.put("httpProxyUser", java.lang.String.class);
        answer.put("initialDelay", long.class);
        answer.put("lang", java.lang.String.class);
        answer.put("latitude", java.lang.Double.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("locations", java.lang.String.class);
        answer.put("longitude", java.lang.Double.class);
        answer.put("numberOfPages", java.lang.Integer.class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("radius", java.lang.Double.class);
        answer.put("repeatCount", long.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.String.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("sinceId", long.class);
        answer.put("sortById", boolean.class);
        answer.put("startScheduler", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("type", org.apache.camel.component.twitter.data.EndpointType.class);
        answer.put("useFixedDelay", boolean.class);
        answer.put("userIds", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        TwitterDirectMessageEndpoint target = (TwitterDirectMessageEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return target.getProperties().getAccessToken();
        case "accesstokensecret":
        case "accessTokenSecret": return target.getProperties().getAccessTokenSecret();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumerkey":
        case "consumerKey": return target.getProperties().getConsumerKey();
        case "consumersecret":
        case "consumerSecret": return target.getProperties().getConsumerSecret();
        case "count": return target.getProperties().getCount();
        case "delay": return target.getDelay();
        case "distancemetric":
        case "distanceMetric": return target.getProperties().getDistanceMetric();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "extendedmode":
        case "extendedMode": return target.getProperties().isExtendedMode();
        case "filterold":
        case "filterOld": return target.getProperties().isFilterOld();
        case "greedy": return target.isGreedy();
        case "httpproxyhost":
        case "httpProxyHost": return target.getProperties().getHttpProxyHost();
        case "httpproxypassword":
        case "httpProxyPassword": return target.getProperties().getHttpProxyPassword();
        case "httpproxyport":
        case "httpProxyPort": return target.getProperties().getHttpProxyPort();
        case "httpproxyuser":
        case "httpProxyUser": return target.getProperties().getHttpProxyUser();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lang": return target.getProperties().getLang();
        case "latitude": return target.getProperties().getLatitude();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "locations": return target.getProperties().getLocations();
        case "longitude": return target.getProperties().getLongitude();
        case "numberofpages":
        case "numberOfPages": return target.getProperties().getNumberOfPages();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "radius": return target.getProperties().getRadius();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "sinceid":
        case "sinceId": return target.getProperties().getSinceId();
        case "sortbyid":
        case "sortById": return target.getProperties().isSortById();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "synchronous": return target.isSynchronous();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "type": return target.getProperties().getType();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "userids":
        case "userIds": return target.getProperties().getUserIds();
        default: return null;
        }
    }
}

