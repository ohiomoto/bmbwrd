package bmbwrd

class RaceProgram {

	String programName

	static hasMany = [coaches: Coach, events: Event, groups: ClinicGroup, racers: Racer]
	static belongsTo = [Coach, Event, ClinicGroup, Racer] //gives control to these classes...

    static constraints = {
    	programName()
    	coaches blank: true
    	events blank: true
    	groups blank: true
    	racers blank: true
    }

    String toString() {
    	"$programName"
    }
}
