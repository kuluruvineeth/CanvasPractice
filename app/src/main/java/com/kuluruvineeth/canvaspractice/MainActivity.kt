package com.kuluruvineeth.canvaspractice

import android.graphics.Paint
import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuluruvineeth.canvaspractice.ui.theme.CanvasPracticeTheme
import kotlinx.coroutines.delay
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Canvas(modifier = Modifier.fillMaxSize()){
                drawContext.canvas.nativeCanvas.apply {
                    drawText(
                        "This is my canvas text",
                        100f,
                        100f,
                        Paint().apply {
                            color = android.graphics.Color.RED
                            textSize = 100f
                        }
                    )
                }
            }
        }
    }
}
/*
@Composable
fun MainScreen(){
    var points by remember{
        mutableStateOf(0)
    }
    var isTimerRunning by remember{
        mutableStateOf(false)
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Points: $points",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Button(onClick = {
                isTimerRunning = !isTimerRunning
                points = 0
            }) {
                Text(text = if(isTimerRunning) "Reset" else "Start")
            }
            CountdownTimer(
                isTimerRunning = isTimerRunning
            ){
                isTimerRunning = false
            }
        }
        BallClicker(
            enabled = isTimerRunning
        ){
            points++

        }
    }
}

@Composable
fun CountdownTimer(
    time: Int = 30000,
    isTimerRunning: Boolean = false,
    onTimerEnd: () -> Unit = {}
){
    var curTime by remember {
        mutableStateOf(time)
    }
    LaunchedEffect(key1 = curTime, key2 = isTimerRunning ){
        if(!isTimerRunning){
            curTime = time
            return@LaunchedEffect
        }
        if(curTime > 0){
            delay(1000L)
            curTime -= 1000
        }else{
            onTimerEnd()
        }
    }
    Text(
        text = (curTime / 1000).toString(),
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun BallClicker(
    radius: Float = 100f,
    enabled: Boolean = false,
    ballColor: Color = Color.Red,
    onBallClick: () -> Unit = {}
){
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        var ballPosition by remember{
            mutableStateOf(
                randomOffset(
                    radius = radius,
                    width = constraints.maxWidth,
                    height = constraints.maxHeight
                ))
        }

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .pointerInput(enabled) {
                    if (!enabled) {
                        return@pointerInput
                    }
                    detectTapGestures {
                        val distance = sqrt(
                            (it.x - ballPosition.x).pow(2) +
                                    (it.y - ballPosition.y).pow(2)
                        )
                        if (distance <= radius) {
                            ballPosition = randomOffset(
                                radius = radius,
                                width = constraints.maxWidth,
                                height = constraints.maxHeight
                            )
                            onBallClick()
                        }
                    }
                }
        ){
            drawCircle(
                color = ballColor,
                radius = radius,
                center = ballPosition
            )
        }
    }

}

private fun randomOffset(radius: Float, width: Int, height: Int): Offset{
    return Offset(
        x = Random.nextInt(radius.roundToInt(),width - radius.roundToInt()).toFloat(),
        y = Random.nextInt(radius.roundToInt(), height - radius.roundToInt()).toFloat()
    )
}
 */

/*
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CanvasPracticeTheme {
        Greeting("Android")
    }
}

@Composable
fun MyCanvas(){
    Canvas(
        modifier = Modifier
            .padding(20.dp)
            .size(300.dp)
    ){
        drawRect(
            color = Color.Black,
            size = size
        )
        drawRect(
            color = Color.Red,
            topLeft = Offset(100f,100f),
            size = Size(100f,100f),
            style = Stroke(
                width = 5f,
            )
        )
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(Color.Red,Color.Yellow),
                center = center,
                radius = 150f
            ),
            radius = 200f,
        )
        drawArc(
            color = Color.Green,
            startAngle = 0f,
            sweepAngle = 300f,
            useCenter = false,
            topLeft = Offset(100f,500f),
            size = Size(200f,200f),
            style = Stroke(
                width = 3.dp.toPx()
            )
        )
        drawOval(
            color = Color.Magenta,
            topLeft = Offset(500f,100f),
            size = Size(200f,300f)
        )
        drawLine(
            color = Color.Cyan,
            start = Offset(300f,700f),
            end = Offset(700f,700f),
            strokeWidth = 5.dp.toPx()
        )
    }
}*/