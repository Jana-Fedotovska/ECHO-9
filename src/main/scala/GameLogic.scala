object GameLogic:

    def moveToRoom(
        state: GameState,
        destination: Room
    ): GameState = 
    if canEnter(state, destination) then
        state.copy(
        room = destination,
        oxygen = math.max(0, state.oxygen - 5)
        )
    else
        state
        

    def canEnter(
        state: GameState,
        destination: Room
    ): Boolean =

        destination match
        case Room.CryoChamber => true
        case Room.Laboratory  => true

        case Room.Reactor =>
            hasItem(state, "Keycard") && state.oxygen >= 20

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
        oxygen = math.min(100, state.oxygen + 20)
    )

    def collectOxygenTank(state: GameState): GameState =
        if hasItem(state, "Oxygen Tank") then
            state
        else
            restoreOxygen(addItem(state, "Oxygen Tank")
    )

    def update(
        state: GameState,
        action: Action
    ): GameState =
        action match
            case Action.CollectKeycard =>
                if state.room == Room.Laboratory then
                    addItem(state, "Keycard")
                else
                    state

            case Action.EnterReactor =>
                moveToRoom(state, Room.Reactor)

            case _ =>
                state
