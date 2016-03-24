package birthdayQuiz.exercises

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
            openUrl wins[0]
            openUrl taskLinks[8]
        } else {
            openUrl loses[0]
        }
        success
    }
}