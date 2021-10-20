package com.example.hggg.realestate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.hggg.R
import com.example.hggg.adapter.RealestateAdapter
import com.example.hggg.dataClasss.SimpleDataModel
import com.example.hggg.databinding.FragmentAppliancesBinding
import com.example.hggg.databinding.FragmentRealestateBinding
import com.example.hggg.model.AddOnClick

class RealestateFragment: Fragment(), AddOnClick {

    private var _binding: FragmentRealestateBinding? = null
    private val binding get() = _binding!!

    private val vm: RealestateViewModel by viewModels()

    //private lateinit var viewModel: AppliancesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRealestateBinding.inflate(inflater,container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vm.getModels()
        vm.bodyTypes.observe(viewLifecycleOwner, {
            val adapter = RealestateAdapter(this)
            binding.resycler.adapter = adapter
            adapter.addData(it.ads)
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(data: SimpleDataModel) {
        findNavController().navigate(R.id.imageFragment, bundleOf("DATA" to data))
    }
}
