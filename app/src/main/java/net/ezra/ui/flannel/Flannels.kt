package net.ezra.ui.flannel

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.DrawerValue
import androidx.compose.material.FabPosition
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import com.google.android.material.bottomappbar.BottomAppBar
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
                    Text(text = "Thrift Collection",Modifier.padding(50.dp))
                },
                navigationIcon = {
                    IconButton(onClick = {  navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_FLANNEL) { inclusive = true }
                    }}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
//                backgroundColor = MaterialTheme.colors.primary,
//                contentColor = Color.White,
//                elevation = 10.dp
            )
        },

        content = {

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

            Spacer(modifier = Modifier.height(20.dp))


            LazyColumn() {
                item() {
                       
                        LazyRow {
                            item { 
                                Card {
                                    Image(painter = painterResource(id = R.drawable.f1), contentDescription = "")
                                    
                                    Text(text = "F1")
                                }
                                
                                
                                
                            }
                            
                            
                            
                        }
                        
                        
                    

                }
            }













        },

        bottomBar = { BottomBar(navController) }




    )



}


@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"")
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {

                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_FLANNEL) { inclusive = true }
                }
            })



        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"")
        },
            label = { Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                navController.navigate(ROUTE_FLANNEL) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })



        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                navController.navigate(ROUTE_FLANNEL) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }
            })
    }
}

















@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    FlannelScreen(rememberNavController())
}

