package com.example.databaseimplementationnew

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.databaseimplementationnew.databinding.ActivityIntroBinding
import com.example.databaseimplementationnew.fragments.FormFillingFragment
import com.example.databaseimplementationnew.fragments.UserFieldSelectionFragment

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setClickListeners()

    }

    private fun setClickListeners() {
        binding.apply {
            fillForm.setOnClickListener {
                navigateToFormFilling()

            }
            checkForms.setOnClickListener {
                navigateToSelectionList()
            }
        }
    }

    private fun navigateToSelectionList() {
        val fragmentManager = supportFragmentManager
        if (fragmentManager.isDestroyed) {
            return
        }
        val selection = UserFieldSelectionFragment.newInstance()
        fragmentManager
            .beginTransaction()
            .replace(
                R.id.main,
                selection,
                UserFieldSelectionFragment.TAG
            )
            .commitAllowingStateLoss()
    }

    private fun navigateToFormFilling() {
        val fragmentManager = supportFragmentManager
        if (fragmentManager.isDestroyed) {
            return
        }
        val formFillingFragment = FormFillingFragment.newInstance()
        fragmentManager
            .beginTransaction()
            .replace(
                R.id.main,
                formFillingFragment,
                FormFillingFragment.TAG
            )
            .commitAllowingStateLoss()
    }
}