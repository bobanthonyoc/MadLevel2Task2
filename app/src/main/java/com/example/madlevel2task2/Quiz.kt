package com.example.madlevel2task2

data class Quiz( var quizText: String)

object Supplier {

    val questions = listOf<Quiz>(
        Quiz("A 'val' and 'var' are the same"),
        Quiz("Mobile Application Development grants 12 ECTS"),
        Quiz("A Unit in Kotlin corresponds to a void in Java"),
        Quiz("In Kotlin 'when' replaces the 'switch' operator in Java")
    )
}