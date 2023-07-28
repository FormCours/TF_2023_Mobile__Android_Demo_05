package be.tftic.web2023.demo05_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import be.tftic.web2023.demo05_list.adapters.TeacherAdapter
import be.tftic.web2023.demo05_list.databinding.ActivityTeacherBinding
import be.tftic.web2023.demo05_list.models.Teacher

class TeacherActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTeacherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTeacherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val teachers = listOf<Teacher>(
            Teacher("Balthazar", "Picsou"),
            Teacher("Miss", "Tick"),
            Teacher("Archibald", "Gripsou")
        )

        val adapter : TeacherAdapter = TeacherAdapter(this, teachers)

        binding.rvTeacher.adapter = adapter
    }
}