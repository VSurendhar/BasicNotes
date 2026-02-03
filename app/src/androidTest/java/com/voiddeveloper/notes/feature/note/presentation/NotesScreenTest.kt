package com.voiddeveloper.notes.feature.note.presentation

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import com.voiddeveloper.notes.core.TestTags.ORDER_SECTION
import com.voiddeveloper.notes.di.AppModule
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
@UninstallModules(AppModule::class)
class NotesScreenTest {

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @Test
    fun clickToggleOrderSection_isVisible() {
        composeTestRule.onNodeWithTag(ORDER_SECTION).assertDoesNotExist()
        composeTestRule.onNodeWithContentDescription("Sort").performClick()
        composeTestRule.onNodeWithTag(ORDER_SECTION).assertIsDisplayed()
    }

}