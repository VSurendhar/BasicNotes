package com.voiddeveloper.notes.feature.note.di

import android.app.Application
import androidx.room.Room
import com.voiddeveloper.notes.feature.note.data.datasource.NoteDatabase
import com.voiddeveloper.notes.feature.note.data.repository.NoteRepositoryImpl
import com.voiddeveloper.notes.feature.note.domain.repository.NoteRepository
import com.voiddeveloper.notes.feature.note.domain.usecase.AddNote
import com.voiddeveloper.notes.feature.note.domain.usecase.DeleteNoteUseCase
import com.voiddeveloper.notes.feature.note.domain.usecase.GetNoteUseCase
import com.voiddeveloper.notes.feature.note.domain.usecase.GetNotesUseCase
import com.voiddeveloper.notes.feature.note.domain.usecase.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TestAppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.inMemoryDatabaseBuilder(
            app,
            NoteDatabase::class.java,
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }


    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotesUseCase(repository),
            deleteNote = DeleteNoteUseCase(repository),
            getNote = GetNoteUseCase(repository),
            addNote = AddNote(repository)
        )
    }

}