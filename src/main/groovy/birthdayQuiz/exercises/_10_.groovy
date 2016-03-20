package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl

class _10_ { // TODO rename
    static String description = ''
    static Closure<Boolean> run = {
        def success = (fileCount(ROOT_FOLDER, 'Ex10', '.jpeg') == 1)
        if (success) {
            openUrl win1Gif
            openUrl task010Link
        } else {
            openUrl lose2Gif
        }
        success
    }
}