package birthdayQuiz.exercises

import java.time.MonthDay

import static birthdayQuiz.PlayerInput.readLowercase
import static java.time.Month.APRIL

class _07_TypoHunt {
    static final TYPOS = ['tuléltél', 'többett', 'képekböl', 'generály', 'bőlcseleteit', 'lementtetted', 'karíkázós', 'meg kapod', 'lyó', 'irt']

    static playerWords = []
    static counter = 0

    static String description = '''7. András szereti a lyó minőségű dolgokat. András már hetek óta szenved amiatt,
hogy fúj, ez az applikáció milyen tele van helyesírási hibákkal. Nos, ezek szándékosak voltak.
Visszagörgetve (vagy akár emlékezetből) írd be az eddig talált 10 hibásan irt szót.
'''

    static start = MonthDay.of(APRIL, 22)
    static link = 'https://drive.google.com/open?id=0B_z3-GYCanTKdFhBSzd1eW1YTHM'

    static Closure<Boolean> run = {
        for (i in TYPOS.indices) {
            println "Kérem a szavakat. (${i + 1})"
            println 'Nyomj egy Enter-t amikor készen állsz.'
            playerWords += readLowercase()
        }

        for (i in TYPOS.indices)
            for (j in TYPOS.indices)
                if (playerWords[i] == TYPOS[j].toLowerCase())
                    counter += 1

        println "${counter} szót találtál meg a 10-ből.\n"

        def success = (counter >= 5)
        success
    }
}