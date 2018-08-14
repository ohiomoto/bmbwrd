package bmbwrd

class Racer {

    String fullName
	String age
    String bibName
    String bibNumber
    String skillLevel
    //Boolean checkedIn

    static hasMany = [clinicGroups: ClinicGroup, racePrograms: RaceProgram]
	static belongsTo = [ClinicGroup]	

    static constraints = {
    	fullName blank: false
    	age blank: true, nullable: true
    	bibNumber blank: true, nullable: true
    	bibName blank: true, nullable: true
    	skillLevel blank: true, nullable: true, inList: ["I", "II", "III"]
    //	checkedIn ()
    	racePrograms blank: true
    	clinicGroups blank: true
    }

    static mapping = {
    	sort "bibName"
    }

    String toString() {
    	"$bibName - Age: $age - Bib: $bibNumber"
    }
}
