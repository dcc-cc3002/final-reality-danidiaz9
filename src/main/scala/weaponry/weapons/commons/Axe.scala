package weaponry.weapons.commons

import characters.AbstractCharacter
import characters.player.TraitPlayer

class Axe (
          _name: String,
          _attackPoints: Int,
          _weight: Double,
          _owner: TraitPlayer = _
          ) extends AbstractCommonW (_name, _attackPoints, _weight, _owner) {

}
