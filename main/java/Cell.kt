class Cell(){
    var isEmpty: Boolean = true
    private set

    var chip: Char = ' '
    set(value) {
        field = value
        isEmpty = false
    }

    constructor(chip: Char): this(){
        this.chip = chip
        isEmpty = false
    }

}