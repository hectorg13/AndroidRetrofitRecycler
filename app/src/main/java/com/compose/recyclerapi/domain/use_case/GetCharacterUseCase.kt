package com.compose.recyclerapi.domain.use_case

import com.compose.recyclerapi.data.Result
import com.compose.recyclerapi.domain.model.Character
import com.compose.recyclerapi.domain.repositories.CharacterRepository
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(id: Int): Result<Character> {
        return repository.getCharacter(id)
    }
}