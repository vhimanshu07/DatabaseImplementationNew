package com.example.databaseimplementationnew.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.databaseimplementationnew.databinding.FragmentListOfUsersBinding


class ListOfUsersFragment : Fragment() {

    lateinit var binding: FragmentListOfUsersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentListOfUsersBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            ListOfUsersFragment()
    }
}