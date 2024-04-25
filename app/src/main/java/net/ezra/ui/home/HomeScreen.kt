package net.ezra.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import io.grpc.okhttp.internal.framed.Header
import net.ezra.navigation.ROUTE_FLANNEL
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {


    Box {
        Image(painter = painterResource(id = R.drawable.bib), contentDescription = "",
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

Column(modifier=Modifier
    .background(color=Color.Yellow)

    ,
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Text(text = "THRIFT COLLECTION")
}

    LazyColumn(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()
        ,
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        item {

            Spacer(modifier = Modifier.height(15.dp))


            Row(
                modifier = Modifier
                    .padding(10.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly
            ) {

                Card(modifier= Modifier
                    .size(150.dp)
                    .clickable {

                    }

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.trouser2),
                        contentDescription = "",
                        modifier= Modifier
////        .background(Color.Cyan)
                            .fillMaxSize()
////                .clip(RoundedCornerShape(50))
                            .size(200.dp),
//
                    )
//               TextButton(onClick = { /*TODO*/ },
//                   modifier=Modifier,
//                   ButtonColors
//                   )
//               {
//                   Text(text = "Flannels")
//               }

                    TextButton(onClick = { /*TODO*/ }) {

                        Text(text = "Trousers")
                    }
                }


                Spacer(modifier = Modifier.width(35.dp))

                Card(modifier= Modifier
                    .size(150.dp)
                    .clickable {

                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.blazer3),
                        contentDescription = "",
                        modifier= Modifier
////        .background(Color.Cyan)

                            .fillMaxSize()
////                .clip(RoundedCornerShape(50))
                            .size(200.dp),

                    )
//               TextButton(onClick = { /*TODO*/ },
//                   modifier=Modifier,
//                   ButtonColors
//                   )
//               {
//                   Text(text = "Flannels")
//               }

                    TextButton(onClick = { /*TODO*/ }) {

                        Text(text = "Blazers")
                    }
                }

            }





            Spacer(modifier = Modifier.height(15.dp))

            Row(
                modifier = Modifier
                    .padding(5.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly
            ) {

                Card(modifier= Modifier
                    .size(150.dp)
                    .clickable {

                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hats),
                        contentDescription = ""
                    )
//               TextButton(onClick = { /*TODO*/ },
//                   modifier=Modifier,
//                   ButtonColors
//                   )
//               {
//                   Text(text = "Flannels")
//               }

                    TextButton(onClick = { /*TODO*/ }) {

                        Text(text = "Hats")
                    }
                }


                Spacer(modifier = Modifier.width(35.dp))

                Card(modifier= Modifier
                    .size(150.dp)
                    .clickable {

                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.belts),
                        contentDescription = ""
                    )
//               TextButton(onClick = { /*TODO*/ },
//                   modifier=Modifier,
//                   ButtonColors
//                   )
//               {
//                   Text(text = "Flannels")
//               }

                    TextButton(onClick = { /*TODO*/ }) {

                        Text(text = "Belts")
                    }
                }

            }







            Row(
                modifier = Modifier
                    .padding(10.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly
            ) {

                Card(modifier= Modifier
                    .size(150.dp)
                    .clickable {
                        navController.navigate(ROUTE_FLANNEL) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.flannel),
                        contentDescription = ""
                    )
//               TextButton(onClick = { /*TODO*/ },
//                   modifier=Modifier,
//                   ButtonColors
//                   )
//               {
//                   Text(text = "Flannels")
//               }

                        Text(text = "Flannels")

                }


                Spacer(modifier = Modifier.width(35.dp))

                Card(modifier = Modifier
                    .size(150.dp)
                    .clickable {

                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.jacket1),
                        contentDescription = ""
                    )
//               TextButton(onClick = { /*TODO*/ },
//                   modifier=Modifier,
//                   ButtonColors
//                   )
//               {
//                   Text(text = "Flannels")
//               }

                    TextButton(onClick = { /*TODO*/ }) {

                        Text(text = "Jackets")
                    }
                }

            }



            Spacer(modifier = Modifier.height(15.dp))

            Row(
                modifier = Modifier
                    .padding(10.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly
            ) {

                Card(modifier= Modifier
                    .size(150.dp)
                    .clickable {

                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.wt),
                        contentDescription = ""
                    )
//               TextButton(onClick = { /*TODO*/ },
//                   modifier=Modifier,
//                   ButtonColors
//                   )
//               {
//                   Text(text = "Flannels")
//               }

                    TextButton(onClick = { /*TODO*/ }) {

                        Text(text = "Shirts")
                    }
                }


                Spacer(modifier = Modifier.width(35.dp))

                Card(modifier= Modifier
                    .size(150.dp)
                    .clickable {

                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.tshirt1),
                        contentDescription = ""
                    )
//               TextButton(onClick = { /*TODO*/ },
//                   modifier=Modifier,
//                   ButtonColors
//                   )
//               {
//                   Text(text = "Flannels")
//               }

                    TextButton(onClick = { /*TODO*/ }) {

                        Text(text = "T-Shirts")
                    }
                }

            }

















        }
    }

        }


















@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

