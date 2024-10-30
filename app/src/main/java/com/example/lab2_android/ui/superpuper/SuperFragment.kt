package com.example.lab2_android.ui.superpuper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lab2_android.databinding.FragmentSuperBinding

class SuperFragment : Fragment() {

    private var _binding: FragmentSuperBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val superViewModel =
            ViewModelProvider(this).get(SuperViewModel::class.java)

        _binding = FragmentSuperBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSuper
        superViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}