package birthdayQuiz.exercises

enum ExerciseRegistry {
    _01(_01_.description, _01_.run),
    _02(_02_.description, _02_.run),
    _03(_03_.description, _03_.run),
    _04(_04_.description, _04_.run),
    _05(_05_.description, _05_.run),
    _06(_06_.description, _06_.run),
    _07(_07_TypoHunt.description, _07_TypoHunt.run),
    _08(_08_Hangman.description, _08_Hangman.run),
    _09(_09_.description, _09_.run),
    _10(_10_.description, _10_.run),
    _11(_11_.description, _11_.run)

    String description
    Closure<Boolean> run
    ExerciseRegistry(String description, Closure<Boolean> run) {
        this.description = description
        this.run = run
    }
}