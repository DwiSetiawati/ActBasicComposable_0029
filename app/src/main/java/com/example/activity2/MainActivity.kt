package com.example.activity2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.activity2.ui.theme.Activity2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Activity2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // 1. Modul asli (TataLetak.kt)
                    // TataletakBoxColumnRow(modifier = Modifier.padding(innerPadding))

                    // 2. Style diubah (Tugas.kt)
                    // TugasBoxColumnRow(modifier = Modifier.padding(innerPadding))

                    // 3. Halaman login (TugasLogin.kt)
                    TugasLogin(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}