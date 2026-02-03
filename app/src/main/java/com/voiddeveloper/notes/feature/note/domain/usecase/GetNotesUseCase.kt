package com.voiddeveloper.notes.feature.note.domain.usecase

import com.voiddeveloper.notes.feature.note.domain.model.Note
import com.voiddeveloper.notes.feature.note.domain.repository.NoteRepository
import com.voiddeveloper.notes.feature.note.domain.util.NoteOrder
import com.voiddeveloper.notes.feature.note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotesUseCase(private val repository: NoteRepository) {

    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    ): Flow<List<Note>> {
        return repository.getNotes().map { notes ->

            when (noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }
                }

                OrderType.Descending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }
                }

            }
        }
    }

}