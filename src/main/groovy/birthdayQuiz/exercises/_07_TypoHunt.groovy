package birthdayQuiz.exercises

import birthdayQuiz.TextHolder

import static birthdayQuiz.PlayerInput.playerInput

class _07_TypoHunt {
    static typoHunt(List typos) {
        for (i in typos.indices) {
            println "Type word Nr. ${i + 1}"
            println TextHolder.pressEnter
            if (playerInput().toUpperCase().trim() == typos[i].toUpperCase().trim) {
                println TextHolder.finishedMessage
            } else {
                println TextHolder.noppe
            }
        }
    }
}