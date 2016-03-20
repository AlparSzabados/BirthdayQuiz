package birthdayQuiz.exercises

import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.PlayerInput.readUppercase
import static birthdayQuiz.TextHolder.*

class _07_TypoHunt {
    static final typos = ['one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine', 'ten']
    
    static String description = ''
    static Closure<Boolean> run = {
        for (i in typos.indices) {
            println "Type word Nr. ${i + 1}"
            println pressEnter
            if (readUppercase() == typos[i].toUpperCase()) {
                println FINISHED_MESSAGE
            } else {
                println noppe
            }
        }

        openUrl win2Gif
        openUrl task07Link
    }
}