package es.davidcorcuera.navigationsamplelesson6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import es.davidcorcuera.navigationsamplelesson6.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        val binding = DataBindingUtil.inflate<FragmentFirstBinding>(inflater,
            R.layout.fragment_first,
            container,
            false)
        return binding.root
    }

}