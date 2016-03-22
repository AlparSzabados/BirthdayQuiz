package birthdayQuiz

class PlayerInput {
    static readLowercase() {
        def input = System.in.newReader().readLine()
        input.toLowerCase().trim()
    }
}
