package com.muhammaduzaer.favfoodcollection.fragments.addnewitem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.muhammaduzaer.favfoodcollection.R
import com.muhammaduzaer.favfoodcollection.databinding.FragmentAddNewItemBinding
import com.muhammaduzaer.favfoodcollection.fragments.base.NonBottomBaseFragment

class AddNewItemFragment : NonBottomBaseFragment() {

    private lateinit var bindingAddNewItem: FragmentAddNewItemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_new_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingAddNewItem = FragmentAddNewItemBinding.bind(view)

        bindingAddNewItem.floatingActionBtnBack.setOnClickListener {
            navController.navigate(R.id.action_addNewItemFragment_to_homeFragment)
        }

        bindingAddNewItem.floatingActionBtnClear.setOnClickListener {
            Toast.makeText(requireContext(), "Cleared all", Toast.LENGTH_SHORT).show()
        }

        bindingAddNewItem.floatingActionBtnSave.setOnClickListener {
            Toast.makeText(requireContext(), "Saved", Toast.LENGTH_SHORT).show()
        }
    }

}