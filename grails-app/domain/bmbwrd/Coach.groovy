package bmbwrd

class Coach {

    String coachName

	static hasMany = [clinicGroups: ClinicGroup, racePrograms: RaceProgram]
	static belongsTo = [ClinicGroup] // RaceProgram] //gives control to race program

    static constraints = {
    	coachName blank: false
    	clinicGroups blank: true
    	racePrograms blank: true
    } 

    String toString() {
    	"$coachName"
    }
}
