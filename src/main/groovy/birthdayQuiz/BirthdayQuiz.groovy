package birthdayQuiz

import java.time.Month
import java.time.MonthDay

import static java.awt.Desktop.desktop

class BirthdayQuiz {
    static ALLOWED_DATES = [1: MonthDay.of(Month.MARCH, 13)]

    static isExerciseAllowed(int id) { /* TODO move to separate class */
        def startDate = ALLOWED_DATES[id]
        startDate && (MonthDay.now() >= startDate)
    }

    static openUrl(String url) { /* TODO move to separate class */
        desktop.browse(new URI(url))
    }

    static fileCount(File folder, String extension) { /* TODO move to separate class */
        folder.listFiles().count { file ->
            file.name.endsWith(extension)
        }
    }

    static void main(String... args) {
        /* this is the starting point of the application */
    }
}
