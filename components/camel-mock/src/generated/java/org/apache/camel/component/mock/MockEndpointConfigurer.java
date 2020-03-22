/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mock;

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
public class MockEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MockEndpoint target = (MockEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "assertperiod":
        case "assertPeriod": target.setAssertPeriod(property(camelContext, long.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "copyonexchange":
        case "copyOnExchange": target.setCopyOnExchange(property(camelContext, boolean.class, value)); return true;
        case "expectedcount":
        case "expectedCount": target.setExpectedCount(property(camelContext, int.class, value)); return true;
        case "failfast":
        case "failFast": target.setFailFast(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "reportgroup":
        case "reportGroup": target.setReportGroup(property(camelContext, int.class, value)); return true;
        case "resultminimumwaittime":
        case "resultMinimumWaitTime": target.setResultMinimumWaitTime(property(camelContext, long.class, value)); return true;
        case "resultwaittime":
        case "resultWaitTime": target.setResultWaitTime(property(camelContext, long.class, value)); return true;
        case "retainfirst":
        case "retainFirst": target.setRetainFirst(property(camelContext, int.class, value)); return true;
        case "retainlast":
        case "retainLast": target.setRetainLast(property(camelContext, int.class, value)); return true;
        case "sleepforemptytest":
        case "sleepForEmptyTest": target.setSleepForEmptyTest(property(camelContext, long.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("assertPeriod", long.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("copyOnExchange", boolean.class);
        answer.put("expectedCount", int.class);
        answer.put("failFast", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("reportGroup", int.class);
        answer.put("resultMinimumWaitTime", long.class);
        answer.put("resultWaitTime", long.class);
        answer.put("retainFirst", int.class);
        answer.put("retainLast", int.class);
        answer.put("sleepForEmptyTest", long.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MockEndpoint target = (MockEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "assertperiod":
        case "assertPeriod": target.getAssertPeriod(); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "copyonexchange":
        case "copyOnExchange": target.isCopyOnExchange(); return true;
        case "expectedcount":
        case "expectedCount": target.getExpectedCount(); return true;
        case "failfast":
        case "failFast": target.isFailFast(); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.isLazyStartProducer(); return true;
        case "reportgroup":
        case "reportGroup": target.getReportGroup(); return true;
        case "resultminimumwaittime":
        case "resultMinimumWaitTime": target.getResultMinimumWaitTime(); return true;
        case "resultwaittime":
        case "resultWaitTime": target.getResultWaitTime(); return true;
        case "retainfirst":
        case "retainFirst": target.getRetainFirst(); return true;
        case "retainlast":
        case "retainLast": target.getRetainLast(); return true;
        case "sleepforemptytest":
        case "sleepForEmptyTest": target.getSleepForEmptyTest(); return true;
        case "synchronous": target.isSynchronous(); return true;
        default: return null;
        }
    }
}

