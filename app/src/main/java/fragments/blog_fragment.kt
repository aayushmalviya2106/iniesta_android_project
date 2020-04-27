package fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.taxation.R


class blog_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {  // Inflate the layout for this fragment

        var view=inflater.inflate(R.layout.fragment_blog_fragment, container, false)
    return view
    }

}
