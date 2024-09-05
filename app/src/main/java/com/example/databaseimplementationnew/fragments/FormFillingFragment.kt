package com.example.databaseimplementationnew.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.databaseimplementationnew.databinding.FragmentFormFillingBinding

class FormFillingFragment : Fragment() {

    lateinit var binding: FragmentFormFillingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentFormFillingBinding.inflate(layoutInflater)
        setUpListener()
    }

    private fun setUpListener() {
        binding.apply {
            submitBtn.setOnClickListener {
                checkAndSubmit()
            }
        }
    }

    private fun checkAndSubmit() {
        binding.apply {
            if (inputNameField.text.isNullOrBlank()) {
                inputNameField.error = "Please enter name to continue"
            } else if (inputAgeField.text.isNullOrBlank()) {
                inputAgeField.error = "Please enter age to continue"
            } else if (inputDobField.text.isNullOrBlank()) {
                inputDobField.error = "Please enter dob to continue"
            } else {
                submittedSuccessfully()
            }
        }
    }

    private fun submittedSuccessfully() {

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return binding.root
    }


    companion object {
        const val TAG = "FFling"

        @JvmStatic
        fun newInstance() =
            FormFillingFragment()
    }
}