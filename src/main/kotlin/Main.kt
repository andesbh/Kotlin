import java.util.*

fun main(args: Array<String>) {
    println("Hello World!");
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


    var nome: String = "test";
    var sobrenome: String = "2";

    println("$nome $sobrenome");

    println(teste("lalala").uppercase());

    //Switch case == When

    var testeWhen: String = "";

    testeWhen = when(nome){
        "teste" -> "ok"
        "teste2" -> "2"
        "teste3" -> "3"
        "teste4" -> "4"
        else -> ""
    };

    //For
    for(i in 1..10){
        println(i.toString());
    }

    //For de 2 em 2
    for(i in 0..10 step 2){
        println(i.toString());
    }

    //For decrescente
    for(i in 20 downTo  0 ){
        println(i.toString());
    }

}

fun teste(teste: String): String
{
    return teste;
}