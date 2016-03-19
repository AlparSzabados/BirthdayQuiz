package birthdayQuiz

import static birthdayQuiz.FolderHolder.*

class XmlReader {
    static strg = checker.text
    static birthdayQuiz = new XmlSlurper().parseText(strg)

    static EXERCISE_DONE = [1 : birthdayQuiz.exercises.exercise1,
                            2 : birthdayQuiz.exercises.exercise2,
                            3 : birthdayQuiz.exercises.exercise3,
                            4 : birthdayQuiz.exercises.exercise4,
                            5 : birthdayQuiz.exercises.exercise5,
                            6 : birthdayQuiz.exercises.exercise6,
                            7 : birthdayQuiz.exercises.exercise7,
                            8 : birthdayQuiz.exercises.exercise8,
                            9 : birthdayQuiz.exercises.exercise9,
                            10: birthdayQuiz.exercises.exercise10,
                            11: birthdayQuiz.exercises.exercise11]
}


