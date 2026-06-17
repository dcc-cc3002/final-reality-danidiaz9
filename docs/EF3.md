# Tarea 3 | Entrega Final
## Proyecto

Para esta entrega debe tener TODO listo :)

Ahora en serio, su entrega si debe contemplar todo lo pedido en la sección 2,
pero si ha seguido las entregas parciales hasta el momento, solo debería tener
problemas con integrar todas las partes en las que ha trabajado.

En particular se espera que tenga el modelo y el controlador de la aplicación.
No se le exigirá que proporcioné una vista, lo que incluye manejo de entrada
de usuario y visualización de la aplicación. Aunque el cuerpo docente
quedará _gratamente_ sorprendido si lo implementa ;)
 

**Recuerde que debe testear todas las funcionalidades que implemente.**

**IMPORTANTE:** El primer paso a realizar en esta entrega es corregir las implementaciones realizadas en las entregas anteriores para garantizar un buen diseño. Recuerde que en la entrega final debe estar implementado todo lo solicitado en las entregas parciales anteriores, junto con los requisitos de esta entrega.

### Controlador
Su controlador debe poder:

- Iniciar el juego

- Finalizar el juego

- Mostrar cuando se acaba el juego

- Mostrar cual fue el resultado del juego (se ganó o se perdió)

- Manejar una batalla:
    - Manejar el orden de los turnos de las unidades
    - Manejar un turno arbitrario de una unidad 

- Aplicar efectos en la batalla

Recuerde que el controlador es un conjunto de clases y no necesariamente un único gran objeto que lo hace todo.
    

### Modelo
No se requiere nada adicional en el modelo, este fue completado con las entregas parciales.

### Vista
No es necesario implementar la vista, es decir, manejo de input y output.

## Git

El trabajo realizado para esta entrega se debe realizar en una nueva rama que deberá llamar ``entrega-final-3``:

1. Asegúrese de estar en la rama más reciente de su trabajo. Puede usar el comando ``git checkout <last_branch>`` para cambiarse de rama, donde `<last_branch>` es la rama de su última entrega.

2. Utilice el comando ``git branch <branch_name>`` para crear la rama. En este caso, sería
``git branch entrega-final-3``.

3. Recuede que para que su progreso pueda ser almacenado en dicha rama, debe cambiarse de rama utilizando el comando ``git checkout <branch_name>``. En este caso, sería ``git checkout entrega-final-3``.

*Tenga en cuenta que el cuerpo docente tiene acceso total a su repositorio.*

## Entrega

Para subir su Entrega Parcial, deberá crear un *pull request* desde la rama
``entrega-final-3`` a la rama ``main`` llamado ``Tarea 3 - Entrega Final``.

Es importante que **no hagan merge** de la rama ``entrega-final-3`` a la rama ``main`` 
para que el cuerpo docente pueda revisar su *pull request*.

Por *U-Cursos* debe entregar un único archivo llamado ``entrega-final-3.txt`` con el
siguiente contenido:

```
Nombre: <Nombre completo>
Pull Request: <Link del pull request>
```

**RECUERDE INCLUIR EL DIAGRAMA DE ESTADOS EN SU README**
