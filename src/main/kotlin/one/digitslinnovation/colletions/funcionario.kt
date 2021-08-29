package one.digitslinnovation.colletions

data class funcionario( // criação da data class
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){

    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}

