package es.davidcorcuera.navigationsamplelesson6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import es.davidcorcuera.navigationsamplelesson6.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    val args: ThirdFragmentArgs by navArgs()
    lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = DataBindingUtil.inflate<FragmentThirdBinding>(inflater,
            R.layout.fragment_third,
            container,
            false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = args.yourName
        binding.textView3.text = "Hola ${name}!!"
    }

}