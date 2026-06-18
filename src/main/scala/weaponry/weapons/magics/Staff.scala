package weaponry.weapons.magics

import characters.AbstractCharacter
import characters.player.TraitPlayer

class Staff (
            _name: String,
            _attackPoints: Int,
            _weight: Double,
            _owner: TraitPlayer = _,
            _magicAttackPoints: Int
          ) extends AbstractMagicalW (_name, _attackPoints, _weight, _owner, _magicAttackPoints) {

}