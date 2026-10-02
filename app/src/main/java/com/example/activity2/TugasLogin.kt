package com.example.activity2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val CyanAksen = Color(0xFF4FC3F7)
private val EmasAksen = Color(0xFFFFD54F)
private val PutihLembut = Color(0xFFEAF6FF)
private val KartuGelap = Color(0xB3081A2E)
private val LapisanGelap = Color(0x66000000)

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {

        // Lapisan 1: background
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Lapisan 2: lapisan gelap tipis supaya teks lebih terbaca
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(LapisanGelap)
        )

        // Lapisan 3: konten
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 48.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "Ini adalah halaman login,",
                color = Color.White,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Logo UMY: lingkaran putih + logo dipotong bulat (sudut hitam hilang)
            Box(
                modifier = Modifier
                    .size(132.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .border(3.dp, EmasAksen, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_umy),
                    contentDescription = "Logo UMY",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(116.dp)
                        .clip(CircleShape)
                )
            }

            Spacer(modifier = Modifier.height(48.dp))

            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(KartuGelap)
                    .border(1.dp, CyanAksen, RoundedCornerShape(16.dp))
                    .padding(horizontal = 32.dp, vertical = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Nama",
                    color = CyanAksen,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Dwi Setiawati",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "20240140029",
                    color = EmasAksen,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            Box(
                modifier = Modifier
                    .size(260.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF0B1F33))
                    .border(4.dp, CyanAksen, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.brain),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}