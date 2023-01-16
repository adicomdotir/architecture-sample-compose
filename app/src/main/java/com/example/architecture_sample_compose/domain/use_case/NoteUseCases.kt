package com.example.architecture_sample_compose.domain.use_case

data class NoteUseCases(
    val getNoteUseCase: GetNoteUseCase,
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase
)