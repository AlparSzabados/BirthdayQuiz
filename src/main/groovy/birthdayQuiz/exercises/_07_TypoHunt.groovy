package birthdayQuiz.exercises

import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.PlayerInput.readUppercase
import static birthdayQuiz.UrlHolder.getTaskLinks
import static birthdayQuiz.UrlHolder.getWins

class _07_TypoHunt {
    static final typos = ['one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine', 'ten']

    static String description = '''7. András szereti a lyó minőségű dolgokat. András már hetek óta szenved amiatt,
hogy fúj ez az applikáció milyen tele van helyesírási hibákkal. Nos, ezek szándékosak voltak.
Visszagörgetve (vagy akár emlékezetből) írd be az eddig talált 10 hibásan irt szót.\n'''

    static Closure<Boolean> run = {
        for (i in typos.indices) {
            println "Type word Nr. ${i + 1}"
            println 'Press Enter when ready.'
            if (readUppercase() == typos[i].toUpperCase()) {
                println 'Check!'
            } else {
                println 'Nope :p'
            }
        }
        true
        openUrl wins[0]
        openUrl taskLinks[6]
    }
}