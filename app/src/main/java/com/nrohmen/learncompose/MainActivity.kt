package com.nrohmen.learncompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Container
import androidx.ui.layout.Row
import androidx.ui.layout.WidthSpacer
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.material.themeTextStyle
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Preview("Try Compose")
@Composable
fun TryPreview() {
    MaterialTheme {
        TryCompose()
    }
}

@Composable
fun TryCompose(){
    Card(shape = RoundedCornerShape(4.dp)){
        Row {
            DrawImage(+imageResource(R.drawable.android))
            WidthSpacer(20.dp)
            Container(width = 200.dp, height = 118.dp) {
                Text("Welcome Jetpack Compose!",
                        style = +themeTextStyle {
                            body1.copy(color = Color.White)
                        })
            }
        }
    }
}