package birthdayQuiz.exercises

import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.PlayerInput.readUppercase

class _09_ { // TODO rename
    static code = ''
    static String description = ''
    static Closure<Boolean> run = {
        def success = (readUppercase() == code)
        if (success) {
            openUrl win2Gif
            openUrl task09Link
        } else {
            openUrl lose2Gif
        }
        success
    }
}