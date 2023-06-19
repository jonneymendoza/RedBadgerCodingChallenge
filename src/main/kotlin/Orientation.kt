enum class Orientation {
    N, E, S, W;

    fun turnLeft(): Orientation {
        return values()[(ordinal + 3) % 4]
    }

    fun turnRight(): Orientation {
        return values()[(ordinal + 1) % 4]
    }

    fun moveForward(position: Position): Position {
        return when (this) {
            N -> Position(position.x, position.y + 1)
            E -> Position(position.x + 1, position.y)
            S -> Position(position.x, position.y - 1)
            W -> Position(position.x - 1, position.y)
        }
    }
}