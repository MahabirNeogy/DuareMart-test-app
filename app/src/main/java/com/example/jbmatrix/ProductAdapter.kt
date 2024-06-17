package com.example.jbmatrix

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jbmatrix.data.Product

class ProductAdapter(private val products:List<Product>):RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView2)
        val textViewName: TextView = itemView.findViewById(R.id.textView)
        val textViewCode: TextView = itemView.findViewById(R.id.textView2)
        val textViewPrice: TextView = itemView.findViewById(R.id.textView3)
        val textViewRating: TextView = itemView.findViewById(R.id.tvrating)
        val textViewDiscount: TextView = itemView.findViewById(R.id.textView6)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_single_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.textViewName.text = product.product_name
        holder.textViewCode.text = product.product_id
        holder.textViewPrice.text = "\$${product.price}"
        holder.textViewDiscount.text = "\$${product.strike_price}"

        Glide.with(holder.imageView.context)
            .load(product.image1)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return products.size
    }
}
