package net.ezra.ui.flannel

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_FLANNEL
import net.ezra.navigation.ROUTE_FLANNEL
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_PRODUCTS


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FlannelScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Top App Bar")
                },
                navigationIcon = {
                    IconButton(onClick = {navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_FLANNEL) { inclusive = true }
                    }}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
             //   backgroundColor = MaterialTheme.colors.primary,
               // contentColor = Color.White,
               // elevation = 10.dp
            )
        }, content = {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xff8d6e63)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
               item {



                   Box {
                       Image(painter = painterResource(id = R.drawable.cover), contentDescription = "",
                           modifier= Modifier
////        .background(Color.Cyan)
                               .fillMaxSize()
////                .clip(RoundedCornerShape(50))
                               .size(200.dp),
//
////    colorFilter = ColorFilter.tint(Color.Red),
                           contentScale= ContentScale.Crop
                           //contentScale = ContentScale.FillBounds

                       )


                   }












                   Column {
                       Text(text = "Flannels")

                       Text(text = stringResource(id = R.string.mit))

                       Text(
                           modifier = Modifier

                               .clickable {
                                   navController.navigate(ROUTE_HOME) {
                                       popUpTo(ROUTE_FLANNEL) { inclusive = true }
                                   }
                               },
                           text = "Home",
                           textAlign = TextAlign.Center,
                           color = MaterialTheme.colorScheme.onSurface
                       )
                   }

               }


            }

        })














}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    FlannelScreen(rememberNavController())
}

