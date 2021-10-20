package com.example.hggg.image

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.hggg.dataClasss.SimpleDataModel
import com.example.hggg.databinding.ImageFragmentBinding
import com.example.hggg.plants.PlantsViewModel

class ImageFragment: Fragment() {

    private var _binding: ImageFragmentBinding? = null
    private val binding get() = _binding!!


    //private lateinit var viewModel: PlantsViewModel

    private var laptop: SimpleDataModel? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ImageFragmentBinding.inflate(inflater,container, false)
        val root: View = binding.root
        return root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        laptop = arguments?.getParcelable("DATA")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.text1.text = laptop?.address
        binding.text2.text = laptop?.price
        binding.text3.text = laptop?.city
        binding.text4.text = laptop?.metro
        val image = laptop?.images?.split(",")?.get(0)
        Glide.with(requireActivity()).load(image).into(binding.image1)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}