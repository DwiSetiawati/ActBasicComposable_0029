package com.example.activity2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 32.dp, start = 24.dp, end = 24.dp)) {
        Text(text = "Komponen1", color = Color(0xFF1565C0), fontSize = 18.sp)
        Text(text = "Komponen2", color = Color(0xFF2E7D32), fontSize = 18.sp)
        Text(text = "Komponen3", color = Color(0xFFC62828), fontSize = 18.sp)
        Text(text = "Komponen4", color = Color(0xFF6A1B9A), fontSize = 18.sp)
    }
}

@Composable
fun TugasRow(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1", fontWeight = FontWeight.Bold, color = Color(0xFF1565C0))
        Text(text = "Komponen2", fontWeight = FontWeight.Bold, color = Color(0xFF2E7D32))
        Text(text = "Komponen3", fontWeight = FontWeight.Bold, color = Color(0xFFC62828))
        Text(text = "Komponen4", fontWeight = FontWeight.Bold, color = Color(0xFF6A1B9A))
    }
}

@Composable
fun TugasBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1", fontSize = 24.sp)
        Text(text = "Column 1", fontSize = 20.sp)
        Text(text = "Row 1", fontSize = 16.sp)
        Text(text = "Box 2", fontSize = 12.sp)
        Text(text = "Column 2", fontSize = 8.sp)
    }
}

@Composable
fun TugasColumnRow(modifier: Modifier) {
    Column {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1", color = Color.Blue)
            Text(text = "Komponen2Baris1", color = Color.Blue)
            Text(text = "Komponen3Baris1", color = Color.Blue)
        }
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2", color = Color.Magenta)
            Text(text = "Komponen2Baris2", color = Color.Magenta)
            Text(text = "Komponen3Baris2", color = Color.Magenta)
        }
    }
}

@Composable
fun TugasRowColumn(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column {
            Text(text = "Komponen1Kolom1", color = Color(0xFF00695C))
            Text(text = "Komponen2Kolom1", color = Color(0xFF00695C))
            Text(text = "Komponen3Kolom1", color = Color(0xFF00695C))
        }
        Column {
            Text(text = "Komponen1Kolom2", color = Color(0xFFEF6C00))
            Text(text = "Komponen2Kolom2", color = Color(0xFFEF6C00))
            Text(text = "Komponen3Kolom2", color = Color(0xFFEF6C00))
        }
    }
}