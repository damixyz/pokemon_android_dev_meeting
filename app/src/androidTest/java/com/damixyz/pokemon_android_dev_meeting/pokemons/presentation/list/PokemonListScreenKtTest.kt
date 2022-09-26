package com.damixyz.pokemon_android_dev_meeting.pokemons.presentation.list

import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.damixyz.pokemon_android_dev_meeting.pokemons.presentation.MainActivity
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

//@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class PokemonListScreenKtTest {

    @get:Rule
    val rule = createAndroidComposeRule<MainActivity>()

//    @get:Rule(order = 0)
//    var hiltRule = HiltAndroidRule(this)

    @Test
    fun givenEmptyStateIsSentThenListWasEmptyMessageWasShow() {
        rule.onNode(
            hasText("List was empty")
        ).assertExists()
        Thread.sleep(500)
    }
}