package com.techmaina.intenet

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentExample: Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragments","oa")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragments","oc")
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragments","ocv")
        return inflater.inflate(R.layout.fragment_new,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Fragments","ovc")
    }

    override fun onStart() {
        Log.i("Fragments","os")
        super.onStart()
    }

    override fun onResume() {
        Log.i("Fragments","or")
        super.onResume()
    }

    override fun onPause() {
        Log.i("Fragments","op")
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragments","ost")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragments","od")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragments","ode")
    }
}