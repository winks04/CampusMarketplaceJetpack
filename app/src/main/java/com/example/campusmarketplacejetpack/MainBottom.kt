//package com.example.campusmarketplacejetpack
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import androidx.activity.compose.setContent
//import androidx.appcompat.app.AppCompatActivity
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.AccountCircle
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.List
//import androidx.compose.material.icons.filled.MailOutline
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Scaffold
//import androidx.navigation.compose.rememberNavController
//import com.example.campusmarketplacejetpack.interfaces.BottomNavigationBar
//import com.example.campusmarketplacejetpack.interfaces.Navigation
//import com.example.campusmarketplacejetpack.ui.theme.CampusMarketplaceJetpackTheme
//
//
//class MainBottom : AppCompatActivity() {
//    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//    @OptIn(ExperimentalMaterial3Api::class)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent{
//            CampusMarketplaceJetpackTheme {
////                BottomNavigationBar()
//            // call functions?
//                val navController = rememberNavController()
//                Scaffold (
//                    bottomBar = {
//                        BottomNavigationBar(
//                            items = listOf(
//                                BottomNavItem(
//                                    name = "Home",
//                                    route = "home",
//                                    icon = Icons.Default.Home
//                                ),
//                                BottomNavItem(
//                                    name = "Shelf",
//                                    route = "shelf",
//                                    icon = Icons.Default.List
//                                ),
//                                BottomNavItem(
//                                    name = "Chat",
//                                    route = "chat",
//                                    icon = Icons.Default.MailOutline
//                                ),
//                                BottomNavItem(
//                                    name = "Account",
//                                    route = "account",
//                                    icon = Icons.Default.AccountCircle
//                                ),
//                            ),
//                            navController = navController,
//                            onItemClick = {
//                                navController.navigate(it.route)
//                            })
//                    }
//                ){
//                    Navigation(navController = navController)
//                }
//            }
//        }
//    }
//}
//
