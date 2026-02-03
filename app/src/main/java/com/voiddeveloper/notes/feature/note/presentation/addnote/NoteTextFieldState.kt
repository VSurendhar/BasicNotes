package com.voiddeveloper.notes.feature.note.presentation.addnote

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true,
)