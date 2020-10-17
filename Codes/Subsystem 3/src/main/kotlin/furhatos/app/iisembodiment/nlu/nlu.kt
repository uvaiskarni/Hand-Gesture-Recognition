package furhatos.app.iisembodiment.nlu

import furhatos.nlu.ComplexEnumEntity
import furhatos.nlu.EnumEntity
import furhatos.nlu.Intent
import furhatos.nlu.ListEntity
import furhatos.nlu.common.Number
import furhatos.util.Language


/* Define Drink Entity
* This is an enumeration of all the possible strings
* that correspond to drinks in a coffee shop.*/
class Drink : EnumEntity(stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf("coffee", "water")
    }
}

class OpenPalm : EnumEntity(stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf("one", "open palm")
    }
}

class OpenDorsal : EnumEntity(stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf("two", "open dorsal")
    }
}

class FistPalm : EnumEntity(stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf("three", "fist palm")
    }
}

class FistDorsal : EnumEntity(stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf("four", "fist dorsal")
    }
}

class ThreeFingerPalm : EnumEntity(stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf("five", "three finger palm")
    }
}

class ThreeFingerDorsal : EnumEntity(stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf("six", "three finger dorsal")
    }
}