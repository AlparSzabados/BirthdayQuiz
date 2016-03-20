package birthdayQuiz.exercises

import birthdayQuiz.PlayerInput

class _08_Hangman {
    static String description = ''
    static Closure<Boolean> run = {
        def word = 'apple'.toList()
        def wordOut = 'a____'.toList()
        println "you have 10 tries"

        for (counter in 1..10) {
            def contain = wordOut
            contain = checkLetter(PlayerInput.readUppercase(), word, contain)
            println contain

            if (contain == word) {
                println "check"
                return true
            }
        }
        false
    }

    static checkLetter(String letter, List<String> wordIn, List<String> wordOut) {
        def wordNew
        for (i in wordIn.indices) {
            if (letter == wordIn[i]) {
                wordOut[i] = letter
                wordNew = wordOut
            } else {
                wordNew = wordOut
            }
        }
        wordNew
    }
}