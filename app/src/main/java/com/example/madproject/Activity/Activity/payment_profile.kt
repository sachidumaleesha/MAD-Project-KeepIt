package com.example.madproject.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import com.example.madproject.R

class payment_profile : AppCompatActivity() {

    lateinit var  navpay : Constraint

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_profile)
    }
}