import java.util.*

fun main(args: Array<String>) {
    println("Hello World!");
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


    var nome = "test";
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
        continue;

    }

    //For de 2 em 2
    for(i in 0..10 step 2){
        println(i.toString());
        break
    }

    //For decrescente
    for(i in 20 downTo  0 ){
        println(i.toString());
    }

    //Val = constante
    val str: String? = null;
    var str2: String? = "1234";

  //Operador Elvis -> parecido, não igual ao If (em linha do vb.net) ou o ternário do c# (teste=="1234" ? "2" : "4";) só que valida apenas se o dado é nulo

    println(str ?: "nulo");
    println(str2 ?: "nulo");


    //Expressão que se aproxima do ternário em Kotlin é parecido com o código em VB.net

    val idade: Int = 18;
    val str3 = if(idade >= 18) "Maior" else "Menor";

    println(str3);


    //let

    val str5: String? = null;

    if(str5 != null){
        str5.lowercase();
        str5.length;
    }
    // o let irá fazer a mesma coisa acima, só que não precisamos fazer a validação do nulo

    str5?.let{
        it.lowercase();
        it.length;
    }




}

fun teste(teste: String): String
{
    return teste;
}