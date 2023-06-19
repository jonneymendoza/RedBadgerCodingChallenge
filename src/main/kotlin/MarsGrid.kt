class MarsGrid (private val maxCoordinates: Position) {
    private val scentedPositions = mutableSetOf<Position>()

    fun isOffGrid(position: Position): Boolean {
        return position.x < 0 || position.y < 0 || position.x > maxCoordinates.x || position.y > maxCoordinates.y
    }

    fun hasScent(position: Position): Boolean {
        return scentedPositions.contains(position)
    }

    fun addScent(position: Position) {
        scentedPositions.add(position)
    }
}