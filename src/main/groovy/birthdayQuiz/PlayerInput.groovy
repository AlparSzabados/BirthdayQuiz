package birthdayQuiz

class PlayerInput {
    static readUppercase() {
        def input = System.in.newReader().readLine()
        input.toUpperCase().trim()
    }
}
