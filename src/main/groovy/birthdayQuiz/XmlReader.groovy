package birthdayQuiz

import static birthdayQuiz.FolderHolder.getChecker

class XmlReader {
    static strg = checker.text    // TODO rename
    static birthdayQuiz = new XmlSlurper().parseText(strg)

    private static exercises = birthdayQuiz.exercises
    static final EXERCISE_DONE = [1 : exercises.exercise1,
                                  2 : exercises.exercise2,
                                  3 : exercises.exercise3,
                                  4 : exercises.exercise4,
                                  5 : exercises.exercise5,
                                  6 : exercises.exercise6,
                                  7 : exercises.exercise7,
                                  8 : exercises.exercise8,
                                  9 : exercises.exercise9,
                                  10: exercises.exercise10,
                                  11: exercises.exercise11]
}