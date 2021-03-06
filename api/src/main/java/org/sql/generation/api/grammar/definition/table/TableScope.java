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

package org.sql.generation.api.grammar.definition.table;

/**
 * This enum is for table scope in table definition. The scope may be either {@link #GLOBAL_TEMPORARY} or
 * {@link #LOCAL_TEMPORARY}.
 * 
 * @author Stanislav Muhametsin
 * @see TableDefinition
 */
public final class TableScope
{

    /**
     * This value represents the {@code GLOBAL TEMPORARY} table.
     */
    public static final TableScope GLOBAL_TEMPORARY = new TableScope();

    /**
     * This value represents the {@code LOCAL TEMPORARY} table.
     */
    public static final TableScope LOCAL_TEMPORARY = new TableScope();
}
