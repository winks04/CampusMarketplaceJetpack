package com.example.campusmarketplacejetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.campusmarketplacejetpack.interfaces.LoginForm
import com.example.campusmarketplacejetpack.ui.theme.CampusMarketplaceJetpackTheme

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            CampusMarketplaceJetpackTheme {
                LoginForm()
            }
        }
    }
}