/*
 * Copyright 2023 Expedia, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.expediagroup.graalvm.ktor.schema

import com.expediagroup.graphql.generator.scalars.ID
import com.expediagroup.graphql.server.operations.Query
import java.util.UUID

/**
 * Queries used to verify returning/accepting ID.
 */
class IdQuery : Query {
    fun idQuery(): ID = ID(UUID.randomUUID().toString())
    fun nullableIdQuery(): ID? = null
    fun idArg(arg: ID): ID = ID(arg.value.reversed())
    fun optionalIdArg(arg: ID? = null): ID? = arg?.let { ID(it.value.reversed()) }
}
