package birthdayQuiz.exercises

import java.time.MonthDay

enum ExerciseRegistry {
    _01(_01_MeetFriends.description, _01_MeetFriends.run, _01_MeetFriends.start, _01_MeetFriends.link),
    _02(_02_DecipherText.description, _02_DecipherText.run, _02_DecipherText.start, _02_DecipherText.link),
    _03(_03_Virus.description, _03_Virus.run, _03_Virus.start, _03_Virus.link),
    _04(_04_HiddenObjects.description, _04_HiddenObjects.run, _04_HiddenObjects.start, _04_HiddenObjects.link),
    _05(_05_NumberColoring.description, _05_NumberColoring.run, _05_NumberColoring.start, _05_NumberColoring.link),
    _06(_06_Puzzle.description, _06_Puzzle.run, _06_Puzzle.start, _06_Puzzle.link),
    _07(_07_TypoHunt.description, _07_TypoHunt.run, _07_TypoHunt.start, _07_TypoHunt.link),
    _08(_08_Hangman.description, _08_Hangman.run, _08_Hangman.start, _08_Hangman.link),
    _09(_09_HomeDeco.description, _09_HomeDeco.run, _09_HomeDeco.start, _09_HomeDeco.link),
    _10(_10_Poster.description, _10_Poster.run, _10_Poster.start, _10_Poster.link),
    _11(_11_Map.description, _11_Map.run, _11_Map.start, _11_Map.link)

    String description
    Closure<Boolean> run
    MonthDay start
    String link

    ExerciseRegistry(String description, Closure<Boolean> run, MonthDay start, String link) {
        this.description = description
        this.run = run
        this.start = start
        this.link = link
    }
}