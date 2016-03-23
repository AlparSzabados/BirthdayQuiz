package birthdayQuiz.exercises

import java.time.MonthDay

import static birthdayQuiz.PlayerInput.readLowercase
import static java.time.Month.MAY

class _09_HomeDeco {
    static code = 'fészket rakok a zsebedben'
    static String description = '''9. Kérem a kódot a szigetről!
'''

    static start = MonthDay.of(MAY, 2)
    static link = 'https://drive.google.com/open?id=0B_z3-GYCanTKWnZDS3ZMT052cDg'

    static Closure<Boolean> run = {
        def success = (readLowercase() == code.toLowerCase())
        if (!success) {
            println 'Rossz kód.'
        }
        success
    }
}