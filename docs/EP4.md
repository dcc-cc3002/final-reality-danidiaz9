# Tarea 2 | Entrega Parcial 4

## Proyecto

El objetivo de la cuarta entrega será implementar restricciones mencionadas en
el enunciado del proyecto.

Para guiarles en este proceso, contará con una lista de requisitos a cumplir. Cada uno de
estos requisitos deberá estar reflejado en su proyecto al momento de realizar la entrega
final, tanto de manera funcional como testeada. El requisito en cuestión solo indica *qué*
es lo que debe hacer, sin embargo, el *cómo* hacerlo de la mejor manera recaerá en usted.

### Funcionalidades

- Un personaje debe ser capaz de desequiparse un arma.

### Excepciones

- Una party no puede contener más de 3 personajes.

- Un arma que tenga dueño no puede ser equipada por ningún otro personaje.

- Un una unidad del juego no puede a atacar a un aliado de su mismo tipo. (es decir,
  un enemigo no puede atacar a un enemigo, y un personaje no puede atacar a otro
  personaje)

**Recuerde que debe testear todas las funcionalidades que implemente.**

## Git

Considerando las indicaciones de la entrega anterior, debe crear una rama llamada ``entrega-parcial-4``:

1. Utilice el comando ``git branch <branch_name>`` para crear la rama. En este caso, sería
``git branch entrega-parcial-4``.

2. Asegúrese de estar en la rama más reciente de su trabajo. Si realizó la entrega parcial 3 de manera correcta,
la rama en la que debería estar es ``entrega-parcial-3``. Use el comando ``git checkout entrega-parcial-4`` para
cambiarse.

*Tenga en cuenta que el cuerpo docente tiene acceso total a su repositorio.*

## Entrega

Para subir su Entrega Parcial, deberá crear un *pull request* desde la rama
``entrega-parcial-4`` a la rama ``main`` llamado ``Tarea 2 - Entrega Parcial 4``.

Es importante que **no hagan merge** de la rama ``entrega-parcial-4`` a la rama ``main`` 
para que el cuerpo docente pueda revisar su *pull request*.

Por *U-Cursos* debe entregar un único archivo llamado ``entrega-parcial-4.txt`` con el
siguiente contenido:

```
Nombre: <Nombre completo>
Pull Request: <Link del pull request>
```

No cumplir con el formato pedido de una Entrega Parcial podría llevar a no ser
considerada, y para una Entrega Final, tiene descuentos en su nota final.

La realización de esta Entrega Parcial es **obligatoria** y su no entrega corresponde a un
descuento de 0.5 puntos de la nota final de la Tarea 2. Sin embargo, no es necesario que
esta cumpla inmediatamente con un diseño apropiado ni la funcionalidad solicitada al
completo, pero sí un avance evaluable.

