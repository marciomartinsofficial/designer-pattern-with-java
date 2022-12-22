package Builder01;

public class AssemblyInstructions {

	private String assemblyEngine;
	
	private String assemblyBodywork;
	
	private String assemblyWhells;
	
	private String assemblySeats;

	public String getAssemblyEngine() {
		return assemblyEngine;
	}

	public void setAssemblyEngine(String assemblyEngine) {
		this.assemblyEngine = assemblyEngine;
	}

	public String getAssemblyBodywork() {
		return assemblyBodywork;
	}

	public void setAssemblyBodywork(String assemblyBodywork) {
		this.assemblyBodywork = assemblyBodywork;
	}

	public String getAssemblyWhells() {
		return assemblyWhells;
	}

	public void setAssemblyWhells(String assemblyWhells) {
		this.assemblyWhells = assemblyWhells;
	}

	public String getAssemblySeats() {
		return assemblySeats;
	}

	public void setAssemblySeats(String assemblySeats) {
		this.assemblySeats = assemblySeats;
	}

	@Override
	public String toString() {
		return "AssemblyInstructions [assemblyEngine=" + assemblyEngine + ", assemblyBodywork=" + assemblyBodywork
				+ ", assemblyWhells=" + assemblyWhells + ", assemblySeats=" + assemblySeats + "]";
	}
	
}
