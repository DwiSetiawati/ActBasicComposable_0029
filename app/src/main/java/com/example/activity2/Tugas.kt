package com.example.activity2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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