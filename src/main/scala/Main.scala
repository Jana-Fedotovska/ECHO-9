import scala.io.StdIn.readLine

@main def runEcho9(): Unit =

  val initialState = GameState(
    room = Room.Laboratory,
    oxygen = 85,
    inventory = Set.empty[String]
  )

  println("================================")
  println("           ECHO-9")
  println("      THE AWAKENING")
  println("================================")
  println("A.R.I.A.: Welcome back, Commander.")

  gameLoop(initialState)


def gameLoop(state: GameState): Unit =

  println("\n========== STATUS ==========")
  println(s"Location: ${state.room}")
  println(s"Oxygen: ${state.oxygen}%")

  println("\nAvailable actions:")
  println("1. Inspect room")
  println("2. Collect Keycard")
  println("3. Enter Reactor")
  println("4. Check inventory")
  println("5. Exit game")

  print("\nChoose action: ")

  val input = readLine()

  input match
    case "1" =>
      println("You are in a research laboratory.")
      gameLoop(state)

    case "2" =>
      val nextState =
        GameLogic.update(state, Action.CollectKeycard)

      if nextState == state then
        println("No Keycard collected.")
      else
        println("Keycard collected!")

      gameLoop(nextState)

    case "3" =>
      val nextState =
        GameLogic.update(state, Action.EnterReactor)

      if nextState.room == state.room then
        println("A.R.I.A.: Access denied!")
      else
        println("A.R.I.A.: Access granted!")

      gameLoop(nextState)

    case "4" =>
      println(s"Inventory: ${state.inventory}")
      gameLoop(state)

    case "5" =>
      println("A.R.I.A.: Goodbye, Commander.")

    case _ =>
      println("Unknown command.")
      gameLoop(state)