package com.example.modcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.modcompose.ui.theme.RCDA31Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleList()
        }
    }
}


@Composable
fun RowAndColumnExample() {

    Column() {
        Text(text = "Exemple d'utilisation de row et column")
        Row {
            Text(text = "Element 1")
            Text(text = "Element 2")
            Text(text = "Element 3")
        }
        Column {
            Text(text = "Element 4")
            Text(text = "Element 5")
            Text(text = "Element 6")
        }
    }
}


@Composable
fun BoxExample() {
    Box(contentAlignment = Alignment.BottomStart) {
        Image(
            painter = painterResource(id = R.drawable.hero),
            contentDescription = "Hero"
        )
        Icon(
            imageVector = Icons.Default.Call,
            contentDescription = null,
            tint = Color.Red
        )
    }
}

@Composable
fun SpacerExample(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("La communauté de l'anneau")
        Spacer(modifier = modifier.height(4.dp))
        Row(modifier = modifier.height(IntrinsicSize.Min)) {
            Spacer(
                modifier = modifier
                    .width(2.dp)
                    .background(Color.Red)
                    .fillMaxHeight()
            )
            Text(
                "Les deux tours",
                modifier = modifier.padding(horizontal = 4.dp)
            )
            Spacer(
                modifier = modifier
                    .width(2.dp)
                    .background(Color.Red)
                    .fillMaxHeight()
            )
        }

        Spacer(modifier = modifier.height(4.dp))
        Text("Le retour du roi")
    }
}

@Composable
fun ArticleIcon(
    index: String,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .background(Color.Red, CircleShape)
            .size(70.dp)
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = index,
            fontSize = 50.sp
        )
    }
}

@Composable
fun ArticleItem(index: String, articleName: String) {

    var isChecked by rememberSaveable {
        mutableStateOf(false)
    }

    Surface(
        border = BorderStroke(2.dp, Color.Green),
        shape = RoundedCornerShape(20.dp),
        shadowElevation = 20.dp
    ) {


        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)

        ) {
            ArticleIcon(index = index)
            Text(
                text = articleName,
                fontSize = 40.sp
            )
            Checkbox(checked = isChecked,
                onCheckedChange = { isChecked = !isChecked })
        }

    }

}


@Composable
fun ArticleList() {

    val articles = List(100) {
        "Article $it"
    }

    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        itemsIndexed(articles) { index, item ->
            ArticleItem(index = index.toString(), articleName = item)
        }
    }

}


@Preview
@Composable
fun Preview() {
    ArticleList()
}

