package com.voiddeveloper.notes.feature.note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.voiddeveloper.notes.feature.note.presentation.theme.BabyBlue
import com.voiddeveloper.notes.feature.note.presentation.theme.LightGreen
import com.voiddeveloper.notes.feature.note.presentation.theme.RedOrange
import com.voiddeveloper.notes.feature.note.presentation.theme.RedPink
import com.voiddeveloper.notes.feature.note.presentation.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null,
) {

    companion object {
        val noteColors = listOf(
            RedOrange,
            LightGreen,
            Violet,
            BabyBlue,
            RedPink
        )
    }

}

class InvalidNteException(message: String) : Exception(message)

