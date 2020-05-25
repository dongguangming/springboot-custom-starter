package com.dongguangming.condition;

import java.util.Map;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.dongguangming.annotation.LogServiceType;

public class LogServiceTypeCondition implements Condition {

	    @Override
	    public boolean matches(ConditionContext conditionContext,
	    AnnotatedTypeMetadata metadata)
	    {
	        Map<String, Object> attributes = metadata.getAnnotationAttributes(LogServiceType.class.getName());
	        String type = (String) attributes.get("value");
	        System.out.println("value:"+type);
	        //conditionContext.getEnvironment().getProperty(key)
	        String enabledLogType = conditionContext.getEnvironment().getProperty("logType","StdOut");
	        System.out.println("enabledLogType:"+enabledLogType);

	        return (enabledLogType != null && type != null && enabledLogType.equalsIgnoreCase(type));
	    }
}
