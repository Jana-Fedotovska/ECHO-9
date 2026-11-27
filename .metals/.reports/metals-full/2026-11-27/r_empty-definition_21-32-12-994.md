error id: file:///C:/Users/Lietotajs/Desktop/Jana/Functional%20programming/ECHO-9/src/main/scala/GameLogic.scala:
file:///C:/Users/Lietotajs/Desktop/Jana/Functional%20programming/ECHO-9/src/main/scala/GameLogic.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -oxygen.
	 -oxygen#
	 -oxygen().
	 -scala/Predef.oxygen.
	 -scala/Predef.oxygen#
	 -scala/Predef.oxygen().
offset: 1002
uri: file:///C:/Users/Lietotajs/Desktop/Jana/Functional%20programming/ECHO-9/src/main/scala/GameLogic.scala
text:
```scala
object GameLogic:

    def moveToRoom(
        state: GameState,
        destination: Room
    ): GameState = 

        val oxygenCost = 5
    
        state.copy(
        room = destination,
        oxygen = math.max( 0, state.oxygen - oxygenCost)
    )

    def canEnter(
      state: GameState,
      destination: Room
    ): Boolean =

    destination match
      case Room.CryoChamber => true
      case Room.Laboratory  => true

      case Room.Reactor =>
        state.inventory.contains("Keycard")

      case Room.EscapePod =>
        false

    def addItem(
        state: GameState,
        item: String
    ): GameState =
        state.copy(inventory = state.inventory + item)

    def isAlive(state: GameState): Boolean =
    state.oxygen > 0

    def hasItem(
        state: GameState,
        item: String
    ): Boolean =
    state.inventory.contains(item)

    def restoreOxygen(state: GameState): GameState =
        state.copy(
        o@@xygen = math.min(100, state.oxygen + 20)
    )

    def collectOxygenTank(state: GameState): GameState =
        if hasItem(state, "Oxygen Tank") then
            state
        else
            restoreOxygen(addItem(state, "Oxygen Tank")
    )

    

```


#### Short summary: 

empty definition using pc, found symbol in pc: 