
# SOLID

Identificar los principios solid violados y documentarlos

Integrantes: 
+ Cristian Steven Soto Zapata,
+ Sebastian Piñeros Castellanos
+ Sergio Eduardo Socha Mendoza


## Analisis por clase:

### Interface "EmployeeOperations.java"

En esta clase no se cumple el principio de responsabilidad unica, es decir tenemos una interfaz donde podemos observar que tenemos multiples operaciones de cosas diferentes, es decir tenemos operaciones para empleado, salario y tambien persistencia para guardar un archivo.

Tambien incumple el principio de segregacion de interfaces, por lo mismo que en el anterior se esta dependiendo de una sola interfaz para realizar multiples procesos, cuando es preferible tener muchas interfaces con responsbilidades definidas

Inversion de dependencias, ya que al estar mezclados los modulos en una misma interfaz 

### Clase "Employee.java"


### Clase "ReportGenerator.java"



### Clase "EmployeeManager.java"


### Clase "PartTimeEmployee.java"


### Clase "SalaryCalculator.java"
