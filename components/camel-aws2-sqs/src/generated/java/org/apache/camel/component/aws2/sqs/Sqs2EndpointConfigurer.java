/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.sqs;

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
public class Sqs2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Sqs2Endpoint target = (Sqs2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonawshost":
        case "amazonAWSHost": target.getConfiguration().setAmazonAWSHost(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonsqsclient":
        case "amazonSQSClient": target.getConfiguration().setAmazonSQSClient(property(camelContext, software.amazon.awssdk.services.sqs.SqsClient.class, value)); return true;
        case "attributenames":
        case "attributeNames": target.getConfiguration().setAttributeNames(property(camelContext, java.lang.String.class, value)); return true;
        case "autocreatequeue":
        case "autoCreateQueue": target.getConfiguration().setAutoCreateQueue(property(camelContext, boolean.class, value)); return true;
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
        case "concurrentconsumers":
        case "concurrentConsumers": target.getConfiguration().setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "defaultvisibilitytimeout":
        case "defaultVisibilityTimeout": target.getConfiguration().setDefaultVisibilityTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "delayqueue":
        case "delayQueue": target.getConfiguration().setDelayQueue(property(camelContext, boolean.class, value)); return true;
        case "delayseconds":
        case "delaySeconds": target.getConfiguration().setDelaySeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": target.getConfiguration().setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "deleteiffiltered":
        case "deleteIfFiltered": target.getConfiguration().setDeleteIfFiltered(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "extendmessagevisibility":
        case "extendMessageVisibility": target.getConfiguration().setExtendMessageVisibility(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "kmsdatakeyreuseperiodseconds":
        case "kmsDataKeyReusePeriodSeconds": target.getConfiguration().setKmsDataKeyReusePeriodSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": target.getConfiguration().setKmsMasterKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "maximummessagesize":
        case "maximumMessageSize": target.getConfiguration().setMaximumMessageSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "messageattributenames":
        case "messageAttributeNames": target.getConfiguration().setMessageAttributeNames(property(camelContext, java.lang.String.class, value)); return true;
        case "messagededuplicationidstrategy":
        case "messageDeduplicationIdStrategy": target.getConfiguration().setMessageDeduplicationIdStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "messagegroupidstrategy":
        case "messageGroupIdStrategy": target.getConfiguration().setMessageGroupIdStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "messageretentionperiod":
        case "messageRetentionPeriod": target.getConfiguration().setMessageRetentionPeriod(property(camelContext, java.lang.Integer.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws2.sqs.Sqs2Operations.class, value)); return true;
        case "policy": target.getConfiguration().setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "protocol": target.getConfiguration().setProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "queueownerawsaccountid":
        case "queueOwnerAWSAccountId": target.getConfiguration().setQueueOwnerAWSAccountId(property(camelContext, java.lang.String.class, value)); return true;
        case "queueurl":
        case "queueUrl": target.getConfiguration().setQueueUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "receivemessagewaittimeseconds":
        case "receiveMessageWaitTimeSeconds": target.getConfiguration().setReceiveMessageWaitTimeSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "redrivepolicy":
        case "redrivePolicy": target.getConfiguration().setRedrivePolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": target.getConfiguration().setServerSideEncryptionEnabled(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "visibilitytimeout":
        case "visibilityTimeout": target.getConfiguration().setVisibilityTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "waittimeseconds":
        case "waitTimeSeconds": target.getConfiguration().setWaitTimeSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessKey", java.lang.String.class);
        answer.put("amazonAWSHost", java.lang.String.class);
        answer.put("amazonSQSClient", software.amazon.awssdk.services.sqs.SqsClient.class);
        answer.put("attributeNames", java.lang.String.class);
        answer.put("autoCreateQueue", boolean.class);
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("concurrentConsumers", int.class);
        answer.put("defaultVisibilityTimeout", java.lang.Integer.class);
        answer.put("delay", long.class);
        answer.put("delayQueue", boolean.class);
        answer.put("delaySeconds", java.lang.Integer.class);
        answer.put("deleteAfterRead", boolean.class);
        answer.put("deleteIfFiltered", boolean.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("extendMessageVisibility", boolean.class);
        answer.put("greedy", boolean.class);
        answer.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        answer.put("initialDelay", long.class);
        answer.put("kmsDataKeyReusePeriodSeconds", java.lang.Integer.class);
        answer.put("kmsMasterKeyId", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxMessagesPerPoll", int.class);
        answer.put("maximumMessageSize", java.lang.Integer.class);
        answer.put("messageAttributeNames", java.lang.String.class);
        answer.put("messageDeduplicationIdStrategy", java.lang.String.class);
        answer.put("messageGroupIdStrategy", java.lang.String.class);
        answer.put("messageRetentionPeriod", java.lang.Integer.class);
        answer.put("operation", org.apache.camel.component.aws2.sqs.Sqs2Operations.class);
        answer.put("policy", java.lang.String.class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("protocol", java.lang.String.class);
        answer.put("proxyHost", java.lang.String.class);
        answer.put("proxyPort", java.lang.Integer.class);
        answer.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        answer.put("queueOwnerAWSAccountId", java.lang.String.class);
        answer.put("queueUrl", java.lang.String.class);
        answer.put("receiveMessageWaitTimeSeconds", java.lang.Integer.class);
        answer.put("redrivePolicy", java.lang.String.class);
        answer.put("region", java.lang.String.class);
        answer.put("repeatCount", long.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.String.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("secretKey", java.lang.String.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("serverSideEncryptionEnabled", boolean.class);
        answer.put("startScheduler", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("useFixedDelay", boolean.class);
        answer.put("visibilityTimeout", java.lang.Integer.class);
        answer.put("waitTimeSeconds", java.lang.Integer.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Sqs2Endpoint target = (Sqs2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().getAccessKey(); return true;
        case "amazonawshost":
        case "amazonAWSHost": target.getConfiguration().getAmazonAWSHost(); return true;
        case "amazonsqsclient":
        case "amazonSQSClient": target.getConfiguration().getAmazonSQSClient(); return true;
        case "attributenames":
        case "attributeNames": target.getConfiguration().getAttributeNames(); return true;
        case "autocreatequeue":
        case "autoCreateQueue": target.getConfiguration().isAutoCreateQueue(); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.getBackoffErrorThreshold(); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.getBackoffIdleThreshold(); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.getBackoffMultiplier(); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.isBridgeErrorHandler(); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.getConfiguration().getConcurrentConsumers(); return true;
        case "defaultvisibilitytimeout":
        case "defaultVisibilityTimeout": target.getConfiguration().getDefaultVisibilityTimeout(); return true;
        case "delay": target.getDelay(); return true;
        case "delayqueue":
        case "delayQueue": target.getConfiguration().isDelayQueue(); return true;
        case "delayseconds":
        case "delaySeconds": target.getConfiguration().getDelaySeconds(); return true;
        case "deleteafterread":
        case "deleteAfterRead": target.getConfiguration().isDeleteAfterRead(); return true;
        case "deleteiffiltered":
        case "deleteIfFiltered": target.getConfiguration().isDeleteIfFiltered(); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.getExceptionHandler(); return true;
        case "exchangepattern":
        case "exchangePattern": target.getExchangePattern(); return true;
        case "extendmessagevisibility":
        case "extendMessageVisibility": target.getConfiguration().isExtendMessageVisibility(); return true;
        case "greedy": target.isGreedy(); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.getHeaderFilterStrategy(); return true;
        case "initialdelay":
        case "initialDelay": target.getInitialDelay(); return true;
        case "kmsdatakeyreuseperiodseconds":
        case "kmsDataKeyReusePeriodSeconds": target.getConfiguration().getKmsDataKeyReusePeriodSeconds(); return true;
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": target.getConfiguration().getKmsMasterKeyId(); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.isLazyStartProducer(); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.getMaxMessagesPerPoll(); return true;
        case "maximummessagesize":
        case "maximumMessageSize": target.getConfiguration().getMaximumMessageSize(); return true;
        case "messageattributenames":
        case "messageAttributeNames": target.getConfiguration().getMessageAttributeNames(); return true;
        case "messagededuplicationidstrategy":
        case "messageDeduplicationIdStrategy": target.getConfiguration().getMessageDeduplicationIdStrategy(); return true;
        case "messagegroupidstrategy":
        case "messageGroupIdStrategy": target.getConfiguration().getMessageGroupIdStrategy(); return true;
        case "messageretentionperiod":
        case "messageRetentionPeriod": target.getConfiguration().getMessageRetentionPeriod(); return true;
        case "operation": target.getConfiguration().getOperation(); return true;
        case "policy": target.getConfiguration().getPolicy(); return true;
        case "pollstrategy":
        case "pollStrategy": target.getPollStrategy(); return true;
        case "protocol": target.getConfiguration().getProtocol(); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().getProxyHost(); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().getProxyPort(); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().getProxyProtocol(); return true;
        case "queueownerawsaccountid":
        case "queueOwnerAWSAccountId": target.getConfiguration().getQueueOwnerAWSAccountId(); return true;
        case "queueurl":
        case "queueUrl": target.getConfiguration().getQueueUrl(); return true;
        case "receivemessagewaittimeseconds":
        case "receiveMessageWaitTimeSeconds": target.getConfiguration().getReceiveMessageWaitTimeSeconds(); return true;
        case "redrivepolicy":
        case "redrivePolicy": target.getConfiguration().getRedrivePolicy(); return true;
        case "region": target.getConfiguration().getRegion(); return true;
        case "repeatcount":
        case "repeatCount": target.getRepeatCount(); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.getRunLoggingLevel(); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.getScheduledExecutorService(); return true;
        case "scheduler": target.getScheduler(); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.getSchedulerProperties(); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().getSecretKey(); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.isSendEmptyMessageWhenIdle(); return true;
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": target.getConfiguration().isServerSideEncryptionEnabled(); return true;
        case "startscheduler":
        case "startScheduler": target.isStartScheduler(); return true;
        case "synchronous": target.isSynchronous(); return true;
        case "timeunit":
        case "timeUnit": target.getTimeUnit(); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.isUseFixedDelay(); return true;
        case "visibilitytimeout":
        case "visibilityTimeout": target.getConfiguration().getVisibilityTimeout(); return true;
        case "waittimeseconds":
        case "waitTimeSeconds": target.getConfiguration().getWaitTimeSeconds(); return true;
        default: return null;
        }
    }
}

