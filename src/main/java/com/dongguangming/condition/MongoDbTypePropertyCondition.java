package com.dongguangming.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MongoDbTypePropertyCondition implements Condition {

	@Override
	public boolean matches(ConditionContext conditionContext,
			AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		  String dbType = conditionContext.getEnvironment()
                  .getProperty("app.dbType");
          return "MONGO".equalsIgnoreCase(dbType);
	}

}
