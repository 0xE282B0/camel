/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.corda;

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
public class CordaComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.corda.CordaConfiguration getOrCreateConfiguration(CordaComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.corda.CordaConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CordaComponent target = (CordaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.corda.CordaConfiguration.class, value)); return true;
        case "contractstateclass":
        case "contractStateClass": getOrCreateConfiguration(target).setContractStateClass(property(camelContext, java.lang.Class.class, value)); return true;
        case "flowlogicarguments":
        case "flowLogicArguments": getOrCreateConfiguration(target).setFlowLogicArguments(property(camelContext, java.lang.Object[].class, value)); return true;
        case "flowlogicclass":
        case "flowLogicClass": getOrCreateConfiguration(target).setFlowLogicClass(property(camelContext, java.lang.Class.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "pagespecification":
        case "pageSpecification": getOrCreateConfiguration(target).setPageSpecification(property(camelContext, net.corda.core.node.services.vault.PageSpecification.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "processsnapshot":
        case "processSnapshot": getOrCreateConfiguration(target).setProcessSnapshot(property(camelContext, boolean.class, value)); return true;
        case "querycriteria":
        case "queryCriteria": getOrCreateConfiguration(target).setQueryCriteria(property(camelContext, net.corda.core.node.services.vault.QueryCriteria.class, value)); return true;
        case "sort": getOrCreateConfiguration(target).setSort(property(camelContext, net.corda.core.node.services.vault.Sort.class, value)); return true;
        case "username": getOrCreateConfiguration(target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("configuration", org.apache.camel.component.corda.CordaConfiguration.class);
        answer.put("contractStateClass", java.lang.Class.class);
        answer.put("flowLogicArguments", java.lang.Object[].class);
        answer.put("flowLogicClass", java.lang.Class.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("operation", java.lang.String.class);
        answer.put("pageSpecification", net.corda.core.node.services.vault.PageSpecification.class);
        answer.put("password", java.lang.String.class);
        answer.put("processSnapshot", boolean.class);
        answer.put("queryCriteria", net.corda.core.node.services.vault.QueryCriteria.class);
        answer.put("sort", net.corda.core.node.services.vault.Sort.class);
        answer.put("username", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CordaComponent target = (CordaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.isBridgeErrorHandler(); return true;
        case "configuration": target.getConfiguration(); return true;
        case "contractstateclass":
        case "contractStateClass": getOrCreateConfiguration(target).getContractStateClass(); return true;
        case "flowlogicarguments":
        case "flowLogicArguments": getOrCreateConfiguration(target).getFlowLogicArguments(); return true;
        case "flowlogicclass":
        case "flowLogicClass": getOrCreateConfiguration(target).getFlowLogicClass(); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.isLazyStartProducer(); return true;
        case "operation": getOrCreateConfiguration(target).getOperation(); return true;
        case "pagespecification":
        case "pageSpecification": getOrCreateConfiguration(target).getPageSpecification(); return true;
        case "password": getOrCreateConfiguration(target).getPassword(); return true;
        case "processsnapshot":
        case "processSnapshot": getOrCreateConfiguration(target).isProcessSnapshot(); return true;
        case "querycriteria":
        case "queryCriteria": getOrCreateConfiguration(target).getQueryCriteria(); return true;
        case "sort": getOrCreateConfiguration(target).getSort(); return true;
        case "username": getOrCreateConfiguration(target).getUsername(); return true;
        default: return null;
        }
    }
}

