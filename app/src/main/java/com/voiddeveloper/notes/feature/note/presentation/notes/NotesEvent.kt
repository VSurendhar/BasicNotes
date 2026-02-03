package com.voiddeveloper.notes.feature.note.presentation.notes

import com.voiddeveloper.notes.feature.note.domain.model.Note
import com.voiddeveloper.notes.feature.note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note : Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}

