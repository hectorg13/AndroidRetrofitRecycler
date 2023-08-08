package com.compose.recyclerapi.domain.use_case

import com.compose.recyclerapi.data.Result
import com.compose.recyclerapi.domain.model.Characters
import com.compose.recyclerapi.domain.repositories.CharacterRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    operator fun invoke(page: Int): Flow<Result<List<Characters>>> {
        return repository.getCharacters(page)
    }
}