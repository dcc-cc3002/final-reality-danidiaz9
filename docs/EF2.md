# Tarea 2 | Entrega Final

## Proyecto

Para esta entrega se les pedirá que implementen parcialmente la sección 2.4
del enunciado. Con el fin de guiarlos se les entrega una lista de requisitos
a cumplir que debería estar presente en su entrega.

La idea es solo implementar la parte de los hechizos, los efectos quedarán
pendiente para una futura entrega.

**Recuerde que debe testear todas las funcionalidades que implemente.**

**IMPORTANTE:** El primer paso a realizar en esta entrega es corregir las implementaciones realizadas en las entregas anteriores para garantizar un buen diseño. Recuerde que en la entrega final debe estar implementado todo lo solicitado en las entregas parciales anteriores, junto con los requisitos de esta entrega.

### Hechizos

- Un hechizo debe poder lanzarse sobre un objetivo

- Al lanzar un hechizo con éxito se debe descontar el maná correspondiente

- Un hechizo o magia de luz solo puede ser lanzada por un mago blanco

- Un hechizo o magia oscura sólo puede ser lanzada por un mago negro

- El hechizo debe considerar las estadísticas del mago (y su arma) para sus efectos

### Excepciones
- Un hechizo no debe poder lanzarse si no se tiene maná suficiente

- Un hechizo positivo (curar) no puede lanzarse sobre un enemigo

- Un hechizo negativo (daño o efecto) no puede lanzarse sobre un aliado

- Un hechizo no puede realizarse sobre un objetivo muerto

- Un hechizo solo puede ser lanzado por magos con armas mágicas equipadas

### Efectos

- Para esta entrega *no* debe implementar los efectos

## Git

El trabajo realizado para esta entrega se debe realizar en una nueva rama que deberá llamar ``entrega-final-2``:

1. Asegúrese de estar en la rama más reciente de su trabajo. Puede usar el comando ``git checkout <last_branch>`` para cambiarse de rama, donde `<last_branch>` es la rama de su última entrega.

2. Utilice el comando ``git branch <branch_name>`` para crear la rama. En este caso, sería
``git branch entrega-final-2``.

3. Recuerde que para que su progreso pueda ser almacenado en dicha rama, debe cambiarse de rama utilizando el comando ``git checkout <branch_name>``. En este caso, sería ``git checkout entrega-final-2``.

*Tenga en cuenta que el cuerpo docente tiene acceso total a su repositorio.*

## Entrega

Para subir su Entrega Parcial, deberá crear un *pull request* desde la rama
``entrega-final-2`` a la rama ``main`` llamado ``Tarea 2 - Entrega Final``.

Es importante que **no hagan merge** de la rama ``entrega-final-2`` a la rama ``main`` 
para que el cuerpo docente pueda revisar su *pull request*.

Por *U-Cursos* debe entregar un único archivo llamado ``entrega-final-2.txt`` con el
siguiente contenido:

```
Nombre: <Nombre completo>
Pull Request: <Link del pull request>
```
