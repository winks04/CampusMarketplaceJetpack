package com.example.campusmarketplacejetpack.interfaces

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.campusmarketplacejetpack.ChatItem
import com.example.campusmarketplacejetpack.FragmentData
import com.example.campusmarketplacejetpack.chatItems


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewPagerExample(fragments: List<FragmentData>) {
    val selectedTabIndex = remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TabRow(
                selectedTabIndex = selectedTabIndex.value,
                //backgroundColor = /* Set desired background color */,
                //contentColor = /* Set desired text color */
            ) {
                fragments.forEachIndexed { index, fragment ->
                    Tab(
                        text = { Text(text = fragment.title) },
                        selected = selectedTabIndex.value == index,
                        onClick = { selectedTabIndex.value = index }
                    )
                }
            }
        }
    ) {
//        LazyColumn {
//            itemsIndexed(fragments) { index, fragment ->
//                if (selectedTabIndex.value == index) {
//                    FragmentContent(index)
//                }
//            }
//        }
    }
}

@Composable
fun FragmentContent(index: Int) {
    // Content of the fragment
    ChatList()
}

//@Preview
//@Composable
//fun ViewPagerExamplePreview() {
//    val fragments = listOf(
//        FragmentData(title = "Fragment 1")
//    )
//    ViewPagerExample(fragments = fragments)
//    ChatList()
//}


@Preview
@Composable
fun ChatList() {
    Column(modifier = Modifier.fillMaxSize()) {
        chatItems.forEach { chatItem ->
            ChatItemRow(chatItem)
            Divider(color = Color.LightGray, thickness = 0.5.dp)
        }
    }
}


@Composable
fun ChatItemRow(chatItem: ChatItem) {
    Card(
//        elevation = 4.dp,
        modifier = Modifier
            .fillMaxWidth()
            .clickable { /* Handle click on chat item */ }
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Image(
                painter = painterResource(id = chatItem.avatar),
                contentDescription = "Avatar",
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = chatItem.name,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )
                Text(text = chatItem.message, style = MaterialTheme.typography.bodySmall)
            }
            Text(text = chatItem.time, style = MaterialTheme.typography.bodySmall)
        }
    }
}