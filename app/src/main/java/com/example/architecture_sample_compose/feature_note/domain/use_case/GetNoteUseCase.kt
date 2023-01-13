package com.example.architecture_sample_compose.feature_note.domain.use_case

import com.example.architecture_sample_compose.feature_note.domain.model.Note
import com.example.architecture_sample_compose.feature_note.domain.repository.NoteRepository
import com.example.architecture_sample_compose.feature_note.domain.util.NoteOrder
import com.example.architecture_sample_compose.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(
        id: Int
    ): Note? {
        return repository.getNoteById(id)
    }
}