package be.tftic.web2023.demo05_list.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import be.tftic.web2023.demo05_list.R
import be.tftic.web2023.demo05_list.models.Teacher

class TeacherAdapter(val Context : Context, val Teachers : List<Teacher> ) : RecyclerView.Adapter<TeacherAdapter.TeacherViewHolder>()  {

    class TeacherViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Encapsule la view d'un item de la liste
        // - Permet de récuperer les différents éléments de la vue

        val TvFirstName : TextView
        val TvLastName : TextView

        init {
            // Récuperation des éléments via la méthode "findViewById" depuis la vue reçu
            TvFirstName = itemView.findViewById(R.id.item_teacher_firstname)
            TvLastName = itemView.findViewById(R.id.item_teacher_lastname)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        // Méthode appelé pour créer une vue encapsulé dans un ViewHolder
        val v : View = LayoutInflater.from(Context).inflate(R.layout.item_teacher, parent, false)
        return TeacherViewHolder(v)
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        // Méthode appelé pour populer le contenu de la vue en fonction de la position dans la liste

        // - Récuperation de l'element dans la collection
        val target : Teacher = Teachers[position]

        // - Modification de la vue
        holder.TvFirstName.setText(target.FirstName)
        holder.TvLastName.setText(target.LastName)
    }

    override fun getItemCount(): Int {
        // Méthode appelé pour obtenir le nombre d'element dans la liste (necessaire pour le visuel)
        return Teachers.size
    }
}