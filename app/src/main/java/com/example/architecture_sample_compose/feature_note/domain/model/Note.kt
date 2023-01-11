package com.example.architecture_sample_compose.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.architecture_sample_compose.ui.theme.NoteHotPink
import com.example.architecture_sample_compose.ui.theme.NoteMint
import com.example.architecture_sample_compose.ui.theme.NoteTiffanyBlue
import com.example.architecture_sample_compose.ui.theme.NoteYellow

@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(NoteHotPink, NoteTiffanyBlue, NoteMint, NoteYellow)
    }
}

class InvalidNoteException(message: String): Exception(message)