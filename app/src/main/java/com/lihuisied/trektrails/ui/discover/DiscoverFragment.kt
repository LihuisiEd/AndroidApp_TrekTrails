package com.lihuisied.trektrails.ui.discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lihuisied.trektrails.databinding.FragmentDiscoverBinding

class DiscoverFragment : Fragment() {
    private var _binding: FragmentDiscoverBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiscoverBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}