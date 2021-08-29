package one.digitslinnovation.colletions

fun main(){ //criação da lista
    val joao = funcionario ("João", 9000.0, "CLT") // item da lista
    val maria = funcionario ("Maria", 1049.0, "CLT") // item da lista
    val pedro = funcionario ("Pedro", 4000.0, "PJ") // item da lista

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach{(println(it))} // iteração da lista
    println("-------------")
    println(funcionarios.find { it.nome == "Maria" }) // busca de item da lista com os dados iguais da lista
    println("-------------")
    funcionarios
        .groupBy { it.tipoContratacao } // agrupa por tipo, onde a atribuição deve estar na data class "tipoContratação
        //.sortedBy { it.salario } // ordena lista nesse caso pelo salario
        .forEach{(println(it))}


}

data class Funcionario ( // criação da data class
    val nome :String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()


}