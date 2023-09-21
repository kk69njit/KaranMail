package com.example.karanmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var emails: List<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This forces app into light mode.
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val emailsRV = findViewById<RecyclerView>(R.id.emails)
        emails = EmailFetcher.getEmails()
        val adapter = EmailAdapter(emails)
        emailsRV.adapter = adapter
        emailsRV.layoutManager = LinearLayoutManager(this)

        findViewById<Button>(R.id.loadMoreBtn).setOnClickListener {
            Toast.makeText(this, "More E-Mails Loaded!",Toast.LENGTH_SHORT).show()
            val nextFive = EmailFetcher.getNext5Emails()
            (emails as MutableList<Email>).addAll(nextFive)
            adapter.notifyDataSetChanged()
        }
    }
}