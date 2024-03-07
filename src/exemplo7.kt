package funcoes
fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}
fun calcularAreaTriangulo(base: Double, altura: Double): Double {
    return 0.5 * base * altura
}
fun calcularAreaTrianguloEquilatero(lado: Double): Double {
    return (sqrt(3.0) / 4) * lado * lado
}
fun calcularAreaTrianguloIsoceles(base: Double, altura: Double): Double {
    return 0.5 * base * altura
}
fun calcularAreaTrianguloEscaleno(lado1: Double, lado2: Double, lado3: Double): Double {
    val s = (lado1 + lado2 + lado3) / 2
    return sqrt(s * (s - lado1) * (s - lado2) * (s - lado3))
}
fun calcularAreaCircunferencia(raio: Double): Double {
    return PI * raio * raio
}
fun calcularAreaLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2
}
fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) * altura) / 2
}
fun main() {
    println("Área do Retângulo: ${calcularAreaRetangulo(5.0, 10.0)}")
    println("Área do Triângulo: ${calcularAreaTriangulo(6.0, 8.0)}")
    println("Área do Triângulo Equilátero: ${calcularAreaTrianguloEquilatero(5.0)}")
    println("Área do Triângulo Isósceles: ${calcularAreaTrianguloIsoceles(6.0, 8.0)}")
    println("Área do Triângulo Escaleno: ${calcularAreaTrianguloEscaleno(3.0, 4.0, 5.0)}")
    println("Área da Circunferência: ${calcularAreaCircunferencia(3.0)}")
    println("Área do Losango: ${calcularAreaLosango(6.0, 8.0)}")
    println("Área do Trapézio: ${calcularAreaTrapezio(6.0, 8.0, 5.0)}")
}
tem menu de contexto