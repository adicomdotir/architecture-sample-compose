package com.example.architecture_sample_compose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.ui.Modifier
import com.example.architecture_sample_compose.ui.theme.ArchitecturesamplecomposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArchitecturesamplecomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "Btn")
                    }
//                    val navController = rememberNavController()
//
//                    NavHost(
//                        navController = navController,
//                        startDestination = Screen.NotesScreen.route
//                    ) {
//                        composable(
//                            route = Screen.NotesScreen.route
//                        ) {
//                            NotesScreen(navController = navController)
//                        }
//
//                        composable(
//                            route = Screen.AddEditNoteScreen.route +
//                                    "?noteId={noteId}&noteColor={noteColor}",
//                            arguments = listOf(
//                                navArgument(name = "noteId") {
//                                    type = NavType.IntType
//                                    defaultValue = -1
//                                },
//                                navArgument(name = "noteColor") {
//                                    type = NavType.IntType
//                                    defaultValue = -1
//                                }
//                            )
//                        ) {
//                            val color = it.arguments?.getInt("noteColor") ?: -1
//                            AddEditNoteScreen(navController = navController, noteColor = color)
//                        }
//                    }

                }
            }
        }
    }
}

