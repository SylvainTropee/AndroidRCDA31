package com.example.mod5demo1

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar


private const val TAG = "HomeFragment"
class HomeFragment : Fragment() {

    val args : HomeFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val user = args.user
        Log.i(TAG, "onViewCreated: " + user)
        Snackbar.make(view, "Bienvenue ${user.mail} !", Snackbar.LENGTH_LONG).show()

    }

}