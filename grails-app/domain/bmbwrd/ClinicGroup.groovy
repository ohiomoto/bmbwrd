package bmbwrd

class ClinicGroup {

	String groupName

	static hasMany = [coaches: Coach, racers: Racer]

    static hasOne = [raceProgram: RaceProgram]
	
    static constraints = {
    	groupName blank: false
    	coaches blank: true
    	racers blank: true
    }

    String toString() {
    	"$groupName"
    }
}
