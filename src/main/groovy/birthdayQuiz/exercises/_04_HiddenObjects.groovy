package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.UrlHolder.*

class _04_HiddenObjects {
    static String description = '''4. András imád takaritani és ő mindig rendet tart és nála soha sincs rendetlenség és ő jó és szép!– Yeah right!
Mentsd el az állatok bőlcseleteit tartalmazó docx-et a BirthdayQuiz folderbe s akkor mondom tovább a feladatot!\n'''

    static Closure<Boolean> run = {
        def success = (fileCount(ROOT_FOLDER, 'Ex04', '.docx') == 1)
        if (success) {
            openUrl wins[0]
            openUrl taskLinks[3]
        } else {
            sleep(10000)
            println 'No files found, have a GIF-t.'
            openUrl loses[0]
        }
        success
    }
}