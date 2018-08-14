package bmbwrd

class Event {

	String eventName
	RaceProgram raceProgram
    Date eventDate

	//static BelongsTo = RaceProgram //gives control to race program...probably nnt what I want though I might want to cascade deletes???

    static hasMany = [attendees: Racer] //implement a "Chech In" feature to add attendiees to each event...mabey do the same for coaches??

    static constraints = {
    	eventName()
    	raceProgram blank: true
        eventDate blank: true
        attendees blank: true
    }

    String toString(){
    	"$eventName"
    }
}
