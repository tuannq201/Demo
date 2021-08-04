package com.example.demo_chatapp.navigation_drawer.ui.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.demo_chatapp.R

class DemoFragment : Fragment() {

    companion object {
        fun newInstance() = DemoFragment()
    }

    private lateinit var viewModel: DemoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.demo_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DemoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}


