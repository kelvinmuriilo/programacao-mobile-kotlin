package com.example.atividade2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var cars = mutableListOf<Car>(
        Car(R.drawable.chevrolet, "Classic", 2015, "Flex"),
        Car(R.drawable.fiat, "Uno", 1995, "Gasolina"),
        Car(R.drawable.renault, "Sandero", 2020, "Flex"),
        Car(R.drawable.jeep, "Renegade", 2021, "Flex")
    )
    private var adapter = CarAdapter (cars, this::onMessageItemClick)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        rvCars.adapter = adapter
        val layoutManager = GridLayoutManager(this, 2)
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(pos: Int): Int {
                return if (pos == 0) 2 else 1
            }
        }
        rvCars.layoutManager = layoutManager
    }

    private fun onMessageItemClick(car: Car){
        val s = "${car.modelo}\n${car.ano}"
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }
}