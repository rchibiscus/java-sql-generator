/*
 * Copyright (c) 2010, Stanislav Muhametsin. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.sql.generation.api.grammar.manipulation;

import org.sql.generation.api.grammar.common.SchemaManipulationStatement;

/**
 * This is a common interface for {@code DROP} statements.
 * 
 * @author Stanislav Muhametsin
 */
public interface DropStatement
    extends SchemaManipulationStatement, DropBehaviourContainer
{

    /**
     * Returns the object type to drop. Typically either {@link ObjectType#SCHEMA}, {@link ObjectType#TABLE}, or
     * {@link ObjectType#VIEW}.
     * 
     * @return The object type to drop.
     * @see ObjectType
     */
    public ObjectType whatToDrop();

}
