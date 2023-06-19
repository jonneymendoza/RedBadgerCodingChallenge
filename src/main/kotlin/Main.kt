fun main() {


    //Get the max coordinates of the grid
    println("Generating outputs for robots")
    val marsGrid = MarsGrid(Position(5, 3))

    val generateRobotOutputsUseCase = GenerateRobotOutputsUseCase()

    //Generate the outouts based off the instructions per robot.
    //Going forward, i would probably pass an array of robots and its instructions instead of calling it per usecase.
    generateRobotOutputsUseCase(
        marsGrid = marsGrid,
        startPosition = Position(1, 1),
        orientation = Orientation.E,
        instructions = "RFRFRFRF"
    )

    generateRobotOutputsUseCase(
        marsGrid = marsGrid,
        startPosition = Position(3, 2),
        orientation = Orientation.N,
        instructions = "FRRFLLFFRRFLL"
    )

    generateRobotOutputsUseCase(
        marsGrid = marsGrid,
        startPosition = Position(0, 3),
        orientation = Orientation.W,
        instructions = "LLFFFLFLFL"
    )
}
