package com.voiddeveloper.notes.feature.note.data.repository

import com.voiddeveloper.notes.feature.note.data.datasource.NoteDao
import com.voiddeveloper.notes.feature.note.domain.model.Note
import com.voiddeveloper.notes.feature.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val dao: NoteDao) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }

}