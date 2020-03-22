/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ganglia;

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
public class GangliaComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.ganglia.GangliaConfiguration getOrCreateConfiguration(GangliaComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.ganglia.GangliaConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GangliaComponent target = (GangliaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.ganglia.GangliaConfiguration.class, value)); return true;
        case "dmax": getOrCreateConfiguration(target).setDmax(property(camelContext, int.class, value)); return true;
        case "groupname":
        case "groupName": getOrCreateConfiguration(target).setGroupName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "metricname":
        case "metricName": getOrCreateConfiguration(target).setMetricName(property(camelContext, java.lang.String.class, value)); return true;
        case "mode": getOrCreateConfiguration(target).setMode(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode.class, value)); return true;
        case "prefix": getOrCreateConfiguration(target).setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "slope": getOrCreateConfiguration(target).setSlope(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetricSlope.class, value)); return true;
        case "spoofhostname":
        case "spoofHostname": getOrCreateConfiguration(target).setSpoofHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "tmax": getOrCreateConfiguration(target).setTmax(property(camelContext, int.class, value)); return true;
        case "ttl": getOrCreateConfiguration(target).setTtl(property(camelContext, int.class, value)); return true;
        case "type": getOrCreateConfiguration(target).setType(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetricType.class, value)); return true;
        case "units": getOrCreateConfiguration(target).setUnits(property(camelContext, java.lang.String.class, value)); return true;
        case "wireformat31x":
        case "wireFormat31x": getOrCreateConfiguration(target).setWireFormat31x(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("configuration", org.apache.camel.component.ganglia.GangliaConfiguration.class);
        answer.put("dmax", int.class);
        answer.put("groupName", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("metricName", java.lang.String.class);
        answer.put("mode", info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode.class);
        answer.put("prefix", java.lang.String.class);
        answer.put("slope", info.ganglia.gmetric4j.gmetric.GMetricSlope.class);
        answer.put("spoofHostname", java.lang.String.class);
        answer.put("tmax", int.class);
        answer.put("ttl", int.class);
        answer.put("type", info.ganglia.gmetric4j.gmetric.GMetricType.class);
        answer.put("units", java.lang.String.class);
        answer.put("wireFormat31x", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GangliaComponent target = (GangliaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "configuration": target.getConfiguration(); return true;
        case "dmax": getOrCreateConfiguration(target).getDmax(); return true;
        case "groupname":
        case "groupName": getOrCreateConfiguration(target).getGroupName(); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.isLazyStartProducer(); return true;
        case "metricname":
        case "metricName": getOrCreateConfiguration(target).getMetricName(); return true;
        case "mode": getOrCreateConfiguration(target).getMode(); return true;
        case "prefix": getOrCreateConfiguration(target).getPrefix(); return true;
        case "slope": getOrCreateConfiguration(target).getSlope(); return true;
        case "spoofhostname":
        case "spoofHostname": getOrCreateConfiguration(target).getSpoofHostname(); return true;
        case "tmax": getOrCreateConfiguration(target).getTmax(); return true;
        case "ttl": getOrCreateConfiguration(target).getTtl(); return true;
        case "type": getOrCreateConfiguration(target).getType(); return true;
        case "units": getOrCreateConfiguration(target).getUnits(); return true;
        case "wireformat31x":
        case "wireFormat31x": getOrCreateConfiguration(target).isWireFormat31x(); return true;
        default: return null;
        }
    }
}

