package com.voiddeveloper.notes.feature.note.domain.usecase

data class NoteUseCases(
    val getNotes: GetNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
    val addNote: AddNote,
    val getNote: GetNoteUseCase,
)
