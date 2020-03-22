/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.watch;

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
public class FileWatchComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        FileWatchComponent target = (FileWatchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "filehasher":
        case "fileHasher": target.setFileHasher(property(camelContext, io.methvin.watcher.hashing.FileHasher.class, value)); return true;
        case "pollthreads":
        case "pollThreads": target.setPollThreads(property(camelContext, int.class, value)); return true;
        case "queuesize":
        case "queueSize": target.setQueueSize(property(camelContext, int.class, value)); return true;
        case "usefilehashing":
        case "useFileHashing": target.setUseFileHashing(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("concurrentConsumers", int.class);
        answer.put("fileHasher", io.methvin.watcher.hashing.FileHasher.class);
        answer.put("pollThreads", int.class);
        answer.put("queueSize", int.class);
        answer.put("useFileHashing", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        FileWatchComponent target = (FileWatchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.isBridgeErrorHandler(); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.getConcurrentConsumers(); return true;
        case "filehasher":
        case "fileHasher": target.getFileHasher(); return true;
        case "pollthreads":
        case "pollThreads": target.getPollThreads(); return true;
        case "queuesize":
        case "queueSize": target.getQueueSize(); return true;
        case "usefilehashing":
        case "useFileHashing": target.isUseFileHashing(); return true;
        default: return null;
        }
    }
}

