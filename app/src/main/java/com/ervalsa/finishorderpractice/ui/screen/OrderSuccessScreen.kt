package com.ervalsa.finishorderpractice.ui.screen

import android.os.Build
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ervalsa.finishorderpractice.R
import com.ervalsa.finishorderpractice.ui.theme.Gray
import com.ervalsa.finishorderpractice.ui.theme.Yellow
import com.ervalsa.finishorderpractice.ui.theme.poppinsFamily

@Composable
fun OrderSuccessScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier
                .size(200.dp),
            painter = painterResource(
                id = R.drawable.ill_success_order),
            contentDescription = "Success Order Illustration"
        )
        Spacer(Modifier.height(30.dp))
        Text(
            text = "You've Made Order",
            fontSize = 20.sp,
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text = "Just stay at home while we are preparing your best foods",
            fontSize = 14.sp,
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Light,
            color = Color.Black,
            modifier = Modifier.padding(end = 75.dp, start = 75.dp),
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(30.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(45.dp)
                .width(200.dp),
            colors = ButtonDefaults.buttonColors(Yellow),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = "Order Other Foods",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = poppinsFamily,
                color = Color.Black
            )
        }
        Spacer(Modifier.height(8.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(45.dp)
                .width(200.dp),
            colors = ButtonDefaults.buttonColors(Gray),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = "View My Order",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = poppinsFamily,
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OrderSucessScreenPreview() {
    OrderSuccessScreen()
}
