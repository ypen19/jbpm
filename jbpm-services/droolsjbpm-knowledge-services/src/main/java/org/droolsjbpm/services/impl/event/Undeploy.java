package org.droolsjbpm.services.impl.event;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
@Target({PARAMETER, FIELD})
@Retention(RUNTIME)
public @interface Undeploy {

}
