package com.voiddeveloper.notes.feature.note.domain.usecase

import com.voiddeveloper.notes.feature.note.domain.model.InvalidNteException
import com.voiddeveloper.notes.feature.note.domain.model.Note
import com.voiddeveloper.notes.feature.note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository,
) {

    @Throws(InvalidNteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNteException("The title of the note can't be empty")
        }
        if(note.content.isBlank()){
            throw InvalidNteException("The content of the note can't be empty")
        }
        repository.insertNote(note)
    }

}