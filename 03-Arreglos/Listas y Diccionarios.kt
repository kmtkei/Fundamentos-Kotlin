// Arrays

var Arreglo = arrayListO<string>()

Arreglo.add("Chevrolet")
Arreglo.add("Citroen")
Arreglo.add("Subaru")

println(Arreglo)

// Añadir un conjunto de datos 

Arreglo.addAll(listOf("Peugeot", "Renault"))

println(Arreglo)

// mostrar dato especifico

println(Arreglo[1])

Arreglo[2] = "Ford"

println(Arreglo[2])

// Eliminar dato 

Arreglo.removeAt(2)
println(Arreglo)

Arreglo.forEach{
	println(it)
}

/* 
Metodos
podemos utilizar distintos metodos para interactuar con los arreglos entre ellos tenemos 
.count
.clear
.first
.last
.sort
*/ 
