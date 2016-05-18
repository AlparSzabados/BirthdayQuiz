package birthdayQuiz.exercises

import static birthdayQuiz.GenerateRandom.pickRandom
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.PlayerInput.readLowercase
import static birthdayQuiz.UrlHolder.*

class _09_HomeDeco {
    static code = 'fészket rakok a zsebedben'
    static String description = '''9. Kérem a kódot a szigetről!
'''

    static Closure<Boolean> run = {
        def success = (readLowercase() == code.toLowerCase())
        if (success) {
            openUrl pickRandom(wins)
            openUrl taskLinks[8]
        } else {
            println 'Rossz kód.'
            openUrl pickRandom(loses)
        }
        success
    }
}