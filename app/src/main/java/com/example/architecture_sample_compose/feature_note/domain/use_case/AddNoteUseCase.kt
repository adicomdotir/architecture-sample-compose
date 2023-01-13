package com.example.architecture_sample_compose.feature_note.domain.use_case

import com.example.architecture_sample_compose.feature_note.domain.model.InvalidNoteException
import com.example.architecture_sample_compose.feature_note.domain.model.Note
import com.example.architecture_sample_compose.feature_note.domain.repository.NoteRepository
import com.example.architecture_sample_compose.feature_note.domain.util.NoteOrder
import com.example.architecture_sample_compose.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class AddNoteUseCase(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(
        note: Note
    ) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of note can't be empty.")
        }
        repository.insertNote(note)
    }
}