package com.compose.recyclerapi.domain.repositories

import com.compose.recyclerapi.data.Result
import com.compose.recyclerapi.domain.model.Character
import com.compose.recyclerapi.domain.model.Characters
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    fun getCharacters(page: Int): Flow<Result<List<Characters>>>

    suspend fun getCharacter(id: Int): Result<Character>
}