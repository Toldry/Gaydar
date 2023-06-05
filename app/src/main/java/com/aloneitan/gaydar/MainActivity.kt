//package com.aloneitan.gaydar
//
//import android.media.MediaPlayer
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Button
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.aloneitan.gaydar.ui.theme.GaydarTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            GaydarTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                    SimpleButton()
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Surface(color = Color.Cyan) {
//        Text(
//            text = "Hi, my name is $name!",
//            modifier = modifier.padding(24.dp)
//        )
//    }
//}
//
//@Preview(showBackground = false)
//@Composable
//fun GaydarPreview() {
//    GaydarTheme {
//        Greeting("Android")
//    }
//}
//
//@Composable
//fun SimpleButton() {
//    val currentContext = LocalContext.current
//    Button(onClick = {
//        val mediaPlayer: MediaPlayer = MediaPlayer.create(currentContext, R.raw.grindr_notification)
//        mediaPlayer.start()
//    }) {
//        Text(text = "")
//    }
//}



package com.aloneitan.gaydar

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.aloneitan.gaydar.ui.theme.GaydarTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaydarTheme {
                // on below line we are specifying
                // background color for our application
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // on below line we are specifying theme as scaffold.
                    Scaffold(
                        // in scaffold we are specifying top bar.
//                        topBar = {
//                            // inside top bar we are
//                            // specifying background color.
//                            TopAppBar(
//                                // along with that we are specifying
//                                // title for our top bar.
//                                title = {
//                                    // in the top bar we are specifying
//                                    // title as a text
//                                    Text(
//                                        // on below line we are specifying
//                                        // text to display in top app bar.
//                                        text = "Gaydar",
//
//                                        color = Color.White,
//
//                                        // on below line we are specifying
//                                        // modifier to fill max width.
//                                        modifier = Modifier.fillMaxWidth(),
//
//                                        // on below line we are
//                                        // specifying text alignment.
//                                        textAlign = TextAlign.Center,
//
//                                        // on below line we are
//                                        // specifying color for our text.
//                                    )
//                                }
//                            )
//                        }
                    ) {
                        // on below line we are calling open
                        // URL method to open our URL
                        openURL()
                    }
                }
            }
        }
    }
}

// 2023-06-05 aloneitan: I copied the layout from here:
// https://www.geeksforgeeks.org/android-jetpack-compose-button-with-icon-and-text/

@Composable
fun openURL() {

    // in the below line, we are
    // creating variables for URL
    val url = remember {
        mutableStateOf(TextFieldValue())
    }

    // on below line we are creating
    // a variable for a context
    val ctx = LocalContext.current

    // on the below line we are creating a column
    Column(
        // on the below line we are specifying modifier
        // and setting max height and max width
        // for our column
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .fillMaxWidth()
            // on below line we are
            // adding padding for our column
            .padding(5.dp),
        // on below line we are specifying horizontal
        // and vertical alignment for our column
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

//        Text(
//            "Combine Text and Image in Button",
//            textAlign = TextAlign.Center,
//            style = TextStyle(
//                fontFamily = FontFamily.Default,
//                fontSize = 20.sp,
//                fontWeight = FontWeight.Bold
//            )
//        )
//        // on below line adding a spacer.
//        Spacer(modifier = Modifier.height(20.dp))

        // on below line adding a button to open URL
        Button(onClick = {
//            Toast.makeText(ctx, "Welcome to Geeks for Geeks", Toast.LENGTH_SHORT).show()
                val mediaPlayer: MediaPlayer = MediaPlayer.create(ctx, R.raw.grindr_notification)
            mediaPlayer.start()

        }) {
            Column(
                // on below line we are specifying modifier
                // and setting max height and max width
                // for our column
                modifier = Modifier
                    // on below line we are
                    // adding padding for our column
                    .padding(5.dp),
                // on the below line we are specifying horizontal
                // and vertical alignment for our column
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    // on below line we are specifying the drawable
                    // image for our image.
                    painter = painterResource(id = R.drawable.gaydar_logo),

                    // on below line we are specifying
                    // content description for our image
                    contentDescription = "Image",

                    // on below line we are setting height
                    // and width for our image.
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)

                )
//                // adding spacer on below line.
//                Spacer(Modifier.height(10.dp))
//
//                // adding text on below line.
//                Text(
//                    // specifying text as android
//                    "Android",
//
//                    // on below line adding style
//                    style = TextStyle(fontWeight = FontWeight.Bold),
//
//                    // adding text align on below line.
//                    textAlign = TextAlign.Center,
//
//                    // adding font size on below line.
//                    fontSize = 20.sp
//                )

            }
        }
    }
}