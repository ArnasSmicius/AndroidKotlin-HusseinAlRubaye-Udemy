enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun main(args: Array<String>) {
    var userDirection = Direction.SOUTH
    when (userDirection) {
        Direction.NORTH -> println("User went to North")
        Direction.EAST -> println("User went to East")
        Direction.SOUTH -> println("User went to South")
        Direction.WEST -> println("User went to West")
    }
}