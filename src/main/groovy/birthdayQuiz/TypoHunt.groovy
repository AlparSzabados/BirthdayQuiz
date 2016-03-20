package birthdayQuiz

import static birthdayQuiz.PlayerInput.*
import static birthdayQuiz.TextHolder.*

class TypoHunt {
    static typoHunt(List typos) {
        for (i in typos.indices) {
            println "Type word Nr. ${i + 1}"
            println pressEnter
            if (playerInput().toUpperCase().toString() == typos[i].toUpperCase()) {
                println finishedMessage
            } else {
                println noppe
            }
        }
    }
}