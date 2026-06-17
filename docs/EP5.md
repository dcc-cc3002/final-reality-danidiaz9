# Tarea 3 | Entrega Parcial 5

## Proyecto

El objetivo de esta entrega será empezar a implementar el controlador del videojuego, en particular, sus respectivas fases.

Para guiarles en este proceso, contará con una lista de requisitos a cumplir. Cada uno de estos requisitos deberá estar reflejado en su proyecto al momento de realizar la entrega final, tanto de manera funcional como testeada. El requisito en cuestión solo indica *qué* es lo que debe hacer, sin embargo, el *cómo* hacerlo de la mejor manera recaerá en usted.

### Diagrama de estados

Debe diseñar un diagrama de estados que modele el flujo de la partida. Para esto, lea el enunciado del proyecto e identifique los siguientes aspectos:

+ Las distintas etapas de la partida
+ Las transiciones entre las fases
+ Los eventos que disparan las transiciones

Para hacer este diagrama puede usar la herramienta que usted estime, por ejemplo,
le puede resultar útil la página [draw.io](https://app.diagrams.net).

El diagrama debe incluirse en el archivo ``README.md`` de su proyecto.
Para hacer esto, debe subir el archivo a su repositorio, por ejemplo en la carpeta ``docs``, con el nombre ``diagrama-estados.png``. Luego, debe incluir la imagen en el archivo ``README.md``:

```markdown
# Final Reality
...

## Diagrama de estados

![Diagrama de estados](docs/diagrama-estados.png)
```

### Controlador y flujo del juego

Debe comenzar a hacer el controlador del juego. Para eso, debe:

+ Implementar los patrones de diseño necesarios para modelar los estados de la partida.
+ Implementar los métodos necesarios en el controlador que activen los eventos del diagrama de estados.

Con esto, el controlador debiese ser capaz de hacer las siguientes acciones en las fases que correspondan:

+ Inicializar una partida.
+ Hacer que una unidad ataque a otra.
+ Hacer que un mago conjure un hechizo.
+ Hacer que un personaje equipe un arma.

**MUY IMPORTANTE**: A continuación viene un snippet con una **IDEA** de lo que se tiene que hacer. ¿Se tiene que hacer tal cual? **NO**, tienen toda libertad de decidir como hacerlo, y de ajustar el código como más les acomode. Es probable que su controlador requiera más métodos para funcionar.

```scala
class GameController {
    // Estado actual del juego
    var state: GameState = new SomeState(this)

    def eventA(): Unit = { 
        state.eventA()
        /* ... */
    }

    def eventB(): Unit = {
        /* ... */
    }
}

trait GameState {
    def eventA(): Unit
    def eventB(): Unit
}

class SomeState(val controller: GameController) extends GameState {
    override def eventA(): Unit = {
        /* ... */
        controller.state = new /* ... */
    }

    override def eventB(): Unit = {
        /* ... */
        controller.state = new /* ... */
    }
}
```

**Recuerde que debe testear todas las funcionalidades que implemente.**

## Git

Considerando las indicaciones de la entrega anterior, debe crear una rama llamada ``entrega-parcial-5``:

1. Utilice el comando ``git branch <branch_name>`` para crear la rama. En este caso, sería
``git branch entrega-parcial-5``.

2. Asegúrese de estar en la rama más reciente de su trabajo. Si realizó la entrega final 2 de manera correcta,
la rama en la que debería estar es ``entrega-final-2``. Use el comando ``git checkout entrega-final-2`` para
cambiarse.

*Tenga en cuenta que el cuerpo docente tiene acceso total a su repositorio.*

## Entrega

Para subir su Entrega Parcial, deberá crear un *pull request* desde la rama
``entrega-parcial-5`` a la rama ``main`` llamado ``Tarea 3 - Entrega Parcial 5``.

Es importante que **no hagan merge** de la rama ``entrega-parcial-5`` a la rama ``main`` 
para que el cuerpo docente pueda revisar su *pull request*.

Por *U-Cursos* debe entregar un único archivo llamado ``entrega-parcial-5.txt`` con el
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