package birthdayQuiz.exercises

enum ExerciseRegistry {
    _01(_01_MeetFriends.description, _01_MeetFriends.run),
    _02(_02_DecipherText.description, _02_DecipherText.run),
    _03(_03_Virus.description, _03_Virus.run),
    _04(_04_HiddenObjects.description, _04_HiddenObjects.run),
    _05(_05_NumberColoring.description, _05_NumberColoring.run),
    _06(_06_Puzzle.description, _06_Puzzle.run),
    _07(_07_TypoHunt.description, _07_TypoHunt.run),
    _08(_08_Hangman.description, _08_Hangman.run),
    _09(_09_HomeDeco.description, _09_HomeDeco.run),
    _10(_10_Poster.description, _10_Poster.run),
    _11(_11_Map.description, _11_Map.run)

    String description
    Closure<Boolean> run

    ExerciseRegistry(String description, Closure<Boolean> run) {
        this.description = description
        this.run = run
    }
}