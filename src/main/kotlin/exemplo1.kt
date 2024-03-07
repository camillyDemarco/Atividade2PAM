Package funcoes

Fun main (args: Array<string>){
    For( n in ordenar (36, 3, 456, 8, 51, 1, 88, 73)){
        Print(“$n”)
    }}
Fun ordenar (vararg numeros: Int) : IntArray {
    Return numeros.sortedArray ()
}