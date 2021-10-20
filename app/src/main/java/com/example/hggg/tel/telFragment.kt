package com.example.hggg.Appliances

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.hggg.R
import com.example.hggg.adapter.StoreAdapter
import com.example.hggg.adapter.TelAdapter
import com.example.hggg.dataClasss.SimpleDataModel
import com.example.hggg.databinding.FragmentAppliancesBinding
import com.example.hggg.databinding.FragmentHomeBinding
import com.example.hggg.databinding.FragmentTelBinding
import com.example.hggg.model.AddOnClick
import com.example.hggg.tel.TelViewModel
import com.example.hggg.ui.home.HomeViewModel

class TelFragment : Fragment(), AddOnClick {

    private var _binding: FragmentTelBinding? = null
    private val binding get() = _binding!!

    private val vm: TelViewModel by viewModels()

    //private lateinit var viewModel: TelViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTelBinding.inflate(inflater,container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vm.getModels()
        vm.bodyTypes.observe(viewLifecycleOwner, {
            val adapter = TelAdapter(this)
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