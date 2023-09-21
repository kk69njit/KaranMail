package com.example.karanmail

import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emails: List<Email>): RecyclerView.Adapter<EmailAdapter.ViewHolder>() {
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // TODO: Create member variables for any view that will be set
        // as you render a row.

        val senderTV: TextView
        val titleTV: TextView
        val summaryTV: TextView
        val date: TextView
        val image: ImageView

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        init {
            // TODO: Store each of the layout's views into
            // the public final member variables created above
            senderTV = itemView.findViewById(R.id.sender)
            titleTV = itemView.findViewById(R.id.title)
            summaryTV = itemView.findViewById(R.id.summary)
            date = itemView.findViewById(R.id.date)
            image = itemView.findViewById(R.id.sender_img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.email_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    // Populate data into the item through the holder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val email = emails.get(position)
        // Set item views based on views and data model
        holder.senderTV.text = email.sender
        holder.titleTV.text = email.title
        holder.summaryTV.text = email.summary
        holder.date.text = email.date
        holder.image.setImageResource(email.image)
        if (email.unread == 1) {
            holder.summaryTV.setTypeface(null, Typeface.BOLD)
            holder.titleTV.setTypeface(null, Typeface.BOLD)
        }
    }

    override fun getItemCount(): Int {
        return emails.size
    }
}