/*
 * File: FluentJavaApplicationSchema.java
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * The contents of this file are subject to the terms and conditions of 
 * the Common Development and Distribution License 1.0 (the "License").
 *
 * You may not use this file except in compliance with the License.
 *
 * You can obtain a copy of the License by consulting the LICENSE.txt file
 * distributed with this file, or by consulting https://oss.oracle.com/licenses/CDDL
 *
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file LICENSE.txt.
 *
 * MODIFICATIONS:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 */

package com.oracle.tools.runtime.java;

import com.oracle.tools.runtime.ApplicationSchema;
import com.oracle.tools.runtime.FluentApplicationSchema;

/**
 * A {@link FluentJavaApplicationSchema} is a Java specific {@link ApplicationSchema}.
 * <p>
 * Copyright (c) 2014. All Rights Reserved. Oracle Corporation.<br>
 * Oracle is a registered trademark of Oracle Corporation and/or its affiliates.
 *
 * @author Brian Oliver
 *
 * @param <A>  the type of {@link JavaApplication} that can be configured by the {@link FluentJavaApplicationSchema}
 * @param <S>  the type of {@link FluentJavaApplicationSchema} that will be returned from fluent methods
 */
public interface FluentJavaApplicationSchema<A extends JavaApplication, S extends FluentJavaApplicationSchema<A, S>>
    extends FluentApplicationSchema<A, S>,
            JavaApplicationSchema<A>
{
    /**
     * Sets the fully-qualified class name of the class containing the main method
     * for the desired application.
     *
     * @param className  the fully-qualified class name of the "main" class
     *
     * @return the {@link FluentJavaApplicationSchema} to permit fluent-style method calls
     */
    public S setApplicationClassName(String className);


    /**
     * Sets the specified system property.
     *
     * @param name   the name of the system property
     * @param value  the value for the system property
     *
     * @return the {@link FluentJavaApplicationSchema} to permit fluent-style method calls
     */
    public S setSystemProperty(String name,
                               Object value);


    /**
     * Optionally sets the specified system property.
     *
     * @param name   the name of the system property
     * @param value  the value for the system property
     *
     * @return the {@link FluentJavaApplicationSchema} to permit fluent-style method calls
     */
    @SuppressWarnings("unchecked")
    public S setSystemPropertyIfAbsent(String name,
                                       Object value);
}
