package com.example.mod5demo1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.mod5demo1.databinding.FragmentLoginBinding


private const val TAG = "LoginFragment"
class LoginFragment : Fragment() {



    lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.button.setOnClickListener {
            val mail = binding.etLogin.text.toString()
            val password = binding.etPassword.text.toString()
            val user = User(mail, password)
            Log.i(TAG, "onViewCreated: " + user)

            val direction = LoginFragmentDirections.actionLoginToHome(user)
            Navigation.findNavController(view).navigate(direction)
        }
    }




}