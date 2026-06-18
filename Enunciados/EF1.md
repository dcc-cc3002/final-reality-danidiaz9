# Tarea 1 | Entrega Final

## Proyecto

Para guiarles en este proceso, contará con una lista de requisitos a cumplir. Cada uno de
estos requisitos deberá estar reflejado en su proyecto al momento de realizar la entrega
final.

**Recuerde que debe testear todas las funcionalidades que implemente.**

**IMPORTANTE:** El primer paso a realizar en esta entrega es corregir las implementaciones realizadas en las entregas anteriores para garantizar un buen diseño. Recuerde que en la entrega final debe estar implementado todo lo solicitado en las entregas parciales anteriores, junto con los requisitos de esta entrega.

### Método de ataque

+ Un personaje debe poder atacar a otro, cumpliendose que el daño infligido sea `attackDamage - defensePoints`.
+ Un personaje del jugador no podrá atacar sin un arma equipada. Un enemigo no necesita un arma para atacar.
    + Para testear esto pueden crear un método para equipar un arma, ignorando las restricciones del enunciado del proyecto. Veremos como hacer las restricciones más adelante.
+ Si un personaje tiene menos vida que el daño recibido, este no podrá quedar con vida negativa.

### Privacidad

+ Se debe definir la privacidad de los atributos y métodos de distintas clases, determinando cuales debiesen ser públicos, protegidos y privados.

### Inicialización de variables en constructores

+ Revise los atributos que se inicialicen en el constructor de los personajes y armas, y determine cuales debiesen ser sus valores mínimos. No se debiesen inicializar los atributos con valores que no cumplan esas condiciones.

## Git

El trabajo realizado para esta entrega se debe realizar en una nueva rama que deberá llamar ``entrega-final-1``:

1. Asegúrese de estar en la rama más reciente de su trabajo. Puede usar el comando ``git checkout <last_branch>`` para cambiarse de rama, donde `<last_branch>` es la rama de su última entrega.

2. Utilice el comando ``git branch <branch_name>`` para crear la rama. En este caso, sería
``git branch entrega-final-1``.

3. Recuede que para que su progreso pueda ser almacenado en dicha rama, debe cambiarse de rama utilizando el comando ``git checkout <branch_name>``. En este caso, sería ``git checkout entrega-final-1``.

*Tenga en cuenta que el cuerpo docente tiene acceso total a su repositorio.*

## Entrega

Para subir su Entrega Parcial, deberá crear un *pull request* desde la rama
``entrega-final-1`` a la rama ``main`` llamado ``Tarea 1 - Entrega Final``.

Es importante que **no hagan merge** de la rama ``entrega-final-1`` a la rama ``main`` 
para que el cuerpo docente pueda revisar su *pull request*.

Por *U-Cursos* debe entregar un único archivo llamado ``entrega-final-1.txt`` con el
siguiente contenido:

```
Nombre: <Nombre completo>
Pull Request: <Link del pull request>
```

No cumplir con el formato pedido de una Entrega Parcial podría llevar a no ser
considerada, y para una Entrega Final, tiene descuentos en su nota final.