package com.github.mikan.sample.roborazzi

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.window.Dialog
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.captureScreenRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.GraphicsMode

@RunWith(AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
class ComposableTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun addition_isCorrect() {
        composeTestRule.setContent {
            Dialog({}) {
                Greeting("Android")
            }
        }
        captureScreenRoboImage()
    }
}