enum Room:
    case CryoChamber
    case Laboratory
    case Reactor
    case EscapePod

case class GameState(
    room: Room,
    oxygen: Int,
    inventory:Set[String]
)

enum Action:
    case InspectRoom
    case CollectKeycard
    case EnterReactor
    case CheckInventory
    case ExitGame