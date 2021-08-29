package one.digitslinnovation.colletions

fun main(){
    val joao = funcionario("Joao", 2000.0, "CLT")
    val pedro = funcionario("Pedro", 1500.0, "CLT")
    val maria = funcionario("Maria", 4000.0, "CLT")

    val funcionario1 = setOf(joao, pedro) // conjunto funcionaro1
    val funcionario2 = setOf(maria) // conjunto funcionario2

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach{(println(it))} // adicionou as duas variaveis funcionario1 e 2

    println("--------") // subtraindo elemento da conjunto 2 em comparação com o conjunto 3
    val funcionario3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach{(print(it))}

    println("---------")
    val resultIntersect = funcionario3.intersect(funcionario2) // o que é igual (intersect) entre os dois conjuntos
    resultIntersect.forEach{(println(it))}

}