package com.example.campusmarketplacejetpack

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.campusmarketplacejetpack.interfaces.ChatList
import com.example.campusmarketplacejetpack.interfaces.ViewPagerExample
import com.example.campusmarketplacejetpack.ui.theme.CampusMarketplaceJetpackTheme

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            CampusMarketplaceJetpackTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val fragments = listOf(
                        FragmentData(title = "Chat"),
                        FragmentData(title = "Status"),
                        FragmentData(title = "Calls")
                    )
                    ViewPagerExample(fragments = fragments)
                    ChatList()
                }
            }
        }
    }
}

data class FragmentData(val title: String)
data class ChatItem(val name: String, val message: String, val time: String, val avatar: Int)

val chatItems = listOf(
    ChatItem("John", "Hey, how's it going?", "10:30 AM", R.drawable.avatar),
    ChatItem("Sarah", "What are you up to?", "9:45 AM", R.drawable.avatar),
    ChatItem("Michael", "Got the tickets!", "Yesterday", R.drawable.avatar),
    ChatItem("Olivia", "Sure, let's meet up!", "3/4/23", R.drawable.avatar),
    ChatItem("David", "Missed call", "3/3/23", R.drawable.avatar),
    // Add more chat items as needed
)