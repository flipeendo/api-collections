package one.digitalinnovation.collections
 fun main() {
    val joao = funcionario("Joao", 2000.0, "CLT" )
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val  maria = funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach { println(it) }

    println("-----------")
    println(funcionarios.find { it.nome == "Maria" })

    println("--------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

     println("--------------")
     funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }


}

data class funcionario (
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
        """.trimIndent()
}