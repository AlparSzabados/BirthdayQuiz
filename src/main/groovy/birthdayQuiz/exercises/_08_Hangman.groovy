package birthdayQuiz.exercises

import birthdayQuiz.PlayerInput

class _08_Hangman {
    def checkLetter(String letter, List<String> wordIn, List<String> wordOut) {
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

    //    def word = 'apple'.toList() // TODO
    //    def wordOut = 'a____'.toList()
    def m(String word, String wordOut) { // TODO rename and call and test

        println "you have 10 tries"

        def counter = 0 // for loop instead or rather a range, e.g. for (counter in 1..10)
        while (counter < 10) {
            def contain = wordOut
            contain = checkLetter(PlayerInput.playerInput(), word, contain)
            println contain

            if (contain == word) {
                println "check"
                counter = 10 // break or return
            } else {
                counter++
            }
        }
    }
}