package com.example.myapplication.adapter
import com.example.myapplication.model.Workouts
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Workouts>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Provides a way for the data to be formatted
    // so that each item is able to be displayed in the recycler view.
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

   // Creates new view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    // Replaces the contents of the view with items
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    // Returns the size of the data set of Workouts
    override fun getItemCount() = dataset.size
}