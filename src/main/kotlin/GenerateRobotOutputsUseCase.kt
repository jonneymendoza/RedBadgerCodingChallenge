class GenerateRobotOutputsUseCase {
    operator fun invoke(
        marsGrid: MarsGrid,
        startPosition: Position,
        orientation: Orientation,
        instructions: String
    ) {

        val robot = Robot(startPosition, orientation, false)

        for (instruction in instructions) {
            when (instruction) {
                'L' -> robot.orientation = robot.orientation.turnLeft()
                'R' -> robot.orientation = robot.orientation.turnRight()
                'F' -> {
                    val newPosition = robot.orientation.moveForward(robot.position)
                    if (marsGrid.isOffGrid(newPosition)) {
                        if (!marsGrid.hasScent(robot.position)) {
                            robot.lost = true
                            marsGrid.addScent(robot.position)
                            break
                        }
                    } else {
                        robot.position = newPosition
                    }
                }
            }
        }

        val output = "${robot.position.x} ${robot.position.y} ${robot.orientation}"
        if (robot.lost) {
            println("$output LOST")
        } else {
            println(output)
        }
    }
}