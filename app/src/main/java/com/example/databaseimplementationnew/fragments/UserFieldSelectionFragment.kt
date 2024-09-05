package com.example.databaseimplementationnew.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.databaseimplementationnew.databinding.FragmentUserFieldSelectionBinding

class UserFieldSelectionFragment : Fragment() {
    lateinit var binding: FragmentUserFieldSelectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentUserFieldSelectionBinding.inflate(layoutInflater)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return binding.root
    }

    companion object {
        const val TAG = "Ufield"

        fun newInstance() =
            UserFieldSelectionFragment()
    }
}