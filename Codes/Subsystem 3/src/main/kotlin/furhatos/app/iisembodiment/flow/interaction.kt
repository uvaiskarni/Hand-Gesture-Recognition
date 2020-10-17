package furhatos.app.iisembodiment.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.app.iisembodiment.nlu.*
import furhatos.gestures.Gestures

/* This is an interactive state.
* The Introduction State (general.kt) is passed
* as parameter to the state definition.
* The Start state inherits Greetings state*/
val Start : State = state(Greetings) {

    onEntry {
        furhat.ask("Hi there. Show me some hand gesture?")
    }

    onResponse<OpenPalm>{
        furhat.gesture(Gestures.Nod(duration=2.0, strength = 1.0))
        furhat.ask("hellooo!")
    }

    onResponse<OpenDorsal>{
        furhat.gesture(Gestures.ExpressAnger(duration=2.0, strength = 1.0))
        furhat.ask("You can't see me!")
    }

    onResponse<FistPalm>{
        furhat.gesture(Gestures.Shake(duration=2.0, strength = 1.0))
        furhat.ask("Rebellion never goes without consequences!")
    }

    onResponse<FistDorsal>{
        furhat.gesture(Gestures.OpenEyes(duration=2.0, strength = 1.0))
        furhat.ask("Ready to fight?")
    }

    onResponse<ThreeFingerPalm>{
        furhat.gesture(Gestures.BigSmile(duration=2.0, strength = 1.0))
        furhat.ask("Hurry up, let’s party!")
    }

    onResponse<ThreeFingerDorsal>{
        furhat.gesture(Gestures.ExpressDisgust(duration=2.0, strength = 1.0))
        furhat.ask("Sorry that’s rude!")

    }

    onNoResponse { // Catches silence
        furhat.ask("I'm still waiting for hand gesture")
    }
}
