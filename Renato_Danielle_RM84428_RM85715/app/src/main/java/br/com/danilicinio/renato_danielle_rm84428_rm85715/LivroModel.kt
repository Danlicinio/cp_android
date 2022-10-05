package br.com.danilicinio.renato_danielle_rm84428_rm85715

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LivroModel (
    val titulo: String,
    val genero: String,
    val anoLancamento: Int,
    val autor: String,
) : Parcelable