package org.example

import org.jetbrains.kotlinx.dataframe.DataFrame
import org.jetbrains.kotlinx.dataframe.api.column
import org.jetbrains.kotlinx.dataframe.api.print
import org.jetbrains.kotlinx.dataframe.io.read

// https://kotlin.github.io/dataframe/gettingstartedgradle.html

fun main() {
    val df = DataFrame.read("movies.csv")
    println(df.columnNames())  // [movieId, title, genres]

    // Properties - doesn't work "Unresolved reference: title"
//    df.title

    // Accessors - OK
    val title by column<String>()
    df[title].print()

    // Strings - OK
    df["title"].print()
}