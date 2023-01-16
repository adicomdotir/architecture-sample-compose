package com.example.architecture_sample_compose.domain.use_case

import com.example.architecture_sample_compose.domain.model.Note
import com.example.architecture_sample_compose.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }

}