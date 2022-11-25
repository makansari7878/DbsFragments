package com.example.dbsfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class BlueFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.blue_layout, container, false)
        var resTextView = view.findViewById<TextView>(R.id.textViewBlueFrag)

      var data =   arguments?.getString("key")
        resTextView.setText(data)
        return view
    }
}