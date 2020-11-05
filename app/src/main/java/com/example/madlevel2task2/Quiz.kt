package com.example.madlevel2task2

import androidx.recyclerview.widget.ItemTouchHelper

data class Quiz( var quizText: String)

object Supplier {

    val questions = listOf<Quiz>(
        Quiz("A 'val' and 'var' are the same"),
        Quiz("Mobile Application Development grants 12 ECTS"),
        Quiz("A Unit in Kotlin corresponds to a void in Java"),
        Quiz("In Kotlin 'when' replaces the 'switch' operator in Java")
    )

    private const val correct = ItemTouchHelper.RIGHT
    private const val incorrect = ItemTouchHelper.LEFT
}