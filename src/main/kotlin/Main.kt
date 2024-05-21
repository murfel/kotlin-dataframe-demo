package org.example

import org.jetbrains.kotlinx.dataframe.DataFrame
import org.jetbrains.kotlinx.dataframe.api.print
import org.jetbrains.kotlinx.dataframe.io.read

// https://kotlin.github.io/dataframe/gettingstartedgradle.html

fun main() {
    var df = DataFrame.read("movies.csv")
    df.print()
}