https://stackoverflow.com/questions/71526941/why-is-the-return-statement-underlined-in-onclick-confirm-method-vscode
Sobre el error de la linea 69 de alumnos.html

La pagina funciona correctamente...
Al parecer la validacion no estaria funcionando correctamente, es muy estricta
o debería revisar la información oficial sobre esta validacion.

Requerimientos
1. Usar Spring Initializr para generar proyecto con las respectivas dependencias. (0,5
Puntos)

2. Crear un modelo Alumno en la carpeta model, la cual debe contener anotaciones de
JPA, tener una relación de 1:1 con Dirección, y contar con los siguientes atributos:
(0,5 Puntos)
● ID
● RUT
● Nombre
● Apellido
● Email
● Edad
● FechaIngreso
● dirección de tipo Direccion

3. Crear un modelo Direccion con sus respectivas anotaciones de JPA y con los
siguientes atributos. (0,5 Puntos)
● ID
● Calle
● Número
● Ciudad
● Tipo, enumeración de tipo TipoDireccion

4. Crear una enumeración TipoDireccion, con los siguientes valores. (0,5 Puntos)
● CASA
● TRABAJO
● OTRO

5. Crear una interfaz llamada AlumnoRepository en la carpeta repository. (0,5 Puntos)

6. Crear una interfaz llamada DireccionRepository en la carpeta repository. (0,5 Puntos)

7. Crear una interfaz llamada AlumnoService en la carpeta service. (0,5 Puntos)
● Método save para guardar alumno.
● Método findAll para listar alumnos.

8. Crear una interfaz llamada DireccionService en la carpeta service. (0,5 Puntos)
● Método save para guardar dirección.
● Método findAll para listar direcciones.

9. Crear una clase llamada AlumnoServiceImpl en la carpeta service. (1 Punto)
● Método save para guardar alumno.
● Método findAll para listar alumnos.

10. Crear una clase llamada DireccionServiceImpl en la carpeta service. (1 Punto)
● Método save para guardar dirección .
● Método findAll para listar direcciones.

11. Crear una clase AlumnoController. (1 Punto)
● Método crear para mostrar formulario de alumno. (GET)
● Método crear para guardar alumno. (POST)
● Método alumnos para mostrar vista de alumnos.

12. Crear una clase DireccionController. (1 Punto)
● Método crear para mostrar formulario de dirección. (GET)
● Método crear para guardar dirección. (POST)
● Método direcciones para mostrar vista de direcciones.

13. Crear una vista crear-direccion.html en carpeta resources/templates para agregar
direcciones. (0,5 Puntos)

14. Crear una vista direcciones.html en carpeta resources/templates para listar
direcciones registradas. (0,5 Puntos)

15. Crear una vista crear-alumno.html en carpeta resources/templates para agregar
alumno. (0,5 Puntos)

16. Crear una vista alumnos.html en carpeta resources/templates para listar alumnos
registrados. (0,5 Puntos)