package id.mondo.myappbar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.mondo.myappbar.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            searchView.setupWithSearchBar(searchBar)
            searchView.editText.setOnEditorActionListener { textView, actionId, event ->
                searchBar.setText(searchView.text)
                searchView.hide()
                Toast.makeText(this@MenuActivity, searchView.text, Toast.LENGTH_SHORT).show()
                false
            }
        }



    }
}