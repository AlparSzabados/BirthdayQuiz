package birthdayQuiz

import groovy.xml.MarkupBuilder

import static birthdayQuiz.FolderHolder.*
import static XmlMaker.Status.*

class XmlMaker {
    enum Status {
        FINISHED, NOT_FINISHED
    }

    static createXml() {
        def sw = new StringWriter()
        def xml = new MarkupBuilder(sw).birthdayQuiz() {
            exercises() {
                exercise1(NOT_FINISHED)
                exercise2(NOT_FINISHED)
                exercise3(NOT_FINISHED)
                exercise4(NOT_FINISHED)
                exercise5(NOT_FINISHED)
                exercise6(NOT_FINISHED)
                exercise7(NOT_FINISHED)
                exercise8(NOT_FINISHED)
                exercise9(NOT_FINISHED)
                exercise10(NOT_FINISHED)
                exercise11(NOT_FINISHED)
            }
            sw.write()
            checker << sw
            checker << ' </birthdayQuiz>' //TODO findout why it's not closing...
        }
    }
}