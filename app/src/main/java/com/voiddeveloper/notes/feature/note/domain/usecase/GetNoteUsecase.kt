package com.voiddeveloper.notes.feature.note.domain.usecase

import com.voiddeveloper.notes.feature.note.domain.model.Note
import com.voiddeveloper.notes.feature.note.domain.repository.NoteRepository

class GetNoteUseCase(private val repository: NoteRepository) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }

}