package edu.eati25.kmp.movies

import androidx.compose.runtime.*
import edu.eati25.kmp.movies.data.database.MoviesDao
import edu.eati25.kmp.movies.ui.screens.Navigation
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(moviesDao: MoviesDao) {
    Navigation(moviesDao)
}
