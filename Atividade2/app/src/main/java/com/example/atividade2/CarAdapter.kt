package com.example.atividade2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_car.view.*


class CarAdapter(private val cars: List<Car>,
                private val callback: (Car) -> Unit) :
    RecyclerView.Adapter<CarAdapter.VH>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_car, parent, false)
        val vh = VH(v)
        vh.itemView.setOnClickListener {
            val car = cars[vh.adapterPosition]
            callback(car)
        }
        return vh
    }

    override fun onBindViewHolder(holder: VH, pos: Int) {
        val (logo, modelo, ano, combustivel) = cars[pos]
        holder.logo.setImageResource(logo)
        holder.txtModelo.text = modelo
        holder.txtAno.text = ano.toString()
        holder.txtCombustivel.text = combustivel.toString()
    }

    override fun getItemCount(): Int = cars.size

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var logo: ImageView = itemView.imageView
        var txtModelo: TextView = itemView.txtModelo
        var txtAno: TextView = itemView.txtAno
        var txtCombustivel = itemView.txtCombustivel
    }
}