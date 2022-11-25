package com.example.dbsfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class RedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.red_layout, container, false)
        var redBut = view.findViewById<Button>(R.id.buttonRedFrag)
        redBut.setOnClickListener {
                var blueFrag = BlueFragment()
                var bundle = Bundle()
            bundle.putString("key", "Ansari")
            blueFrag.arguments = bundle

            fragmentManager?.beginTransaction()?.replace(R.id.mydynamiclayout, blueFrag)?.addToBackStack(null)?.commit()
        }

        return view
    }
}