package com.dongguangming.condition;

import java.util.Map;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.dongguangming.annotation.DatabaseType;

public class DatabaseTypeCondition implements Condition {

	    @Override
	    public boolean matches(ConditionContext conditionContext,
	    AnnotatedTypeMetadata metadata)
	    {
	        Map<String, Object> attributes = metadata.getAnnotationAttributes(DatabaseType.class.getName());
	        String type = (String) attributes.get("value");
	        System.out.println("value:"+type);
	        
	        String enabledDBType = conditionContext.getEnvironment().getProperty("dbType","MYSQL");
	        System.out.println("enabledDBType:"+enabledDBType);

	        return (enabledDBType != null && type != null && enabledDBType.equalsIgnoreCase(type));
	    }

}
