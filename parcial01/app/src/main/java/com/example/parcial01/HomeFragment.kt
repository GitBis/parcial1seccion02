package com.example.parcial01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton



class HomeFragment : Fragment() {

    private lateinit var floatingActionButton: FloatingActionButton
    private lateinit var cardView: CardView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bttNew()
        floatingActionButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_newPhoneFragment)
        }
        bttInfo()
        cardView.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_infoCelularFragment)
        }
}


private fun bttNew(){
    floatingActionButton = view?.findViewById(R.id.floatingActionButton2) as FloatingActionButton
}

private fun bttInfo(){
    cardView = view?.findViewById(R.id.cardviewCelular) as CardView
}
}
