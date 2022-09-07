/*

Operadres condicionales 
> mayor que 
< menor que 
>= mayor o igual que
<= menor o igual que 
== igual que
!= distinto que 

OPERADORES LOGICOS

&& Y
|| O 
! NOT (negacion)
*/

if(numero < 10 ){
print ("$numero es menor que 10")
}else{
print ("el numero $numero es mayor o igual que 10")
}

//sentencia when 
val nombre = "Matias"
when (nombre) {
	"Juan" -> { println("Usuario No Para esta Area")}
	"Jose" -> { println("Usuario No Autorizado")}
	"Matias" -> { println("Autorizado")}
	else -> {println ("Usuario No Registrado")}
	
}
