package com.application.propertyapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder> {

    Context context;
    List<Property> properties;

    public PropertyAdapter(Context context, List<Property> properties) {
        this.context = context;
        this.properties = properties;
    }

    @NonNull
    @Override
    public PropertyAdapter.PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout
        View view = LayoutInflater.from(context).inflate(R.layout.property_recyclerview_layout, parent, false);
        return new PropertyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyAdapter.PropertyViewHolder holder, int position) {
        // Set the data
        int imageResource = context.getResources()
                .getIdentifier(properties.get(position).getImage(),
                        "drawable", context.getPackageName());
        holder.propertyIV.setImageResource(imageResource);
        holder.propertyTitleTV.setText(properties.get(position).getName());
        holder.propertyAddressTV.setText(properties.get(position).getAddress());
        holder.propertyDetailsTV.setText(properties.get(position).getPropertyDetails());
    }

    @Override
    public int getItemCount() {
        // Return the size of the list
        return properties.size();
    }

    public static class PropertyViewHolder extends RecyclerView.ViewHolder {

        ImageView propertyIV;
        TextView propertyTitleTV;
        TextView propertyAddressTV;
        TextView propertyDetailsTV;

        public PropertyViewHolder(@NonNull View itemView) {
            // Initialize the views
            super(itemView);

            propertyIV = itemView.findViewById(R.id.propertyIV);
            propertyTitleTV = itemView.findViewById(R.id.propertyName);
            propertyAddressTV = itemView.findViewById(R.id.propertyAddress);
            propertyDetailsTV = itemView.findViewById(R.id.propertyDetails);
        }
    }

}
