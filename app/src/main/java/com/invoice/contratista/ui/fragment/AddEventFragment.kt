package com.invoice.contratista.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.invoice.contratista.R

class AddEventFragment : Fragment() {

    companion object {
        fun newInstance() = AddEventFragment()
    }

    private lateinit var viewModel: AddEventViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_event_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddEventViewModel::class.java)
        // TODO: Use the ViewModel
    }

}