package com.ssk.stargram.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ssk.stargram.R
import com.ssk.stargram.databinding.FragmentSelectBinding

class SelectFragment : Fragment() {

    lateinit var binding : FragmentSelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_select, container, false)
        binding.lifecycleOwner = viewLifecycleOwner


        return binding.root
    }

}