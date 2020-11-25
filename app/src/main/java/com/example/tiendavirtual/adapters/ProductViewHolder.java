package com.example.tiendavirtual.adapters;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tiendavirtual.R;
import com.example.tiendavirtual.entities.Product;
import com.google.android.material.card.MaterialCardView;

import static com.example.tiendavirtual.R.id.product_card;

public class ProductViewHolder extends RecyclerView.ViewHolder{
    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void onBindViewHolder(Product product){
     TextView text = itemView.findViewById(R.id.product_name_item);
     text.setText(product.getProducto());
     MaterialCardView card = itemView.findViewById(product_card);

    }
}
