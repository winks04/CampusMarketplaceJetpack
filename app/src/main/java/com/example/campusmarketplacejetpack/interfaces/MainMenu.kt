package com.example.campusmarketplacejetpack.interfaces

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.campusmarketplacejetpack.BottomNavItem
import com.example.campusmarketplacejetpack.ui.theme.CampusMarketplaceJetpackTheme
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.selects.whileSelect

@Composable
fun Navigation(navController: NavHostController){
    NavHost(navController = navController, startDestination = "home"){
        composable("home"){
            HomeScreen()
        }
        composable("shelf"){
            ShelfScreen()
        }
        composable("chat"){
            ChatScreen()
        }
        composable("account"){
            AccountScreen()
        }
    }
}


//@Composable
//fun BottomNavigationBar(
//    items: List<BottomNavItem>,
//    navController: NavController,
//    modifier: Modifier = Modifier,
//    onItemClick: (BottomNavItem) -> Unit
//) {
//    val backStackEntry = navController.currentBackStackEntryAsState()
//    BottomNavigation(
//        mdifier = modifier,
//        backgroundColor = Color.DarkGray,
//        elevation = 5.dp
//    )
////    BottomAppBar (
////        modifier = modifier,
////        containerColor = Color.DarkGray,
////        tonalElevation = 5.dp
////    )
//    {
//        items.forEach { item ->
//            val selected = item.route == backStackEntry.value?.destination?.route
////           BottomNavigationView(
////                onItemClick = item)
//            BottomNavigationItem(
//                selected = selected,
//                selectedContentColor = Color.Green,
//                unselectedContentColor = Color.Gray,
//                onClick = {onItemClick(item)},
//                icon = {
//                    Column(horizontalAlignment = CenterHorizontally) {
////                          //notification numbers not wanted
//////                          if(item.badgeCount > 0) {
//////                              BadgedBox(
//////                                  badgeContent = {
//////                                      Text(text = item.badgeCount.toString())
//////                                  }
//////                              ) {
////                                  Icon(
////                                      imageVector = item.icon,
////                                      contentDescription = item.name
////                                  )
//////                              }
//////                          } else {
//                        Icon(
//                            imageVector = item.icon,
//                            contentDescription = item.name
//                        )
//////                          }
////                          if(selected) {
////                              Text(
////                                  text = item.name,
////                                  textAlign = TextAlign.Center,
////                                  fontSize = 10.sp
////                                  )
////                              //put other page acorrding to the selected page
////                          }
////                      }
//                    }
//                }
//            )
//        }
//
//    }
//}

//@Composable
//fun BottomNavigationItem(selected: Boolean, selectedContentColor: Color, unselectedContentColor: Color, onClick: () -> Unit, icon: (
//
//        ) -> Unit) {
//
//}
// https://www.youtube.com/watch?v=4xyRnIntwTo&list=PLQkwcJG4YTCSpJ2NLhDTHhi6XBNfk9WiC&index=20 8:50



@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Home Screen")
    }
}
@Composable
fun ShelfScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Shelf Screen")
    }
}
@Composable
fun ChatScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Chat Screen")
    }
}
@Composable
fun AccountScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Account Screen")
    }
}


//@Preview(showBackground = true, device = "id:Nexus One", showSystemUi = true)
//@Composable
//fun MainMenu() {
//    CampusMarketplaceJetpackTheme {
////        BottomNavigationBar()
//    }
//}

