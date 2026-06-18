# Tarea 1 | Entrega Parcial 2

## Proyecto

El objetivo de esta segunda entrega, es sentar las bases detrás del sistema de combate
el cual se basa en dar dinámicamente el turno a los personajes en juego en base a su
peso y el de su arma. No deberá crear el flujo del sistema como tal, sino solo 
los elementos y mecánicas que existen detrás para en un futuro solo tener que
conectarlo todo. Para ello deberá crear un **Programador de Turnos** (o Turn Scheduler)

Al igual que la entrega pasada, contará con una lista de requisitos a cumplir. Cada uno de
estos requisitos deberá estar reflejado en su proyecto al momento de realizar la entrega
final, tanto de manera funcional como testeada. El requisito en cuestión solo indica *qué*
es lo que debe hacer, sin embargo, el *cómo* hacerlo de la mejor manera recaerá en usted.

### 2.6. Sistema de combate

- Debe existir un programador de turnos

- Se debe poder añadir y quitar personajes al programador de tareas

- El programador debe poder calcular el máximo de la barra de acción de todos los personajes

- El programador debe poder llevar registro de la barra de acción que llevan los personajes en batalla

- El programador debe poder reiniciar la barra de acción de cada personaje

- El programador debe poder aumentar simultáneamente la barra de acción de todos los personajes en batalla en una cantidad arbitraria

- El programador debe ser capaz de señalar si un personaje que completó su barra de acción

- El programador debe ser capaz de entregar todos los personajes que completaron su barra de acción en orden

    - El orden debe ser de mayor a menor, basado en el excedente que los personajes tuvieron al completar su barra de acción

- El programador debe señalar al único personaje al que le corresponde el turno

Como indicación general, recuerde usar las estructuras de datos que Scala de manera nativa da a su disposición

**Recuerde que debe testear todas las funcionalidades que implemente.**

## Git

Considerando las indicaciones de la entrega anterior, debe crear una rama llamada ``entrega-parcial-2``:

1. Asegúrese de estar en la rama más reciente de su trabajo. Si realizó la entrega parcial 1 de manera correcta,
la rama en la que debería estar es ``entrega-parcial-1``. Puede usar el comando ``git checkout entrega-parcial-1`` para
cambiarse.

2. Utilice el comando ``git branch <branch_name>`` para crear la rama. En este caso, sería
``git branch entrega-parcial-2``.

3. Recuerde que para que su progreso pueda ser almacenado en dicha rama, debe cambiarse de rama 
utilizar el comando ``git checkout <branch_name>``. En este caso, sería ``git checkout entrega-parcial-2``. 

*Tenga en cuenta que el cuerpo docente tiene acceso total a su repositorio.*

## Entrega

Para subir su Entrega Parcial, deberá crear un *pull request* desde la rama
``entrega-parcial-2`` a la rama ``main`` llamado ``Tarea 1 - Entrega Parcial 2``.

Es importante que **no hagan merge** de la rama ``entrega-parcial-2`` a la rama ``main`` 
para que el cuerpo docente pueda revisar su *pull request*.

Por *U-Cursos* debe entregar un único archivo llamado ``entrega-parcial-2.txt`` con el
siguiente contenido:

```
Nombre: <Nombre completo>
Pull Request: <Link del pull request>
```

No cumplir con el formato pedido de una Entrega Parcial podría llevar a no ser
considerada, y para una Entrega Final, tiene descuentos en su nota final.

La realización de esta Entrega Parcial es **obligatoria** y su no entrega corresponde a un
descuento de 0.5 puntos de la nota final de la Tarea 1. Sin embargo, no es necesario que
esta cumpla inmediatamente con un diseño apropiado ni la funcionalidad solicitada al
completo, pero sí un avance evaluable.


