error id: file:///C:/Users/Lietotajs/Desktop/Jana/Functional%20programming/ECHO-9/src/main/scala/Main.scala:collectOxygenTank.
file:///C:/Users/Lietotajs/Desktop/Jana/Functional%20programming/ECHO-9/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: collectOxygenTank.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -GameLogic.collectOxygenTank.
	 -GameLogic.collectOxygenTank#
	 -GameLogic.collectOxygenTank().
	 -scala/Predef.GameLogic.collectOxygenTank.
	 -scala/Predef.GameLogic.collectOxygenTank#
	 -scala/Predef.GameLogic.collectOxygenTank().
offset: 212
uri: file:///C:/Users/Lietotajs/Desktop/Jana/Functional%20programming/ECHO-9/src/main/scala/Main.scala
text:
```scala
@main def runEcho9(): Unit = {
  val initialState = GameState(
    room = Room.CryoChamber,
    oxygen = 100,
    inventory = Set.empty[String]
  )

  println("=== ECHO-9 ===")


val first = GameLogic.c@@ollectOxygenTank(initialState)
val second = GameLogic.collectOxygenTank(first)

println(s"Initial oxygen: ${initialState.oxygen}%")
println(s"After first collection: ${first.oxygen}%")
println(s"After second collection: ${second.oxygen}%")
println(s"Inventory: ${second.inventory}")
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: collectOxygenTank.