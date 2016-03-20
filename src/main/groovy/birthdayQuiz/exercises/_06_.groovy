package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl

class _06_ { // TODO rename
    static String description = ''
    static Closure<Boolean> run = {
        def success = (fileCount(ROOT_FOLDER, 'Ex06', '.docx') == 3)
        if (success) {
            openUrl win3Gif
            openUrl task06Link
        } else {
            openUrl lose3Gif
        }
        success
    }
}