package myapp

class Model {

	String name
	
	static belongsTo = [make: Make]

    static constraints = {
    }
	
	String toString() {
		name
	}
}
