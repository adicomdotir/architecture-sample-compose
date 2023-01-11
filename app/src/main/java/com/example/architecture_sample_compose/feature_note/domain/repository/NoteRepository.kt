package com.example.architecture_sample_compose.feature_note.domain.repository

import com.example.architecture_sample_compose.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(noteId: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}